class FirstAndLastElementEqualOrNot {
    public static void main(String args[]) {
        int array[] = { 1, 2, 3, 4, 5 };
        if (array.length > 0 && array[0] == array[array.length - 1]) {
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
