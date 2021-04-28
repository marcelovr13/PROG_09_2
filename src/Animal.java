public abstract class Animal implements Ianimal {
    private String nombre;

    public Animal() {
    }

    public String getNombre() {
        return nombre;
    }
    public abstract String tipoAnimal();
}
