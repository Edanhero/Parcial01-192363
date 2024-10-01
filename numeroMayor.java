public class numeroMayor {
    public static void main(String[] args) {
        // Definimos el arreglo
        int[] arreglo = {3, 5, 9, 7, 2};
        // Inicializamos el mayor número con el primer elemento del arreglo
        int numMayor = arreglo[0];

        // Recorremos el arreglo
        for (int i = 1; i < arreglo.length; i++) {
            // Si encontramos un número mayor, actualizamos el valor de "mayor"
            if (arreglo[i] > numMayor) {
                numMayor = arreglo[i];
            }
        }
        // Imprimimos el mayor número
        System.out.println("El número mayor es: " + numMayor);
    }
}
