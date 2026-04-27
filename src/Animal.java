public abstract class Animal {
    private String nombre;
    private int edad;
    private String dueno;

    public Animal() {}


    public Animal(String nombre, int edad, String dueno) {
        this.nombre = nombre;
        this.edad = edad;
        this.dueno = dueno;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDueno() {
        return dueno;
    }

    public void setDueno(String dueno) {
        this.dueno = dueno;
    }

    public abstract double calcularCostoConsulta();

    public String prestacionFicha(){
        return "veteriaria my Dogs, dueño: "+ getDueno() + " ,Edad Mascota " + getEdad() +" ,Nombre Mascota "+ getNombre()+ " , Valor Consulta "+ calcularCostoConsulta();
    }


}








