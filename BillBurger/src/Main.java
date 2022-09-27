class Hamburger {
    private String name;
    private String meat;
    private double price;
    private String breadRollType;

    private String addition1Name;
    private double addition1Price;
    private String addition2Name;
    private double addition2Price;
    private String addition3Name;
    private double addition3Price;
    private String addition4Name;
    private double addition4Price;

    public Hamburger(String name, String meat, double price, String breadRollType) {
        this.name = name;
        this.meat = meat;
        this.price = price;
        this.breadRollType = breadRollType;
        System.out.println(this.name + " hamburger on a " + this.breadRollType + " with " + this.meat +
                ", price is " + this.price);
    }

    public void addHamburgerAddition1(String name, double price) {
        this.addition1Name = name;
        this.addition1Price = price;
    }

    public void addHamburgerAddition2(String name, double price) {
        this.addition2Name = name;
        this.addition2Price = price;
    }

    public void addHamburgerAddition3(String name, double price) {
        this.addition3Name = name;
        this.addition3Price = price;
    }

    public void addHamburgerAddition4(String name, double price) {
        this.addition4Name = name;
        this.addition4Price = price;
    }

    public double itemizeHamburger() {
        double totalPrice = this.price;
        if (this.addition1Name != null) {
            totalPrice += this.addition1Price;
            System.out.println("Added " + this.addition1Name + " for an extra " + this.addition1Price);
        }
        if (this.addition2Name != null) {
            totalPrice += this.addition2Price;
            System.out.println("Added " + this.addition2Name + " for an extra " + this.addition2Price);
        }
        if (this.addition3Name != null) {
            totalPrice += this.addition3Price;
            System.out.println("Added " + this.addition3Name + " for an extra " + this.addition3Price);
        }
        if (this.addition4Name != null) {
            totalPrice += this.addition4Price;
            System.out.println("Added " + this.addition4Name + " for an extra " + this.addition4Price);
        }
        return totalPrice;
    }
}

class HealthyBurger extends Hamburger {
    private String healthyExtra1Name;
    private double healthyExtra1Price;
    private String healthyExtra2Name;
    private double healthyExtra2Price;

    public HealthyBurger(String meat, double price) {
        super("Healthy", meat, price, "Brown rye roll");
    }

    public void addHealthyAddition1(String name, double price) {
        this.healthyExtra1Name = name;
        this.healthyExtra1Price = price;
    }

    public void addHealthyAddition2(String name, double price) {
        this.healthyExtra2Name = name;
        this.healthyExtra2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double totalPrice = super.itemizeHamburger();
        if (this.healthyExtra1Name != null) {
            totalPrice += healthyExtra1Price;
            System.out.println("Added " + this.healthyExtra1Name + " for an extra " + this.healthyExtra1Price);
        }
        if (this.healthyExtra2Name != null) {
            totalPrice += healthyExtra2Price;
            System.out.println("Added " + this.healthyExtra2Name + " for an extra " + this.healthyExtra2Price);
        }
        return totalPrice;
    }
}

class DeluxeBurger extends Hamburger {

    public DeluxeBurger() {
        super("Deluxe", "Sausage & Bacon", 14.54, "White roll");
        super.addHamburgerAddition1("Chips",2.75);
        super.addHamburgerAddition2("Drink",1.81);
    }

    @Override
    public void addHamburgerAddition1(String name, double price) {
        System.out.println("No additional items can be added to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition2(String name, double price) {
        System.out.println("No additional items can be added to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition3(String name, double price) {
        System.out.println("No additional items can be added to the deluxe burger");
    }

    @Override
    public void addHamburgerAddition4(String name, double price) {
        System.out.println("No additional items can be added to the deluxe burger");
    }
}

public class Main {
    public static void main(String[] args) {
        Hamburger hamburger = new Hamburger("Basic", "Sausage",3.56,"White");
        hamburger.addHamburgerAddition1("Tomato", 0.27);
        hamburger.addHamburgerAddition2("Lettuce", 0.75);
        hamburger.addHamburgerAddition3("Cheese", 1.13);
        System.out.println("Total Burger price is = " + hamburger.itemizeHamburger());
        System.out.println("******************************************************");
        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
        healthyBurger.addHamburgerAddition1("Egg", 5.43);
        healthyBurger.addHealthyAddition1("Lentils",3.41);
        System.out.println("Total Healthy Burger price is = " + healthyBurger.itemizeHamburger());
        System.out.println("******************************************************");
        DeluxeBurger deluxeBurger = new DeluxeBurger();
        String formattedBurgerPrice = String.format("%.2f", deluxeBurger.itemizeHamburger());
        System.out.println("Total Deluxe Burger price is = " + formattedBurgerPrice);
    }
}

//class Hamburger {
//    private String name;
//    private String meat;
//    double price;
//    private String breadRollType;
//
//    private String addition1Name;
//    private double addition1Price;
//    private String addition2Name;
//    private double addition2Price;
//    private String addition3Name;
//    private double addition3Price;
//    private String addition4Name;
//    private double addition4Price;
//
//    public Hamburger(String name, String meat, double price, String breadRollType) {
//        this.name = name;
//        this.meat = meat;
//        this.price = price;
//        this.breadRollType = breadRollType;
//    }
//
//    public void addHamburgerAddition1 (String name, double price){
//       this.addition1Name = name;
//       this.addition1Price = price;
//    }
//    public void addHamburgerAddition2 (String name, double price){
//        this.addition2Name = name;
//        this.addition2Price = price;
//    }
//    public void addHamburgerAddition3 (String name, double price){
//        this.addition3Name = name;
//        this.addition3Price = price;
//    }
//    public void addHamburgerAddition4 (String name, double price){
//        this.addition4Name = name;
//        this.addition4Price = price;
//    }
//
//    public double itemizeHamburger() {
//        double totalPrice = this.price;
//        if (addition1Name != null) {
//            totalPrice += addition1Price;
//            System.out.println("Added:" + addition1Name+ " for an extra " + addition1Price);
//        }
//        if (addition2Name != null) {
//            totalPrice += addition2Price;
//            System.out.println("Added:" + addition2Name+ " for an extra " + addition2Price);
//        }
//        if (addition3Name != null) {
//            totalPrice += addition3Price;
//            System.out.println("Added:" + addition3Price+ " for an extra " + addition3Name);
//        }
//        if (addition4Name != null) {
//            totalPrice += addition4Price;
//            System.out.println("Added:" + addition4Name+ " for an extra " + addition4Price);
//        }
//
//        return totalPrice;
//    }
//}
//
//class DeluxeBurger extends Hamburger {
//    public DeluxeBurger() {
//        super("Deluxe", "Sausage & Bacon", 14.54, "White roll");
//        super.addHamburgerAddition1("chips", 2.75);
//        super.addHamburgerAddition3("fries", 0.5);
//        super.addHamburgerAddition1("Lettuce",1.45);
//
//    }
//
//    @Override
//    public void addHamburgerAddition1(String name, double price) {
//        System.out.println("No additional items can be added to the Deluxe burger");
//    }
//
//    @Override
//    public void addHamburgerAddition2(String name, double price) {
//        System.out.println("No additional items can be added to the Deluxe burger");
//    }
//
//    @Override
//    public void addHamburgerAddition3(String name, double price) {
//        System.out.println("No additional items can be added to the Deluxe burger");
//    }
//
//    @Override
//    public void addHamburgerAddition4(String name, double price) {
//        System.out.println("No additional items can be added to the Deluxe burger");
//    }
//}
//
//class HealthyBurger extends Hamburger {
//    private String healthyExtra1Name;
//    private double healthyExtra1Price;
//    private String healthyExtra2Name;
//    private double healthyExtra2Price;
//
//
//    public HealthyBurger (String meat, double price) {
//        super("Healthy", meat, price, "Brown rye roll");
//    }
//
//    public void addHealthyAddition1(String name, double price) {
//        this.healthyExtra1Name = name;
//        this.healthyExtra1Price = price;
//    }
//    public void addHealthyAddition2(String name, double price) {
//        this.healthyExtra2Name = name;
//        this.healthyExtra2Price = price;
//    }
//
//    @Override
//    public double itemizeHamburger() {
//        double totalPrice = this.price;
//        if (healthyExtra1Name != null) {
//            totalPrice += healthyExtra1Price;
//            System.out.println("Added:" + healthyExtra1Name+ " for an extra " + healthyExtra1Price);
//        }
//        if (healthyExtra2Name != null) {
//            totalPrice += healthyExtra2Price;
//            System.out.println("Added:" + healthyExtra2Name+ " for an extra " + healthyExtra2Price);
//        }
//
//
//        return totalPrice;
//    }
//}
//
//public class Main {
//    public static void main(String[] args) {
//        Hamburger hamburger = new Hamburger("Basic", "Sausage", 3.56, "White");
//        hamburger.addHamburgerAddition1("Tomato", 0.27);
//        hamburger.addHamburgerAddition2("Lettuce", 0.75);
//        hamburger.addHamburgerAddition3("Cheese", 1.13);
//        System.out.println("Total Burger price is " + hamburger.itemizeHamburger());
//
//        HealthyBurger healthyBurger = new HealthyBurger("Bacon", 5.67);
//        healthyBurger.addHamburgerAddition1("Egg", 5.43);
//        healthyBurger.addHealthyAddition1("Lentils", 3.41);
//        System.out.println("Total Healthy Burger price is  " + healthyBurger.itemizeHamburger());
//
//        DeluxeBurger db = new DeluxeBurger();
//        db.addHamburgerAddition3("Should not do this", 50.53);
//        System.out.println("Total Deluxe Burger price is " + db.itemizeHamburger());
//    }
//}