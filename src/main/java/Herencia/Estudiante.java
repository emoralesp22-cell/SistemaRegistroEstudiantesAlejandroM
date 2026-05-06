package Herencia;


public class Estudiante extends Persona {
    private int codigoEstudiante;
    private float notaFinal;
    
    //contructor, atributos ya inicializados de clase Persona con super//
    public Estudiante(String nombre, String apellido, int edad, int codigoEstudiante, float notaFinal){
    super(nombre, apellido, edad);
    this.codigoEstudiante = codigoEstudiante;
    this.notaFinal = notaFinal;
}
  
    public void mostrarDatos(){
        System.out.println("Nombre: "+getNombre()+"\n"+
                "Apellido: "+getApellido()+"\n"+ 
                "Edad: "+getEdad()+ "\n"+
                "Codigo del Estudiante: "+codigoEstudiante+ "\n"+
                "Nota Final: "+notaFinal);
    }
    
    
    
}
