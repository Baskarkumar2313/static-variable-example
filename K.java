/*
Authour Name:Baskar.K
Program Name:Static Variable 
Date :17-08-2022
*/


class K
{
 static int number1;
 static float number2;
 static double number3;
 int K;
 public static void main(String[]args)
 {
  int K=100;
  K obj=new K();
  K obj1=new K();
  K obj2=new K();
  obj2.number3=800.10;
  System.out.println("print the int:"+number1);
  System.out.println("print the float:"+number2);
  System.out.println("print the double:"+number3);
  obj.K=1000;
  obj.method1();
  System.out.println("print the initialized class value:"+obj.K); 
  System.out.println("print the reinitialized class value:"+obj2.number3);
 }
 public static void method1()
 {
  System.out.println("print the default values:"+number1+","+number2+","+number3);
 }
}