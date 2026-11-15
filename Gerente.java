/**
 * SEGUNDA CLASE DERIVADA (Subclase)
 * Demuestra cómo múltiples clases pueden reutilizar la misma clase base.
 */
public class Gerente extends Empleado {
    private String departamento;
    private int equipoACargo;

    public Gerente(String nombre, String idEmpleado, double salarioBase, String departamento, int equipoACargo) {
        super(nombre, idEmpleado, salarioBase);
        this.departamento = departamento;
        this.equipoACargo = equipoACargo;
    }

    @Override
    public double calcularSalario() {
        return salarioBase * 1.20;
    }

    public void realizarReunion() {
        System.out.println("El gerente " + nombre + " lidera una reunión con " + equipoACargo + " personas en " + departamento + ".");
    }

    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Rol: Gerente | Departamento: " + departamento);
    }
}