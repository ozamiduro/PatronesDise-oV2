public class BaseDatos implements IBaseDatos{

    boolean cacheB = false, cacheBE = false, cacheG = false, cacheD = false;
    @Override
    public String BuscarElemento(String data) {
        cacheB = true;
        return "Buscando elemento " + data + " en la BD";
    }

    @Override
    public String BuscarEstadoE() {
        // Esto del número aleatorio fue para representar de alguna forma el estado de un producto.
        // Sería diferente si de verdad se estuviera usando un BD.

        cacheBE = true;
        int num = (int)(Math.random()*2+1);
        String dat;

        Disponible dis = new Disponible();
        FEnvio fe = new FEnvio();

        if (num == 1) {
            dat = dis.disponibilidad();
        } else {
            dat = fe.faseEnvio();
        }

        return dat;
    }

    @Override
    public String GuardarElemento(String data, String estado) {
        cacheG = true;
        return "Elemento guardado " +  data + " en la BD";
    }

    @Override
    public String QuitarElemento(String data, String estado) {
        cacheD = true;
        return "Se elimino elemento " +  data + " de la BD";
    }
}
