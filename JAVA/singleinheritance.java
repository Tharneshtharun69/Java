// single inheritance
class singleinheritance{
    public static String bark(){
        return "Dog barks";
    }
}
class animal extends dog{
    public static void main(String[] args) {
        singleinheritance s=new singleinheritance();
        System.out.println(d.bark());
    }
}
