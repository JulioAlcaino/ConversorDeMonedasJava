import java.io.IOException;
import java.util.Scanner;

import static java.awt.SystemColor.menu;

public class Main {
    public static void main(String[] args) throws IOException, InterruptedException {
        int opcion = 0;



    String menu = """
            
            
            ***Escriba el Numero de la Opcion Deseada
            1 -  Lista Monedas Disponibles
            2 - Conversor de Monedas
            9 - Cerrar
                      
            """;

        Scanner lectura= new Scanner(System.in);

        while (opcion != 9){
        System.out.println(menu);
            opcion = lectura.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println(ListaMonedas.listado());

                break;

                case 2:
                   try {
                       System.out.println("Ingrese codigo de moneda a convertir");
                       Scanner ingreso = new Scanner(System.in);

                       var moneda1 = ingreso.nextLine();

                       System.out.println("Ingrese codigo de segunda moneda a convertir");

                       var moneda2 = ingreso.nextLine();

                       System.out.println("Ingrese cantidad a convertir");
                       var cantidad = ingreso.nextDouble();

                       ConeccionconApi calculo = new ConeccionconApi();
                       Datos resultado = calculo.consulta(moneda1, moneda2, cantidad);
                   }catch (Exception e) {
                       System.out.println("Verificar datos ingresados , puede revisar los codigos de monedas en la opcion 1 del menú principal");
                   }
                break;

                case 9:
                    System.out.printf("Saliendo del Programa , gracias por usarnos , ¡hasta pronto!");

                break;
                default:
                    System.out.println("Opción No valida, digite una nueva opción");


            }
    }







    }
}