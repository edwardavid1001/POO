package Salud;

import java.util.Scanner;
public class Persona {
   private String tipoDoc; 
   private int documento;
   private String nombre;
   private String apellido;
   private double peso;
   private double estatura;
   private int edad;
   private String sexo;
  // private double pesoActual;

  //Reto 3
public Persona(String tipoDoc, int documento, String nombre, String apellido, double peso, double estatura, int edad, String sexo) {
    this.tipoDoc = tipoDoc;
    this.documento = documento;
    this.nombre = nombre;
    this.apellido = apellido;
    this.peso = peso;
    this.estatura = estatura;
    this.edad = edad;
    this.sexo = sexo;
}

public String getTipoDoc() {
    return tipoDoc;
}

public void setTipoDoc(String tipoDoc) {
    this.tipoDoc = tipoDoc;
}

public int getDocumento() {
    return documento;
}

public void setDocumento(int documento) {
    this.documento = documento;
}

public String getNombre() {
    return nombre;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public String getApellido() {
    return apellido;
}

public void setApellido(String apellido) {
    this.apellido = apellido;
}

public double getPeso() {
    return peso;
}

public void setPeso(double peso) {
    this.peso = peso;
}

public double getEstatura() {
    return estatura;
}

public void setEstatura(double estatura) {
    this.estatura = estatura;
}

public int getEdad() {
    return edad;
}

public void setEdad(int edad) {
    this.edad = edad;
}

public String getSexo() {
    return sexo;
}

public void setSexo(String sexo) {
    this.sexo = sexo;
}

   //Reto 1 y 2
   public void pedirDatos(){
    Scanner Lectura=new Scanner(System.in);
    System.out.println("Digite su tipo de documento");
    tipoDoc=Lectura.next();
    System.out.println("Digite su numero de documento");
    documento=Lectura.nextInt();
    System.out.println("Digite su nombre");
    nombre=Lectura.next();
    System.out.println("Digite su apellido");
    apellido=Lectura.next();
    /*//Reto 1 y 2
    System.out.println("Digite su peso");
    peso=Lectura.nextDouble();
    System.out.println("Digite su estatura");
    estatura=Lectura.nextDouble();
    System.out.println("Digite su edad");
    edad=Lectura.nextInt();
    System.out.println("Digite su sexo");
    sexo=Lectura.next();*/
   }
   public void mostrarPersona(){
    System.out.println("Su tipo de documento es "+tipoDoc);
    System.out.println("Su numero de documento es "+documento);
    System.out.println("Su nombre es "+nombre);
    System.out.println("Su apellido es "+apellido);
    System.out.println("Su peso es "+peso);
    System.out.println("Su estatura es "+estatura);
    System.out.println("Su edad es "+edad);
    System.out.println("Su sexo es "+sexo);
   }
   public double calcularImc(double peso, double estatura){
    double pesoActual=peso/estatura/estatura;
    //Reto 2
    return pesoActual;
   }
   //reto 1
    /*if (pesoActual<20){
        System.out.println("el peso está por debajo de lo ideal");
    }
    else if (pesoActual >= 20 && pesoActual <= 25){
        System.out.println("el peso es ideal");
    }
    else{
        System.out.println("Tiene sobrepeso");
    }
   }*/
   public void mayorEdad(){
    if (edad>=18){
        System.out.println("Usted es mayor de edad");
    }
    else{
        System.out.println("Usted es menor de edad");
    
    }
    
   }
   //Lectura.close();
}

