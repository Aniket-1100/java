import java.time.LocalDate;
public class Main11{
public static void main(String[] args){
LocalDate myObj=LocalDate.now();
System.out.println(myObj);
}
}

import java.time.LocalTime;
public class Main11{
public static void main(String[] args){
LocalTime myObj=LocalTime.now();
System.out.println(myObj);
}
}

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
public class Main11{
public static void main(String[] args){
LocalDateTime mDateyObj=LocalDateTime.now();
System.out.println("before formatting: "+myObj);
DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

String formattedDate = myobj2.format(myFormatObj);
System.out.println(formattedDate);
}
}