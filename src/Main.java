
public class Main {
    public static void main(String[] args) {
        Animal m1 = new Perro("Max", 2, "MARIA","bulldog");
        System.out.println(m1.prestacionFicha());

        Animal m2 = new Gato("Michi", 4, "Juan",true);
        System.out.println(m2.prestacionFicha());

        Animal m3 = new Ave("Piolin", 1, "Pedro",50);
        System.out.println(m3.prestacionFicha());

        ((Vacunable) m1).registrarVacuna("Rabia");
        ((Vacunable) m1).registrarVacuna("Moquillo");
        System.out.println(((Vacunable) m1).getVacunasAplicada());

        ((Vacunable) m2).registrarVacuna("Rabia");
        ((Vacunable) m2).registrarVacuna("Moquillo");
        System.out.println(((Vacunable) m2).getVacunasAplicada());

    }
}