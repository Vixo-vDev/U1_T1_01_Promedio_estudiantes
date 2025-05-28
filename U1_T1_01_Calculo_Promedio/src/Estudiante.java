public class Estudiante {
    

    //Atributos declarados
    private String nombre, matricula;
    private double[] notas = new double[5];
    double suma;
    

    //Getters and Setters
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getMatricula() {
        return matricula;
    }
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
    public double getNota(int i) {
        return notas[i];
    }
    public void setNota(int i, double n) {
        notas[i] = n;
    }

    //Método para obtener el promedio
    public double calularPromedio(){
        for(int j = 0; j <5; j++){
            suma = suma + notas[j];
        }

        return this.suma= suma/5;
    }

    //Método para saber si el promedio es mayora 70, y guardar si es true or false en una variable
    public boolean aprobado(){
        boolean aprobado = suma >= 70;
        return aprobado;
    }

    

}
