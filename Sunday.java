import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

public class Sunday{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String a=sc.nextLine();
String b=sc.nextLine();
int x=countSun(a,b);
System.out.println(x);

}
public static int countSun(String a,String b){
DateTimeFormatter formatter=DateTimeFormatter.ofPattern("dd-MM-yyyy");
LocalDate sd=LocalDate.parse(a,formatter);
LocalDate ed=LocalDate.parse(b,formatter);
int s=0;
LocalDate date=sd;
while(!date.isAfter(ed)){
if(date.getDayOfWeek()==DayOfWeek.SUNDAY){
s++;
}
date=date.plusDays(1);
}
return s;
}
}