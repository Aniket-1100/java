public class Tostring {
    public static void main(String[] args){
        Number c1=new Number(20,38);
        Number c2=new Number(22,78);
        System.out.println(c1);
        System.out.println(c2);
        if(c1==c2){
            System.out.println(true);
        }else{
            System.out.println(false);

        }
    }
}
class Number{
    private double re,im;
    public Number(double re,double im){
        this.re=re;
        this.im=im;
    }
    public double getReal(){
        return this.re;
    }
    public double getImaginary(){
        return this.im;
    }
    public void setReal(double re){
        this.re=re;
    }
    public void setImaginary(double im){
        this.im=im;
    }
    // @Override
    // public String toString(){
    //     return this.re+"+"+this.im+"i";
    // }
}