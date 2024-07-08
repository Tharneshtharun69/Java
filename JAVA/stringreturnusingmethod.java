class stringreturnusingmethod {
  public String sayHelloFromNewClass(){
    return "Hello from New Class";
  }
  public static void main (String[] args) {
    stringreturnusingmethod s=new stringreturnusingmethod();
    System.out.print(s.sayHelloFromNewClass());
  }
}
