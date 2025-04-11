import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("\n*******************************************************************");
        // creamos las variables

        // creamos las variables con los datos iniciales;
        String nombre = "Radamantiz";
        double saldo = 1500;
        int opccion = 0;
        double cifraIngresadaPorCliente = 0;


        Scanner ingresoPorTeclado = new Scanner(System.in);

        System.out.println("\n Bienbenido al sistema bancario");
        System.out.println("Nombre de usuario = "+ nombre );
        System.out.println("Saldo en cuenta = "+ saldo);

        // Menu
        System.out.println("\n Seleccione una opccion del menu ");
        System.out.println("""
           1 Consulta de saldo.
           2 Retirar dinero.
           3 depocitar dinero.
           9 Cerrar  la aplicacion.""");

        // operaciones mediante bicle while;
        while (opccion != 9) {
            System.out.println("\n Seleccione una opccion del menu ");
            System.out.println("""
           1 Consulta de saldo.
           2 Retirar dinero.
           3 depocitar dinero.
           9 Cerrar  la aplicacion.""");
            opccion = ingresoPorTeclado.nextInt();
            // flujo de operaciones mediante swich;
           switch (opccion){
               case 1: // consulta de saldo;
                   System.out.println( "Su saldo actual es de " + saldo);

                   break;
               case 2: // retiro de dinero;
                   System.out.println("Su saldo actual es de "+ saldo +" cuanto desea retirar?");
                   cifraIngresadaPorCliente =ingresoPorTeclado.nextDouble();
                   if (cifraIngresadaPorCliente > saldo){
                       System.out.println("La cantidad excede el saldo existente ");
                   }else{
                       System.out.println("su nuevo saldo es de " +( saldo -= cifraIngresadaPorCliente ));
                   }
                   break;
               case 3: // depocitar dinero;
                   System.out.println("Su saldo actual es de "+ saldo +" cuanto desea depocitar?");
                   cifraIngresadaPorCliente =ingresoPorTeclado.nextDouble();
                   System.out.println("Su nuevo saldo es de  " + (saldo += cifraIngresadaPorCliente));
                   break;
               case 9: // mensaje de salida;
                   System.out.println("Secion terminada gracias por operar con nosotros. ");

           }

            }

        }

}

