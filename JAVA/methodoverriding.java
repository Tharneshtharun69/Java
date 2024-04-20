//same name,different type,different parameters
class BaseCalculator {
    // Method to add two integers
    public int add(int a, int b) {
        return a + b;
    }
}
class ExtendedCalculator extends BaseCalculator {
    // Overrides the 'add' method to work with three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }
}
class methodoverriding {
    public static void main(String[] args) {
        // Create an instance of BaseCalculator
        BaseCalculator baseCalc = new BaseCalculator();
        System.out.println("Sum of two integers (Base): " + baseCalc.add(2, 3));
        // Create an instance of ExtendedCalculator
        ExtendedCalculator extendedCalc = new ExtendedCalculator();
        System.out.println("Sum of two integers (Extended): " + extendedCalc.add(2, 3)); // Calls BaseCalculator's method
        System.out.println("Sum of three integers: " + extendedCalc.add(2, 3, 4)); // Calls overridden method
    }
}
