public interface IBaseDatos {

    String BuscarElemento(String data);
    String BuscarEstadoE();
    String GuardarElemento(String data, String estado);
    String QuitarElemento(String data, String estado);
}
