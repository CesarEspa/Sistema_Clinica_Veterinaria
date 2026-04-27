public class Clinica implements Asegurable{

    private String nombreClinica;
    private String direccionClinica;
    private boolean esAsegurable;

    public Clinica(String nombreClinica, String direccionClinica, boolean esAsegurable) {
        this.nombreClinica = nombreClinica;
        this.direccionClinica = direccionClinica;
        this.esAsegurable = esAsegurable;
    }

    public String getNombreClinica() {
        return nombreClinica;
    }

    public void setNombreClinica(String nombreClinica) {
        this.nombreClinica = nombreClinica;
    }

    public String getDireccionClinica() {
        return direccionClinica;
    }

    public void setDireccionClinica(String direccionClinica) {
        this.direccionClinica = direccionClinica;
    }

    public boolean isEsAsegurable() {
        return esAsegurable;
    }

    public void setEsAsegurable(boolean esAsegurable) {
        this.esAsegurable = esAsegurable;
    }


    @Override
    public double calcularPrimaSeguro() {
        return 5000000;
    }

    @Override
    public String obtenerNumeroPoliza() {
        return "POL-CLINICA-" + nombreClinica;
    }

    @Override
    public boolean esAsegurable() {
        return true;
    }

    @Override
    public String getNumeroPoliza() {
        return "POL-CLINICA-" + nombreClinica;
    }
}
