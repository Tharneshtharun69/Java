//copy the values of one object to another using java constructor
class copycons2
{
  String name;
  int rollno;
  copycons2(String name,int rollno)
  {
    this.name=name;
    this.rollno=rollno;
  }
  copycons2(copycons2 s)
  {
    name=s.name;
    rollno=s.rollno;
  }
  void display()
  {
    System.out.println(name+" "+rollno);
  }
  public static void main(String args[])
  {
    copycons2 ob1=new copycons2("Rithick",39);
    copycons2 ob2=new copycons2(ob1);
    ob1.display();
    ob2.display();
  }
}
