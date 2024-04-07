class Test1 {
    public void demo(String str) {
        String[] arr = str.split(";");
        for (String s : arr) {
            System.out.println(s);
        }
    }

    public static void main(String[] args) {
        char array[] = { 'a', 'b', ' ', 'c', 'd', ';', 'e', 'f', ' ',
                'g', 'h', ';', 'i', 'j', ' ', 'k', 'l' };
        String str = new String(array);
        Test1 obj = new Test1();
        obj.demo(str);
    }
}