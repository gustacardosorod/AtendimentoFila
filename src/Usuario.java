public class Usuario {
    private static int contador = 0;
    private int numero;

    public Usuario() {
        this.numero = ++contador;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "Usuário " + numero;
    }
}
