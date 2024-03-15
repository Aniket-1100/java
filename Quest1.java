class Father{
static int mother=45;
void age(int a){
System.out.println("the age of father is: "+a);
}

class Son{
void age1(int b){
System.out.println("the age of mother is: "+mother);
System.out.println("the age of son is: "+b);
}
}
}

public class Quest1{
public static void main(String[] args){
Father obj = new Father();
obj.age(47);
Father.Son obj1 = obj.new Son();
obj1.age1(18);
}
}