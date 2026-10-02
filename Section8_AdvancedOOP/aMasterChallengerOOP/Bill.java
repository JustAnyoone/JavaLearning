// package Section8_AdvancedOOP.aMasterChallengerOOP;

// public class Bill {

//     private Burger burguer;
//     private Drink drink;
//     private SideItem sideItem;

//     public Bill() {
//         this.burguer = new Burger();
//         this.drink = new Drink();
//         this.sideItem = new SideItem();
//     }

//     public Bill(Burger burguer, Drink drink, SideItem sideItem) {
//         this.burguer = new Burger();
//         this.drink = new Drink();
//         this.sideItem = new SideItem();
//     }

//     public void totalBill(double priceBurger, double priceDrink, double priceSideItem){
//         double totalPrice = priceBurger + priceDrink + priceSideItem;
//         System.out.println("The total price of the three values is :" + totalPrice);
//     }

//     public void ShowMeal(){
//         System.out.println(burguer + ", " + drink + ", " + sideItem);
//     }

//     @Override
//     public String toString() {
//         return "Bill [burguer=" + burguer + ", drink=" + drink + ", sideItem=" + sideItem + "]";
//     }

// }

// class Drink {

//     private String drinkType;
//     private String size;
//     private double price;

//     public Drink(String drinkType, String size) {
//         this.size = size;

//         switch (size.toUpperCase().charAt(0)){
//             case 'S' -> this.price = 5.00;
//             case 'M' -> this.price = 7.00;
//             case 'L' -> this.price = 10.00;
//             default -> this.price = -1;
//         };

//         this.drinkType = drinkType;
//     }

//     @Override
//     public String toString() {
//         return "Drink [drinkType=" + drinkType + ", size=" + size + ", price=" + price + "]";
//     }

//     public Drink(){}

//     public double getPrice() {
//         return price;
//     }

    
// }

// class SideItem {

//     private String sideItemType;
//     private double price;

//     public SideItem(String sideItemType) {

//         this.price = switch (sideItemType) {
//             case "French fries" -> 2.99;
//             case "Onion rings" -> 3.49;
//             case "Side salad" -> 3.99;
//             case "Mozzarella sticks" -> 4.49;
//             case "Mac and cheese" -> 3.99;
//             default -> -1;
//         };

//         this.sideItemType = switch (sideItemType) {
//             case "French fries" -> String.format("French fries - $%.2f", price);
//             case "Onion rings" -> String.format("Onion rings - $%.2f", price);
//             case "Side salad" -> String.format("Side salad - $%.2f", price);
//             case "Mozzarella sticks" -> String.format("Mozzarella sticks - $%.2f", price);
//             case "Mac and cheese" -> String.format("Mac and cheese - $%.2f", price);
//             default -> "Invalid side item.";
//         };

//     }

//     public String getSideItemType() {
//         return sideItemType;
//     }

//     public double getPrice() {
//         return price;
//     }

//     public SideItem() {}

// }

// class Burger {

//     private String burgerType;
//     private double basePrice;
//     private double totalPrice;
//     protected int extraToppings;

//     public Burger(String burgerType, int extraToppings) {
//         this.burgerType = burgerType;
//         this.basePrice = switch (burgerType) {
//             case "Classic Cheeseburger" -> 5.99;
//             case "Double Cheeseburger" -> 7.49;
//             case "BBQ Burger" -> 6.99;
//             case "Chicken Burger" -> 5.79;
//             case "Blue Cheese Burger" -> 7.29;
//             default -> 0.00;
//         };
//         if (extraToppings < 0) {
//             System.out.println("Invalid Number");
//             this.extraToppings = -1;
//         }
//         if (extraToppings > 3) {
//             this.extraToppings = 3;
//         } else {
//             this.extraToppings = extraToppings;
//             this.totalPrice = (extraToppings * 1.99) + basePrice;
//         }

//     }


//     @Override
//     public String toString() {
//         return "Burger [burgerType=" + burgerType + ", basePrice=" + basePrice + ", totalPrice=" + totalPrice
//                 + ", extraToppings=" + extraToppings + "]";
//     }

    

//     public double getTotalPrice() {
//         return totalPrice;
//     }


//     public Burger() {}

//     public void setExtraToppings(int extratoppings) {

//         if (extratoppings < -1) {
//             System.out.println("Invalid number");
//             this.extraToppings = -1;
//         } else if (extratoppings > 3){
//             System.out.println("The max number of extra toppings is three");
//             this.extraToppings = 3;
//         } else {
//             this.extraToppings = extratoppings;
//         }
        
//     }

// }

// class deluxeBurger extends Burger {

//     private double price;

//     public deluxeBurger(String burgerType, int extraToppings) {
//         super(burgerType, extraToppings);
//         if (extraToppings < 0) {

//             this.extraToppings = 0;
//             System.out.println("Invalid input");

//         } else if (extraToppings > 5) {
//             this.extraToppings = 5;
//         } else {
//             this.extraToppings = extraToppings;
//         }

//     }

//     public deluxeBurger() {
//     }

//     public void setPrice(double price) {
//         this.price = 40;
//     }
    
// }
