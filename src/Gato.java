public class Gato extends Animal {
    private Boolean esEsterilizado;

    public Gato(String nombre, int edad, String dueno, boolean esEsterilizado) {
        super(nombre, edad, dueno);
        this.esEsterilizado = esEsterilizado;
    }

    @Override
    public double calcularCostoConsulta() {
        return 38000;
    }
}
