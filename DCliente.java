public abstract class DCliente {

    abstract Marca MDC();
}

class AcerDC extends DCliente{

    @Override
    Marca MDC() {
        return new Acer();
    }

}
class HPDC extends DCliente{

    @Override
    Marca MDC() {
        return new HP();
    }

}
