import java.util.Scanner;
class maximumelementinmultidimensionalarray{
  public static void  main(String args[]){
    Scanner sc = new Scanner(System.in);
    int max=0;
    int row = sc.nextInt();
    int column = sc.nextInt();
    int arr[][]=new int[row][column];
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        arr[i][j]=sc.nextInt();
      }
    }
    for(int i=0;i<row;i++){
      for(int j=0;j<column;j++){
        for(int k=1;k<column;k++){
          if(arr[i][j]>arr[i][k]&&arr[i][j]>max){
            max=arr[i][j];
          }
          if(arr[i][j]<arr[i][k] && max<arr[i][k]){
            max=arr[i][k];
          }
        }
        System.out.print(arr[i][j]+" ");
      }
      System.out.println();
    }
    System.out.println(max);
  }
}
