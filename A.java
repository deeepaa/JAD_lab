
class C
{
   public void methodC()
   {
     System.out.println("Base class method");
   }
}
class B extends C
{
   public void methodB()
   {
     System.out.println("Child class method");

   }
  
}
class A {

 public static void main(String args[])
   {
     B obj = new B();
     //C obj= new C();
     obj.methodB(); 
     obj.methodC();
  }
}
