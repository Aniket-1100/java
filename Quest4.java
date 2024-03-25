class Person{
void FirstName(){
System.out.println("Aniket");
}
void lastName(){
System.out.println("XYZ");
}
}

class Emp extends Person{
void getEmpid(){
System.out.println("id = 1100");
}
@Override
void lastName(){
System.out.println("Singh");
}
}

public class Quest4{
public static void main(String[] args){
Emp obj = new Emp();
obj.FirstName();
obj.lastName();
obj.getEmpid();
}
}