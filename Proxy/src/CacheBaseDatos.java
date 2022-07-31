public class CacheBaseDatos extends BaseDatos {

    BaseDatos db = new BaseDatos();

    public CacheBaseDatos() {

    }

    @Override
    public String BuscarElemento(String data) {
        String cacheBD  = "Datos de la anterior búsqueda (cache) (" + data + ")";
        if (!db.cacheB){
            cacheBD = db.BuscarElemento(data);
        }
        return cacheBD;
    }

    @Override
    public String BuscarEstadoE() {
        String cacheBE  = "Datos de la anterior búsqueda del estado (cache)";
        if (!db.cacheBE) {
            cacheBE = db.BuscarEstadoE();
        }
        return cacheBE;
    }

    @Override
    public String GuardarElemento(String data, String estado) {
        if (estado == "Disponible") {
            String cacheG = "Elemento guardado (cache) (" + data + ")" ;
            if (!db.cacheG){
                cacheG = db.GuardarElemento(data, estado);
            }
            return cacheG;
        } else {
            return "El producto se encuentra en fase envio";
        }

    }

    @Override
    public String QuitarElemento(String data, String estado) {
        if (estado == "Disponible") {
            String cacheDD = "Dato ya eliminado (cache) (" + data + ")";
            if (!db.cacheD){
                cacheDD = db.QuitarElemento(data, estado);
            }
            return cacheDD;
        } else {
            return "El producto se encuentra en fase envio";
        }
    }
}
