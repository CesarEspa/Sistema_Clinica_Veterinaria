import java.util.ArrayList

public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;

    public Perro(String nombre, int edad, String dueno, String raza) {
        super(nombre, edad, dueno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000+ (getEdad()*3000);
        this.vacunas = new ArrayList<String>(); // revisar
    }


    @Override
    public void registrarVacuna(String vacuna) {
        vacunas.add(vacuna);
    }

    @Override
    public int getVacunasAplicada() {
        return vacunas.size; // revisar
    }



}
