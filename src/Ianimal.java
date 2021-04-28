public interface Ianimal {
    public int valor = 0;

    public default String comunicarse(){
        return "sonido";
    }
}
