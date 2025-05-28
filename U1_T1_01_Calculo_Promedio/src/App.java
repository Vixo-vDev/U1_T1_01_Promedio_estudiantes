public class App {
    public static void main(String[] args) throws Exception {
        double promedio;
        Estudiante estudiante1 = new Estudiante();

        estudiante1.setNota(0, 9.8);
        estudiante1.setNota(1, 7.4);
        estudiante1.setNota(2, 10);
        estudiante1.setNota(3, 9.8);
        estudiante1.setNota(4, 9.8);
        promedio = estudiante1.calularPromedio();
        System.out.println(promedio);
}}

