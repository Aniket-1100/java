public class Interface {
    public static void main(String[] args){
        D d = new D();
        d.show();
        d.display();
        d.printtt();
        E e = new E();
        e.show();
        e.display();
        e.printtt();
    }
}

interface A{
    void show();
}
interface B{
    void display();
}
interface C{
    void printtt();
}
class D implements A,B,C{
    @Override
    public void show(){
        System.out.println("Hello");
    }
    @Override
    public void display(){
        System.out.println("Aniket");
    }
    @Override
    public void printtt(){
        System.out.println("K22ZM");
    }
}
class E implements A,B,C{
    @Override
    public void show(){
        System.out.println("Hello");
    }
    @Override
    public void display(){
        System.out.println("Aniket");
    }
    @Override
    public void printtt(){
        System.out.println("K22AE");
    }
}The Toyota Supra MK4 is the fourth generation of the iconic Toyota Supra, which made its debut in the market back in 1993