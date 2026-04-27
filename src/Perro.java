import java.util.ArrayList

public class Perro extends Animal implements Vacunable {
    private String raza;
    list <String> vacunas = new ArrayList<>();

    public Perro(String nombre, int edad, String dueno, String raza) {
        super(nombre, edad, dueno);
        this.raza = raza;
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000+ (getEdad()*3000);
    }


    @Override
    public void registrarVacuna(String vacuna) {
        vacunas.add(vacuna);
    }

    @Override
    public int getVacunasAplicada() {
        return 0;
    }
}
