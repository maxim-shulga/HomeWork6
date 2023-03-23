package additional;

 public class Calculator {
     public static double add(double op1, double op2)
     {
         return (op1 + op2);
     }
     public static double mul(double op1, double op2)
     {
         return (op1 * op2);
     }
     public static double sub(double op1, double op2)
     {
         return (op1 - op2);
     }
     public static double div(double op1, double op2)
     {
         if (op2==0)
         {
             System.out.println("division by zero");
             return 0;
         }
         return (op1 / op2);
     }


}
