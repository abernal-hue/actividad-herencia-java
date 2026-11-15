/**
 * CLASE DERIVADA (Subclase)
 * Utiliza la palabra clave 'extends' para heredar atributos y métodos de Empleado.
 */
public class Desarrollador extends Empleado {
    private String lenguajePrincipal;
    private double bonoProyecto;

    public Desarrollador(String nombre, String idEmpleado, double salarioBase, String lenguajePrincipal, double bonoProyecto) {
        super(nombre, idEmpleado, salarioBase);
        this.lenguajePrincipal = lenguajePrincipal;
        this.bonoProyecto = bonoProyecto;
    }

    @Override
    public double calcularSalario() {
        return super.calcularSalario() + bonoProyecto;
    }

    public void escribirCodigo() {
        System.out.println(nombre + " está programando un módulo en " + lenguajePrincipal + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Rol: Desarrollador | Lenguaje: " + lenguajePrincipal);
    }
}
