class Employees{
void work(){
System.out.println("work1");
}

void getSalary(){
System.out.println("30000");
}
}

class HRManager extends Employees{
@Override
void work(){
System.out.println("work2");
}
void addEmp(){
System.out.println("emp added");
}
}

public class Quest3{
public static void main(String[] args){
HRManager obj = new HRManager();
obj.work();
obj.addEmp();
obj.getSalary();
}
}