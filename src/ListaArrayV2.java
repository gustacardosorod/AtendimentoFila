import java.util.ArrayList;

public class ListaArrayV2 {
    private ArrayList<Object> lista;

    public ListaArrayV2() {
        lista = new ArrayList<>();
    }

    public void insere(Object elemento, int posicao) {
        lista.add(posicao, elemento);
    }

    public Object seleciona(int posicao) {
        return lista.get(posicao);
    }

    public void remove(int posicao) {
        lista.remove(posicao);
    }

    public int tamanho() {
        return lista.size();
    }
}
