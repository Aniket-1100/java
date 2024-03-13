public class AbsTract {
    public static void main(String[] args){
        C c=new C();
        c.show();
        c.display();

    }
}
abstract class A{
    abstract void show();
}
class B extends A{
    void show(){
        System.out.println("Aniket");
    }
}
class C extends B{
    void display(){
        System.out.println("Singh");
    }
}
