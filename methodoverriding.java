public class methodoverriding {
    public static void main(String[] args){
        B b=new B();
        System.out.println(b.getAvalue());
    }
}
class A{
    final public int aValue=2;
    public int getAvalue(){
        return aValue;
    }
}
class B extends A{
    public int bValue=3;
    public int getBvalue(){
        return bValue;
    }
    // public int getAvalue(){
    //     aValue=2*aValue;
    //     return aValue;
    // }
}