class simple {
    public static void main(String[] args) {
        simple obj = new simple();
        obj.start();
    }

void start( )
{
long [ ] P= {3, 4, 5};
long [ ] Q= method (P);
System.out.print (P[0] + P[1] + P[2]+":");
System.out.print (Q[0] + Q[1] + Q[2]);
}

    long[] method(long[] R) {
        R[1] = 7;
        return R;
    }
} // end of class