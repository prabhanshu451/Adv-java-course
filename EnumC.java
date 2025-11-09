enum Laptop {
    DELL(2000), HP(1500), ASUS(2500), ACER(1000);

    private int price;
    Laptop(int price) {
        this.price = price; 
        // basicaly we created the constructor for enum
        // note that enum constructor is always private
        // if we do not write private it will be considered as private only 
        // we cannot create public or protected constructor for enum because enum is final in nature
        // so, now make getter for price
        
    }
        public int getPrice() {
            return this.price;
        }
        public void setPrice(int price) {
            this.price = price;
        }
}



public class EnumC {
    public static void main(String[] args) {
        Laptop L = Laptop.DELL;
        System.out.println("Laptop: " + L + ", Price: $" + L.getPrice());


        for(Laptop lap : Laptop.values()) {
            System.out.println(lap + " costs $" + lap.getPrice());
        }
    }
}
