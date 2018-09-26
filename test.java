class bank
{
int getrateofinterest()
{
return 0;
}
}
class SBI extends bank
{
int getrateofinterest()
{
return 8;
}
}
class ICICI extends bank
{
int getrateofinterest()
{
return 7;
}
}
class AXIS extends bank
{
int getrateofinterest()
{
return 9;
}
}
class test
{
public static void main(String[] args)
{
SBI S=new SBI();
ICICI I=new ICICI();
AXIS A=new AXIS();
System.out.println("SBI rateofinterest"  +S.getrateofinterest());
System.out.println("AXIS rateofinterest" +A.getrateofinterest());
System.out.println("ICICI rateofinterest" +I.getrateofinterest());
}
}
