/**
 * CLASE BASE (Superclase)
 * Define los atributos y métodos generales que serán reutilizados
 * por todas las clases derivadas mediante herencia.
 */
public class Empleado {
    protected String nombre;
    protected String idEmpleado;
    protected double salarioBase;

    public Empleado(String nombre, String idEmpleado, double salarioBase) {
        this.nombre = nombre;
        this.idEmpleado = idEmpleado;
        this.salarioBase = salarioBase;
    }

    public double calcularSalario() {
        return salarioBase;
    }

    public void mostrarInformacion() {
        System.out.println("ID: " + idEmpleado + " | Nombre: " + nombre);
        System.out.println("Salario Total: $" + calcularSalario());
    }
}
