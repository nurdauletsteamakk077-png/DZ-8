class Espresso implements Beverage {
    public String getDescription() {
        return "Espresso";
    }

    public double cost() {
        return 2.0;
    }
}

class Tea implements Beverage {
    public String getDescription() {
        return "Tea";
    }

    public double cost() {
        return 1.5;
    }
}

class Latte implements Beverage {
    public String getDescription() {
        return "Latte";
    }

    public double cost() {
        return 2.5;
    }
}
