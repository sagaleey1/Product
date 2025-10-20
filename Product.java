public class Product {
        // attributes
        private String id;
        private String name;
        private double price;
        private double discount;

        // constructor
        public Product (String id, String name, double price, double discount) {
            this.id = id;
            this.name = name;
            this.price = price;
            this.discount = discount;
        }
        // Get
        public String getId(){
            return id;
        }
        public String getName(){
            return name;
        }
        public double getPrice(){
            return price;
        }
        public double getDiscount(){
            return discount;
        }

        // price after discount
        public double priceAfterDiscount(){
            return price - (price * (discount/100));
                

        }
        // final price after vat
        public double finalPrice() {
            double AfterDiscount = priceAfterDiscount();
            double vat = AfterDiscount * 0.05;
            return AfterDiscount + vat;
        }
        
        // main method
        public static void main (String[] args){
            Product p1 = new Product("P101", "Laptop", 500.0, 10);
            Product p2 = new Product("P202", "Phone", 300.0, 15);


            // product 1
            System.out.println("Product 1:"+ p1.getName());
            System.out.println("Original Price: $"+ p1.getPrice());
            System.out.println("Price After" + p1.getDiscount()+" % Discount: $"+ p1.priceAfterDiscount());
            System.out.println("Final price with 5% vat:$" + p1.finalPrice());
        
            // product 2
            System.out.println("Product 2:"+ p2.getName());
            System.out.println("Original Price: "+ p2.getPrice());
            System.out.println("Price After"+ p2.getDiscount() + "  Discount:  "+ p2.priceAfterDiscount());
            System.out.println("Final price with 5% vat: " + p2.finalPrice());
            


        }



    }



