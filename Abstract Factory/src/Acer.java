public class Acer implements Marca{
    @Override
    public Teclado Teclado() {
        return new TecladoAcer();
    }

    @Override
    public Mouse Mouse() {
        return new MouseAcer();
    }
}
