package Herencia;
import java.util.ArrayList;
import java.util.Scanner;


public class Principal {

    public static void main(String[] args) {
        ArrayList<Estudiante>lista= new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int opcion;
        do{
            System.out.println("\n1. Agregar Estudiante");
            System.out.println("2. Mostrar Estudiantes");
            System.out.println("3. Salir");
            System.out.println("Opcion");
            opcion = sc.nextInt();
            sc.nextLine();
            
            switch(opcion){
            case 1:
            System.out.println("Nombre");
            String nombre = sc.nextLine();
            
           System.out.println("Apellido");
           String apellido = sc.nextLine();
           
           System.out.println("Edad");
           int edad = sc.nextInt();
           
           System.out.println("Codigo");
           int codigo = sc.nextInt();
           
           System.out.println("Nota Final");
           float nota = sc.nextFloat();
           sc.nextLine();
           Estudiante e = new Estudiante(nombre, apellido, edad, codigo, nota);
           lista.add(e);
           System.out.println("Estudiante Agregado");
            break;
            
            case 2:
                if(lista.isEmpty()){
                    System.out.println("No hay Estudiantes Agregados");
                    } else{
                    for(Estudiante est : lista){
                        System.out.println("------");
                        est.mostrarDatos();
                    }
                }
            break;
        }
        } while(opcion !=3);
    }
        
        
        
}

   
        
        
       
    

