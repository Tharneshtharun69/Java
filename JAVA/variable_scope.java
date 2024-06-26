class variable_scope
{
    public static void main(String args[])
    {
        int x=1;//global scope
        int y=2;//global scope
        {
            int a=x+5;//local scope
            int b=y+6;//local scope
            System.out.print(a + " " + b);
            //System.out.println(x + " " + y);//error because this variable is initialized and declared outside the block.so its not accessible here
        }
        //System.out.print(a+" "+b);//error because this variable is initialized and declared inside the above block.so its not accessible here
        System.out.println(x + " " + y);
    }
}
