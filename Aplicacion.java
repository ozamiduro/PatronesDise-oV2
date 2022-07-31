public class Aplicacion {

    Marca marca;

    public Aplicacion(Marca marca) {
        this.marca = marca;
    }

    public Mouse MMarca() {
        return marca.Mouse();
    }

    public Teclado TMarca() {
        return marca.Teclado();
    }
}
