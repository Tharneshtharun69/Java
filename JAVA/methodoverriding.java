class BaseCalculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
}

class ExtendedCalculator extends BaseCalculator {
    // Correctly overriding the 'add' method with same parameters
    @Override
    public int add(int a, int b) {
        System.out.println("ExtendedCalculator overriding BaseCalculator method.");
        return a + b + 10; // Just to show it's overridden (you can customize)
    }
}

class methodoverriding {
    public static void main(String[] args) {
        // Create an instance of BaseCalculator
        BaseCalculator baseCalc = new BaseCalculator();
        System.out.println("Sum of two integers (Base): " + baseCalc.add(2, 3));

        // Create an instance of ExtendedCalculator
        ExtendedCalculator extendedCalc = new ExtendedCalculator();
        System.out.println("Sum of two integers (Extended): " + extendedCalc.add(2, 3)); // Calls overridden method
    }
}
