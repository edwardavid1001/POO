package Principal;

import Salud.Empleado;
import Salud.Persona;

public class Inicio {
    public static void main(String[] args) {
        //Retos 1
        double resultado, peso=0, estatura=0;
        //crear un objeto->instancia de una clase
        //Retos 1 y 2
        /*Persona n=new Persona(null, 0, null, null, estatura, estatura, 0, null);
        //invocando un metodo
        n.pedirDatos();
        n.mostrarPersona();
        resultado=n.calcularImc(peso, estatura);
        if (resultado<20){
            System.out.println("PESOBAJO");
        }
        else if (resultado >= 20 && resultado <= 25){
            System.out.println("PESOIDEAL");
        }
        else{
            System.out.println("SOBREPESO");
        }
        n.mayorEdad();*/

        //Reto 3
        Empleado e1=new Empleado(null, 0, null, null, 0, 0, 0, null, 0, null, null, 0, 0);
        e1.pedirDatos();
        e1.pedirEmpleado();
        e1.mostrarEmpleado();
        e1.calcularHonorarios();
   }
}
