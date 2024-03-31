import java.util.*;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;
import java.time.Duration;

public class TimeDiff{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
String st=sc.nextLine();
String[] a=st.split(":");
int sh=Integer.parseInt(a[0]);
int sm=Integer.parseInt(a[1]);
String et=sc.nextLine();
String[] b=et.split(":");
int eh=Integer.parseInt(b[0]);
int em=Integer.parseInt(b[1]);
int d,m;
if(em>=sm){
d=eh-sh;
m=em-sm;
}else{
d=eh-sh;
m=60-sm+em;
}
System.out.println(d+":"+m);
}
}