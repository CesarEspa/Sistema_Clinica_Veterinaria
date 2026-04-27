import java.util.ArrayList;

public class Gato extends Animal implements Vacunable, Asegurable {

    private Boolean esEsterilizado;
    private ArrayList<String> listaVacunas;

    public Gato(String nombre, int edad, String dueno, boolean esEsterilizado) {
        super(nombre, edad, dueno);
        this.esEsterilizado = esEsterilizado;
        this.listaVacunas = new ArrayList<String>();
    }



    @Override
    public double calcularCostoConsulta() {
        return 38000;
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

    @Override
    public void registrarVacuna(String vacuna) {
        listaVacunas.add(vacuna);
    }

    @Override
    public int getVacunasAplicada() {
        return listaVacunas.size(); //
    }
}
