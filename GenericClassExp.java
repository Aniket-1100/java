public class GenericClassExp{
public static void main(String[] args){
Box<String> stringBox=new Box<>();
stringBox.setObject("Hello world");
String str=stringBox.getObject();
System.out.println("String box value: "+str);

Box<Integer> integerBox=new Box<>();
integerBox.setObject(42);
int t=integerBox.getObject();
System.out.println("Integer box value: "+t);
}
}

class Box<T>{
private T object;
public void setObject(T object){
this.object=object;
}
public T getObject(){
return object;
}
}