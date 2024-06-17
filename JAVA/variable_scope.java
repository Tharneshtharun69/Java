class variable_scope
{
    public static void main(String args[])
    {
        int x=1;
        int y=2;
        {
            int a=x+5;
            int b=y+6;
            System.out.print(a + " " + b);
            //System.out.println(x + " " + y);//error because this variable is initialized and declared outside the block.so its not accessible here
        }
        //System.out.print(a+" "+b);//error because this variable is initialized and declared inside the above block.so its not accessible here
        System.out.println(x + " " + y);
    }
}
