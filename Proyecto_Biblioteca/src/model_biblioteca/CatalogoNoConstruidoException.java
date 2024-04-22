package model_biblioteca;

public class CatalogoNoConstruidoException extends RuntimeException{
    public CatalogoNoConstruidoException(String mensaje) {
        super(mensaje);
    }
}
