public class Aplicacion {
    public static void main(String[] args) {


        Animal perro = new Perro();

        Perro perrito = new Perro();

        Animal animalPolimorfico = new Perro();
        animalPolimorfico = perrito;
        animalPolimorfico = perro;

        Animal gato = new Gato();

        Ianimal gatito = new Gato();

    }




}
