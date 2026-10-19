import java.util.Scanner;

public class PruebaFecha {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        System.out.print("Mes: ");
        int mes = entrada.nextInt();
        System.out.print("Día: ");
        int dia = entrada.nextInt();
        System.out.print("Año: ");
        int anio = entrada.nextInt();

        Fecha fecha = new Fecha(mes, dia, anio);
        System.out.print("Fecha ingresada: ");
        fecha.mostrarFecha();

        // Probamos los métodos establecer y obtener
        fecha.setMes(12);
        fecha.setDia(25);
        fecha.setAnio(2026);
        System.out.println("Mes: " + fecha.getMes() + ", Día: " + fecha.getDia() + ", Año: " + fecha.getAnio());
        System.out.print("Fecha modificada: ");
        fecha.mostrarFecha();
    }
}
