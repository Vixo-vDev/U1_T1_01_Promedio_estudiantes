public class Estudiante {
    

    //Atributos declarados
    private String nombre, matricula;
    private double[] notas = new double[5];
    
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
        this.notas = notas;
    }

    

}
