
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        //DAVID VALENZUELA GUIJOSA 3B-DSM

        Scanner read = new Scanner(System.in);
        boolean aprobado;

        //Creación de 5 instancias de la clase Estudiante :D
        Estudiante estudiante1 = new Estudiante();
        Estudiante estudiante2 = new Estudiante();
        Estudiante estudiante3 = new Estudiante();
        Estudiante estudiante4 = new Estudiante();
        Estudiante estudiante5 = new Estudiante();

        System.out.println("Estudiante 1");
        System.out.print("Ingresa tu nombre completo: ");
        estudiante1.setNombre(read.nextLine());
        System.out.print("Ingresa tu nombre matricula: ");
        estudiante1.setMatricula(read.nextLine());

        //For que permite al usuario ingresar 5 notas mediante un for, evitando la redundancia de código
        for(int j = 0; j < 5; j++){
            System.out.print("Ingresa la nota "+(j+1)+":");
            estudiante1.setNota(j, read.nextDouble());
        }
        read.nextLine(); //Permite limpiar el scanner despúes de un double

        System.out.println("=====================================================");
        System.out.println("Estudiante 2");
        System.out.println("Ingresa tu nombre completo: ");
        estudiante2.setNombre( read.nextLine());
        System.out.println("Ingresa tu nombre matricula: ");
        estudiante2.setMatricula( read.nextLine());

        //For que permite al usuario ingresar 5 notas mediante un for, evitando la redundancia de código
        for(int j = 0; j < 5; j++){
            System.out.print("Ingresa la nota "+(j+1)+":");
            estudiante2.setNota(j, read.nextDouble());
        }read.nextLine();

        System.out.println("Estudiante 3");
        System.out.println("Ingresa tu nombre completo: ");
        estudiante3.setNombre(read.nextLine());
        System.out.println("Ingresa tu nombre matricula: ");
        estudiante3.setMatricula(read.nextLine());

        //For que permite al usuario ingresar 5 notas mediante un for, evitando la redundancia de código
        for(int j = 0; j < 5; j++){
            System.out.print("Ingresa la nota "+(j+1)+":");
            estudiante3.setNota(j, read.nextDouble());
        }read.nextLine();

        System.out.println("Estudiante 4");
        System.out.println("Ingresa tu nombre completo: ");
        estudiante4.setNombre(read.nextLine());
        System.out.println("Ingresa tu nombre matricula: ");
        estudiante4.setMatricula(read.nextLine());

        //For que permite al usuario ingresar 5 notas mediante un for, evitando la redundancia de código
        for(int j = 0; j < 5; j++){
            System.out.print("Ingresa la nota "+(j+1)+":");
            estudiante4.setNota(j, read.nextDouble());
        }read.nextLine();

        System.out.println("Estudiante 5");
        System.out.println("Ingresa tu nombre completo: ");
        estudiante5.setNombre( read.nextLine());
        System.out.println("Ingresa tu nombre matricula: ");
        estudiante5.setMatricula(read.nextLine());

        //For que permite al usuario ingresar 5 notas mediante un for, evitando la redundancia de código
        for(int j = 0; j < 5; j++){
            System.out.print("Ingresa la nota "+(j+1)+":");
            estudiante5.setNota(j, read.nextDouble());
        }read.nextLine();


        //Mostrar los resultados en la consola
        System.out.println("Estudiante 1");
        System.out.println("Nombre: "+ estudiante1.getNombre());
        System.out.println("Promedio: "+ estudiante1.calularPromedio());
        if(estudiante1.aprobado()){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobaste, pero sigue, estás en un bucle infinito de persistencia");
        }
        System.out.println("=====================================================");

        System.out.println("Estudiante 2");
        System.out.println("Nombre: "+ estudiante2.getNombre());
        System.out.println("Promedio: "+ estudiante2.calularPromedio());
        if(estudiante2.aprobado()){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobaste, pero sigue, estás en un bucle infinito de persistencia");
        }
         System.out.println("=====================================================");

        System.out.println("Estudiante 3");
        System.out.println("Nombre: "+ estudiante3.getNombre());
        System.out.println("Promedio: "+ estudiante3.calularPromedio());
        if(estudiante3.aprobado()){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobaste, pero sigue, estás en un bucle infinito de persistencia");
        }
        System.out.println("=====================================================");

        System.out.println("Estudiante 4");
        System.out.println("Nombre: "+ estudiante4.getNombre());
        System.out.println("Promedio: "+ estudiante4.calularPromedio());
        if(estudiante4.aprobado()){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobaste, pero sigue, estás en un bucle infinito de persistencia");
        }
         System.out.println("=====================================================");

        System.out.println("Estudiante 5");
        System.out.println("Nombre: "+ estudiante5.getNombre());
        System.out.println("Promedio: "+ estudiante5.calularPromedio());
        if(estudiante5.aprobado()){
            System.out.println("Aprobado");
        }else{
            System.out.println("No aprobaste, pero sigue, estás en un bucle infinito de persistencia");
        }
         System.out.println("=====================================================");



        /*LA idea que tenía pero decidí optimizar el código y permitir que el usuario
          pueda ingresar los datos
        estudiante1.setNota(0, 9.8);
        estudiante1.setNota(1, 7.4);
        estudiante1.setNota(2, 10);
        estudiante1.setNota(3, 9.8);
        estudiante1.setNota(4, 9.8);*/
}}

