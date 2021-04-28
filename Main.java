
import java.util.Scanner;

class Main {
  public static void main(String[] args){
    String empleado1, empleado2;
    Double salario1, salario2;
    Scanner leernumero = new Scanner(System.in);
    System.out.println("Ingrese nombre del empleado1");
    empleado1=leernumero.next();
    System.out.println("Ingrese el salario del empleado1");
    salario1=leernumero.nextDouble();
    System.out.println(" El empleado1 es " +empleado1+ " y su salario es de " +salario1+ "\n");
  
    System.out.println("Ingrese nombre del empleado2");
    empleado2=leernumero.next();
    System.out.println("Ingrese el salario del empleado2");
    salario2=leernumero.nextDouble();
    System.out.println(" El empleado2 es " +empleado2+ " y su salario es de " +salario2);
  }
}