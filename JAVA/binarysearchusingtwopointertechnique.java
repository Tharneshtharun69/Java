class binarysearchusingtwopointertechnique{
    public static void main(String[] args) {
        int target=1;
        boolean found=false;
        int arr[]=;
        int left=0;
        int right=arr.length-1;
        int index=0;
        for(int i=0;i<arr.length;i++)
        {
            if(arr[left]==target)
            {
                found=true;
                index=left;
                break;
            }
            else if(arr[right]==target)
            {
                found=true;
                index=right;
                break;
            }
            left++;
            right--;
        }
        System.out.print(index);
    }
}
