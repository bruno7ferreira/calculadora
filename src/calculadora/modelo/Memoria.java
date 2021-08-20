package calculadora.modelo;

public class Memoria {

    private static Memoria instancia = new Memoria();

    private String textoAtual = "";

    private Memoria() {
    }

    public static Memoria getInstancia() {
        return instancia;
    }

    public String getTextoAtual() {
        return textoAtual.isEmpty() ? "0" : textoAtual;
    }
}
