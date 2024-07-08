//find the middle element in a list 
import java.util.*;
class middleelementinalist
{
  public static void main (String[] args) {
    ArrayList<String> list=new ArrayList<>();
    list.add("Sanjay");
    list.add("Yashwanth");
    list.add("Nithish");
    list.add("Gladson");
    list.add("Raju");
    System.out.print(list);
    System.out.println();
    System.out.println("Middle element:"+list.get(list.size()/2));
  }
}
