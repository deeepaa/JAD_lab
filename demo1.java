import java.util.*;
class customexception extends Exception
{
customexception()
{
System.out.println("there is an error");
}
}
class demo1
{
public static void main(String[] args)
{
Scanner b=new Scanner(System.in);
System.out.println("enter the subject name");
String a=b.next();
System.out.println("enter the marks");
String d=b.next();
try
{ 
if(a.equals("java") && d.equals("40"))
{
System.out.println("subject is java");
}
else
{
throw new customexception();}
}
catch(Exception e)
{
System.out.println();
}
}
}
