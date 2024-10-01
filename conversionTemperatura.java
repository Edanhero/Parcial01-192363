
//Importamos el scanner para pedir datos
import java.util.Scanner;

public class conversionTemperatura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // usamos el ciclo de while
        while (true) {

            // pedimos la temperatura
            System.out.println("Ingrese la temperatura");
            int temperatura = scanner.nextInt();

            // Creamos un menu para que pueda asi convertir
            System.out.println("Ingrese codigo ");
            System.out.println("CODIGO          CONVERSION");
            System.out.println("   1       Celsius a Fahrenheit:");
            System.out.println("   2       Fahrenheit a Celsius:");
            int codigo = scanner.nextInt();

            //usamos este ciclo para poder validar lo que ingresemos
            switch (codigo) {
                case 1:
                    int temperaturaFinal = (temperatura * 9 / 5) + 32;
                    System.out.println(temperaturaFinal + " Grados Fahrenheint");
                case 2:
                    temperaturaFinal = (temperatura - 32) * 5 / 9;
                    System.out.println(temperaturaFinal + " Grados Celsius");
                    break;
                default:
                    System.out.println("Ingrese codigo correcto");
                    break;
            }
        }
    }
}
