package com.Ecommerce.GQT.programs;

import java.util.Scanner;

public class MainApp {

    // ================= COLORS =================
	public static final String RESET   = "\u001B[0m";
	public static final String RED     = "\u001B[31m";
	public static final String GREEN   = "\u001B[32m";
	public static final String YELLOW  = "\u001B[33m";
	public static final String BLUE    = "\u001B[34m";
	public static final String MAGENTA = "\u001B[35m";
	public static final String CYAN    = "\u001B[36m";
	public static final String ORANGE  = "\u001B[38;5;208m";
	
	// ================= SUB-CATEGORY COLORS =================
    static final String[][] SUB_COLORS = {

        // Electronics
        { RED, GREEN, YELLOW, BLUE },

        // Fashion
        { MAGENTA, CYAN, ORANGE, RED },

        // Home
        { GREEN, YELLOW, BLUE, MAGENTA },

        // Beauty
        { CYAN, ORANGE, RED, GREEN },

        // Groceries
        { YELLOW, BLUE, MAGENTA, CYAN }
    };

    static final String[] COLORS = {
        RED, GREEN, YELLOW, BLUE, MAGENTA, CYAN, ORANGE
    };

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Cart cart = new Cart();

        // ================= MAIN CATEGORIES =================
        String[] mainCat = {
            "Electronics", "Fashion", "Home", "Beauty", "Groceries"
        };
     
        // ================= SUB CATEGORIES =================
        String[][] subCat = {
                {"Mobiles", "Laptops", "Headphones", "Cameras"},
                {"Men Wear", "Women Wear", "Footwear", "Watches"},
                {"Kitchen", "Cleaning", "Furniture", "Storage"},
                {"Skincare", "Haircare", "Makeup", "Perfume"},
                {"Snacks", "Beverages", "Staples", "Fruits"}
            };
     

        // ================= PRODUCTS (10 EACH) =================
        Product[][][] products = {

            // ================= ELECTRONICS =================
            {
                {   // Mobiles
                    new Product("iPhone 14","Apple","128GB",70000,""),
                    new Product("Samsung S23","Samsung","5G",65000,""),
                    new Product("OnePlus 11","OnePlus","Snapdragon",60000,""),
                    new Product("Pixel 7","Google","Tensor",58000,""),
                    new Product("Vivo X90","Vivo","Zeiss",55000,""),
                    new Product("Oppo Find X","Oppo","AMOLED",52000,""),
                    new Product("Realme GT","Realme","Gaming",45000,""),
                    new Product("Moto Edge","Motorola","OLED",40000,""),
                    new Product("Redmi Note 12","Xiaomi","Value",25000,""),
                    new Product("Nokia G42","Nokia","Clean UI",22000,"")
                },
                {   // Laptops
                    new Product("MacBook Air","Apple","M1",90000,""),
                    new Product("HP Pavilion","HP","i5",70000,""),
                    new Product("Dell Inspiron","Dell","i7",80000,""),
                    new Product("Lenovo ThinkPad","Lenovo","Business",75000,""),
                    new Product("Asus VivoBook","Asus","Slim",65000,""),
                    new Product("Acer Aspire","Acer","SSD",60000,""),
                    new Product("MSI GF63","MSI","Gaming",85000,""),
                    new Product("Samsung Book","Samsung","OLED",78000,""),
                    new Product("Realme Book","Realme","Light",55000,""),
                    new Product("Honor Magic","Honor","Premium",72000,"")
                },
                {   // Headphones
                    new Product("Sony XM5","Sony","ANC",30000,""),
                    new Product("Bose QC45","Bose","Premium",32000,""),
                    new Product("JBL 760NC","JBL","Bass",12000,""),
                    new Product("Boat Rockerz","Boat","Wireless",4000,""),
                    new Product("Sennheiser 450","Sennheiser","HD",18000,""),
                    new Product("Skullcandy","Skullcandy","Bass",7000,""),
                    new Product("OnePlus Buds","OnePlus","ANC",11000,""),
                    new Product("Realme Buds","Realme","Value",5000,""),
                    new Product("AirPods","Apple","Spatial",25000,""),
                    new Product("Noise Buds","Noise","Budget",3500,"")
                },
                {   // Cameras
                    new Product("Canon 1500D","Canon","DSLR",45000,""),
                    new Product("Nikon D3500","Nikon","DSLR",48000,""),
                    new Product("Sony A7","Sony","Mirrorless",120000,""),
                    new Product("Fujifilm XT30","Fujifilm","4K",90000,""),
                    new Product("GoPro Hero 12","GoPro","Action",42000,""),
                    new Product("DJI Pocket","DJI","Stabilized",35000,""),
                    new Product("Lumix","Panasonic","Video",70000,""),
                    new Product("Canon M50","Canon","Vlog",65000,""),
                    new Product("Sony ZV-E10","Sony","Creator",80000,""),
                    new Product("Insta360","Insta360","360",45000,"")
                }
            },

            // ================= FASHION =================
            {
                {
                    new Product("Men T-Shirt","Puma","Cotton",999,""),
                    new Product("Men Shirt","Levis","Casual",1499,""),
                    new Product("Men Jeans","Wrangler","Denim",1999,""),
                    new Product("Men Jacket","Roadster","Winter",2999,""),
                    new Product("Men Hoodie","Nike","Warm",2499,""),
                    new Product("Men Kurta","Manyavar","Ethnic",1799,""),
                    new Product("Men Blazer","Raymond","Formal",4999,""),
                    new Product("Men Track Pant","Adidas","Sports",1999,""),
                    new Product("Men Shorts","HRX","Gym",1299,""),
                    new Product("Men Sweater","Allen Solly","Wool",2299,"")
                },
                {
                    new Product("Women Saree","Biba","Silk",2999,""),
                    new Product("Women Kurti","W","Cotton",1499,""),
                    new Product("Women Dress","Zara","Party",3499,""),
                    new Product("Women Top","H&M","Casual",1299,""),
                    new Product("Women Jeans","Levis","Slim",2199,""),
                    new Product("Women Skirt","Forever21","Fashion",1799,""),
                    new Product("Women Jacket","ONLY","Winter",2999,""),
                    new Product("Women Palazzo","FabIndia","Ethnic",1999,""),
                    new Product("Women Dupatta","Biba","Cotton",899,""),
                    new Product("Women Night Suit","Zudio","Comfort",1599,"")
                },
                {
                    new Product("Sports Shoes","Nike","Running",4999,""),
                    new Product("Casual Shoes","Puma","Daily",3999,""),
                    new Product("Formal Shoes","Bata","Office",2999,""),
                    new Product("Sandals","Relaxo","Comfort",1999,""),
                    new Product("Slippers","Adidas","Slides",1499,""),
                    new Product("Sneakers","RedTape","Trendy",3499,""),
                    new Product("Loafers","Woodland","Leather",4599,""),
                    new Product("Boots","Woodland","Outdoor",5999,""),
                    new Product("FlipFlops","Sparx","Beach",999,""),
                    new Product("School Shoes","Bata","Kids",1999,"")
                },
                {
                    new Product("Analog Watch","Titan","Leather",4999,""),
                    new Product("Digital Watch","Casio","Sports",2999,""),
                    new Product("Smart Watch","Noise","Bluetooth",3999,""),
                    new Product("Luxury Watch","Fossil","Premium",8999,""),
                    new Product("Women Watch","Guess","Fashion",6999,""),
                    new Product("Kids Watch","Zoop","Colorful",1999,""),
                    new Product("Chronograph","Diesel","Stylish",10999,""),
                    new Product("Fitness Band","Mi","Health",2499,""),
                    new Product("Apple Watch","Apple","Series 9",41999,""),
                    new Product("Samsung Watch","Samsung","Pro",37999,"")
                }
            },

            // ================= HOME =================
            {
                {
                    new Product("Mixer Grinder","Bajaj","500W",2499,""),
                    new Product("Pressure Cooker","Prestige","5L",2999,""),
                    new Product("Gas Stove","Butterfly","3 Burner",3999,""),
                    new Product("Electric Kettle","Philips","1.5L",1999,""),
                    new Product("Rice Cooker","Panasonic","Auto",3499,""),
                    new Product("Induction Stove","Prestige","Touch",4599,""),
                    new Product("Toaster","Morphy","2 Slice",1799,""),
                    new Product("OTG Oven","IFB","30L",9999,""),
                    new Product("Juicer","Sujata","900W",5499,""),
                    new Product("Coffee Maker","Nescafe","Auto",2999,"")
                },
                {
                    new Product("Vacuum Cleaner","Philips","Dry",7999,""),
                    new Product("Mop","ScotchBrite","Spin",2499,""),
                    new Product("Broom","Gala","Plastic",499,""),
                    new Product("Detergent","Surf Excel","Liquid",899,""),
                    new Product("Floor Cleaner","Harpic","Floral",299,""),
                    new Product("Dish Wash","Vim","Gel",249,""),
                    new Product("Trash Bin","Cello","Plastic",1299,""),
                    new Product("Scrubber","ScotchBrite","Steel",199,""),
                    new Product("Wiper","Gala","Rubber",599,""),
                    new Product("Room Freshener","Odonil","Lavender",249,"")
                },
                {
                    new Product("Sofa","Godrej","3 Seater",25999,""),
                    new Product("Dining Table","Nilkamal","6 Seater",18999,""),
                    new Product("Chair","Ikea","Wood",4999,""),
                    new Product("Bed","Wakefit","Queen",22999,""),
                    new Product("Mattress","Sleepyhead","Memory Foam",15999,""),
                    new Product("Study Table","Ikea","Compact",6999,""),
                    new Product("Wardrobe","Godrej","Steel",17999,""),
                    new Product("Bookshelf","Nilkamal","Plastic",4999,""),
                    new Product("TV Unit","Urban Ladder","Modern",12999,""),
                    new Product("Shoe Rack","HomeTown","Wood",5999,"")
                },
                {
                    new Product("Plastic Box","Cello","Large",799,""),
                    new Product("Steel Rack","Godrej","5 Tier",6999,""),
                    new Product("Cloth Basket","Nilkamal","Round",999,""),
                    new Product("Storage Jar","Milton","Set",1499,""),
                    new Product("Tool Box","Stanley","Heavy",2499,""),
                    new Product("Drawer Unit","Ikea","Plastic",3499,""),
                    new Product("Shoe Box","Cello","Pack",1299,""),
                    new Product("Laundry Box","Usha","Large",1999,""),
                    new Product("Wall Shelf","HomeTown","Wood",4999,""),
                    new Product("Trunk","VIP","Travel",3999,"")
                }
            },
            // ================= BEAUTY =================
            {
                { // Skincare
                    new Product("Face Wash","Nivea","Oil Control",299,""),
                    new Product("Moisturizer","Cetaphil","Dry Skin",499,""),
                    new Product("Sunscreen","Neutrogena","SPF 50",599,""),
                    new Product("Face Serum","Mamaearth","Vitamin C",699,""),
                    new Product("Night Cream","Olay","Repair",799,""),
                    new Product("Face Mask","Plum","Green Tea",399,""),
                    new Product("Toner","Minimalist","PHA",499,""),
                    new Product("Scrub","St.Ives","Apricot",449,""),
                    new Product("Under Eye Cream","Lakme","Hydrating",599,""),
                    new Product("Face Gel","Ponds","Light",299,"")
                },
                { // Haircare
                    new Product("Shampoo","Head & Shoulders","Anti Dandruff",399,""),
                    new Product("Conditioner","Dove","Smooth",399,""),
                    new Product("Hair Oil","Indulekha","Ayurvedic",699,""),
                    new Product("Hair Mask","WOW","Repair",599,""),
                    new Product("Serum","Livon","Shine",299,""),
                    new Product("Hair Spray","TRESemme","Hold",499,""),
                    new Product("Dry Shampoo","Batiste","Instant",649,""),
                    new Product("Hair Cream","Garnier","Style",249,""),
                    new Product("Onion Oil","Mamaearth","Growth",599,""),
                    new Product("Anti Hairfall Kit","WOW","Combo",1299,"")
                },
                { // Makeup
                    new Product("Lipstick","Lakme","Matte",499,""),
                    new Product("Foundation","Maybelline","Fit Me",699,""),
                    new Product("Compact","Faces","Oil Control",399,""),
                    new Product("Mascara","L'Oreal","Volume",599,""),
                    new Product("Eyeliner","Lakme","Black",299,""),
                    new Product("Blush","Swiss Beauty","Pink",349,""),
                    new Product("Concealer","Maybelline","Instant",599,""),
                    new Product("Highlighter","Mars","Glow",399,""),
                    new Product("BB Cream","Ponds","Natural",249,""),
                    new Product("Makeup Kit","Blue Heaven","Combo",1299,"")
                },
                { // Perfume
                    new Product("Perfume","Fogg","Fresh",499,""),
                    new Product("Perfume","Denver","Classic",399,""),
                    new Product("Perfume","Skinn","Premium",1999,""),
                    new Product("Perfume","Bella Vita","Luxury",999,""),
                    new Product("Perfume","Engage","Men",699,""),
                    new Product("Perfume","Plum","Vanilla",899,""),
                    new Product("Perfume","Wild Stone","Edge",499,""),
                    new Product("Perfume","Layer'r","Shot",399,""),
                    new Product("Perfume","Park Avenue","Good Morning",699,""),
                    new Product("Perfume","Armaf","Club De Nuit",3499,"")
                }
            },
         // ================= GROCERIES =================
            {
                { // Snacks
                    new Product("Chips","Lays","Salted",20,""),
                    new Product("Biscuits","Good Day","Butter",30,""),
                    new Product("Cookies","Hide & Seek","Choco",35,""),
                    new Product("Popcorn","ACT II","Butter",40,""),
                    new Product("Namkeen","Haldiram","Aloo Bhujia",60,""),
                    new Product("Chocolates","Dairy Milk","Silk",160,""),
                    new Product("Energy Bar","Yoga Bar","Protein",50,""),
                    new Product("Nachos","Doritos","Cheese",90,""),
                    new Product("Cup Noodles","Maggi","Masala",60,""),
                    new Product("Cake","Britannia","Little Hearts",40,"")
                },
                { // Beverages
                    new Product("Soft Drink","Coca Cola","750ml",40,""),
                    new Product("Soft Drink","Pepsi","750ml",40,""),
                    new Product("Juice","Real","Orange",110,""),
                    new Product("Juice","Tropicana","Apple",120,""),
                    new Product("Energy Drink","Red Bull","250ml",125,""),
                    new Product("Cold Coffee","Bru","Bottle",60,""),
                    new Product("Milk","Amul","1L",60,""),
                    new Product("Butter Milk","Heritage","500ml",25,""),
                    new Product("Lassi","Mother Dairy","Mango",30,""),
                    new Product("Mineral Water","Bisleri","1L",20,"")
                },
                { // Staples
                    new Product("Rice","India Gate","Basmati",120,""),
                    new Product("Wheat Flour","Aashirvaad","5Kg",260,""),
                    new Product("Sugar","Trust","1Kg",50,""),
                    new Product("Salt","Tata","Iodized",20,""),
                    new Product("Dal","Tata Sampann","Toor",140,""),
                    new Product("Oil","Fortune","Sunflower",180,""),
                    new Product("Ghee","Amul","Pure",520,""),
                    new Product("Tea","Tata Tea","Gold",140,""),
                    new Product("Coffee","Bru","Instant",180,""),
                    new Product("Spices","MDH","Garam Masala",90,"")
                },
                { // Fruits
                    new Product("Apple","Kashmir","Fresh",180,""),
                    new Product("Banana","Robusta","Fresh",60,""),
                    new Product("Orange","Nagpur","Juicy",80,""),
                    new Product("Grapes","Green","Seedless",90,""),
                    new Product("Pomegranate","Anar","Red",160,""),
                    new Product("Mango","Alphonso","Sweet",220,""),
                    new Product("Papaya","Local","Ripe",50,""),
                    new Product("Watermelon","Fresh","Big",40,""),
                    new Product("Pineapple","Kerala","Sweet",70,""),
                    new Product("Strawberry","Ooty","Fresh",120,"")
                }
            }

            
        };

        
     // ================= MENU =================
        // ================= MAIN LOOP ================= 
        while (true) { 
            
            System.out.println(MAGENTA  + "\n===== E-COMMERCE APP =====" + RESET); 
            System.out.println(BLUE  + "1. Electronics " + RESET); 
            System.out.println(RED   + "2. Fashion"   + RESET); 
            System.out.println(ORANGE + "3. Home" + RESET); 
            System.out.println(GREEN   + "4.Beauty"  + RESET);
            System.out.println(BLUE  + "5.Groceries"  + RESET); 
            System.out.println(GREEN  + "6. Checkout"  + RESET); 
            System.out.println(RED  + "7. Exit" + RESET); 
             
            System.out.print("\nEnter your choice: "); 
            int choice = sc.nextInt(); 

                if(choice == mainCat.length + 2) {
                    System.out.println("Exiting... Thank you for shopping!");
                    break;
                }

                if(choice == mainCat.length + 1) {
                    cart.checkout();
                    continue;
                }

                int m = choice - 1;
                System.out.println("\n-- " + mainCat[m] + " --");

                for (int s = 0; s < subCat[m].length; s++) {
                    System.out.println(
                        SUB_COLORS[m][s] + (s + 1) + ". " + subCat[m][s] + RESET
                    );
                }

                int scn = sc.nextInt() - 1;
                
            
                for (int p = 0; p < products[m][scn].length; p++) {
                String c = COLORS[p % COLORS.length];  
                System.out.print(c + (p + 1) + ". ");
                products[m][scn][p].display();
                System.out.print(RESET);
            }


            System.out.print("Add product (0 to back): ");
            int pn = sc.nextInt();
            if (pn > 0) cart.add(products[m][scn][pn - 1]);
        }
    }
}
