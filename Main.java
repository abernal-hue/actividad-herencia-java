/**
 * CLASE PRINCIPAL
 * Prueba la creación de objetos de las clases derivadas y verifica
 * el funcionamiento de la herencia y la sobrescritura de métodos.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("=== SISTEMA DE GESTIÓN DE PERSONAL (HERENCIA) ===\n");

        // 1. Instancia de la subclase Desarrollador
        Desarrollador dev1 = new Desarrollador("Ana López", "DEV-01", 25000.0, "Java", 4500.0);
        dev1.mostrarInformacion(); // Método sobrescrito que reutiliza lógica de Empleado
        dev1.escribirCodigo();     // Método exclusivo de Desarrollador

        System.out.println("\n-------------------------------------------------\n");

        // 2. Instancia de la subclase Gerente
        Gerente gerente1 = new Gerente("Carlos Ruiz", "GER-01", 40000.0, "Desarrollo de Software", 8);
        gerente1.mostrarInformacion(); // Método sobrescrito
        gerente1.realizarReunion();    // Método exclusivo de Gerente
    }
}
