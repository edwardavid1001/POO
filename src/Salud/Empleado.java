package Salud;
import java.util.Scanner;
public class Empleado extends Persona {
    private String cargo;
    private String departamento;
    private double valorHora;
    private double horasTrabajadas;

    public Empleado(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo, double pesoActual, String cargo, String departamento, double valorHora, double horasTrabajadas) {
        super(tipoDoc, documento, nombre, apellido, peso, estatura, edad, sexo);
        this.cargo = cargo;
        this.departamento = departamento;
        this.valorHora = valorHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getValorHora() {
        return valorHora;
    }

    public void setValorHora(double valorHora) {
        this.valorHora = valorHora;
    }

    public double getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(double horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
        public void pedirEmpleado(){
            Scanner Lectura=new Scanner(System.in);
            System.out.println("Digite su cargo");
            cargo=Lectura.next();
            System.out.println("Digite sus horas trabajadas");
            horasTrabajadas=Lectura.nextDouble();
            System.out.println("Digite el valor de la hora");
            valorHora=Lectura.nextDouble();
    }

    public void mostrarEmpleado(){
        System.out.println("El numero de documento es: "+getTipoDoc());
        System.out.println("El documento es "+getDocumento());
        System.out.println("El nombre completo es "+ getNombre() + getApellido());
        System.out.println("El cargo es " + getCargo());
        System.out.println("Las horas trabajadas son " +getHorasTrabajadas());
        }

    public void calcularHonorarios(){
        double reteica;
        double totalPagar;
        totalPagar=valorHora*horasTrabajadas;
        reteica=(0.966*totalPagar);
        totalPagar=(totalPagar-reteica);
        System.out.println("El total a pagar es "+ totalPagar);
    }
}
