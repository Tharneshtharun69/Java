Class Test4 {
public static void main(String[] args) {
Test4 obj = new Test();
obj.start();
}
void start() {
String stra = ”do”;
String strb = method(stra);
System.out.print(“: ”+stra + strb);
}
String method(String stra) {
stra = stra + ”good”;
System.out.print(stra);
return“ good”;
}
}