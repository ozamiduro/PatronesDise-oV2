public class Disponible extends Estado{

    CacheBaseDatos cdb = new CacheBaseDatos();
    @Override
    String disponibilidad() {
        return "Disponible";
    }

    @Override
    String faseEnvio() {
        return null;
    }
}
