import java.util.*;
public class JavaDequeExample1{
public static void main(String[] args){
Deque<Integer> deque=new ArrayDeque<Integer>();
deque.add(1);
deque.add(2);
deque.add(3);
System.out.println("Inserting three elements: ");
for(Integer integer:deque){
System.out.println(integer);
}
deque.pop();
System.out.println("After popping: ");
for(Integer integer:deque){
System.out.println(integer);
}
deque.remove(2);
System.out.println("After removing the element 3: "+deque);
}
}