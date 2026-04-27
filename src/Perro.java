import java.util.ArrayList;


public class Perro extends Animal implements Vacunable, Asegurable {
    private String raza;
    private ArrayList<String> listaVacunas;


    public Perro(String nombre, int edad, String dueno, String raza) {
        super(nombre, edad, dueno);
        this.raza = raza;
        this.listaVacunas = new ArrayList<>();
    }

    @Override
    public double calcularCostoConsulta() {
        return 45000+ (getEdad()*3000);
    }


    @Override
    public void registrarVacuna(String vacuna) {
        listaVacunas.add(vacuna);
    }

    @Override
    public int getVacunasAplicada() {
        return listaVacunas.size(); // revisar
    }


    @Override
    public double calcularPrimaSeguro() {
        return 0;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "";
    }

    @Override
    public boolean esAsegurable() {
        return false;
    }

    @Override
    public String getNumeroPoliza() {
        return "";
    }
}
