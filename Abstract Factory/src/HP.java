public class HP implements Marca{
    @Override
    public Teclado Teclado() {
        return new TecladoHP();
    }

    @Override
    public Mouse Mouse() {
        return new MouseHP();
    }
}
