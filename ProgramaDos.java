import java.util.Scanner;

public class ProgramaDos{
  public static void main(String args[]){
   Scanner in = new Scanner(System.in);
   String nombre = "";
   int num1 = 0, num2 = 0, result = 0, operacion=0;
   
   System.out.println("*************************************");
   System.out.println("*Bienvenido a la calculadora basica.*");
   System.out.println("*************************************");
   System.out.println();
   System.out.print("Ingrese el nombre del Interesado es: ");
   nombre = in.nextLine();
   System.out.println();
   System.out.print("Ingrese el primer numero: ");
   num1 = in.nextInt();
   System.out.println();
   System.out.print("Ingrese el segund numero: ");
   num2 = in.nextInt();
   System.out.println();
   System.out.println("Ingrese la opcion que corresponda a la operacion quiere realizar: ");
   System.out.println("(1): +");
   System.out.println("(2): -");
   System.out.println("(3): x");
   System.out.println("(4): /");
   operacion = in.nextInt();
   
   if (operacion == 1){
     result = num1 + num2;
     System.out.println( nombre + " , el resultado de tu operacion es: " + result);
   }
   else if (operacion == 2){
     result = num1 - num2;
     System.out.println( nombre + " , el resultado de tu operacion es: " + result);
   }
   else if (operacion == 3){
     result = num1 * num2;
     System.out.println( nombre + " , el resultado de tu operacion es: " + result);
   }
   else if (operacion == 4){
     if (num2 != 0){
       result = num1 / num2;
       System.out.println( nombre + " , el resultado de tu operacion es: " + result);
     }
     else{
       System.out.println("El divisor tiene que distinto de cero.");
     }
   }
   else{
     System.out.println("la opcion ingresada es incorrecta.");   
   }
   
   
 }

}