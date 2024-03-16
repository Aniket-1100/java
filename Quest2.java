class RBI{
static int r=4;
class PNB{
void interest(int p,int t){
int i=(p*r*t)/100;
System.out.println("the interest is: "+i);
}
}
}

public class Quest2{
public static void main(String[] args){
RBI obj=new RBI();
RBI.PNB obj1 = obj.new PNB();
obj1.interest(10000,2);
}
}