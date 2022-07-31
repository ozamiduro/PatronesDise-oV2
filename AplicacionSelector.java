public class AplicacionSelector {

    public static void main (String args[]) {

        // Estos para el proxy
        BaseDatos db = new BaseDatos();
        CacheBaseDatos cdb = new CacheBaseDatos();

        // Estos para el State
        Disponible dis = new Disponible();
        FEnvio fe = new FEnvio();

        // Necesario para el Abstract Factory
        Marca marca;
        AcerDC dcA = new AcerDC();
        HPDC hpdc = new HPDC();

        // Se selecciona la marca
        marca =  hpdc.MDC();

        Aplicacion app = new Aplicacion(marca);

        String state = db.BuscarEstadoE();

        System.out.println("1 "+ app.MMarca().Asignar());
        System.out.println("2 "+ app.TMarca().Asignar());
        System.out.println("3 "+ cdb.BuscarElemento(app.MMarca().Asignar()));
        System.out.println("4 "+ cdb.BuscarElemento(app.MMarca().Asignar()));
        System.out.println("5 "+ cdb.GuardarElemento(app.MMarca().Asignar(), state));
        System.out.println("6 "+ cdb.GuardarElemento(app.MMarca().Asignar(), state));
    }
}
