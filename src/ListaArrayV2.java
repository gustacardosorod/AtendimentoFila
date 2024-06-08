class Node {
    Object data;
    Node next;

    public Node(Object data) {
        this.data = data;
        this.next = null;
    }
}

public class ListaArrayV2 {
    private Node head;
    private int size;

    public ListaArrayV2() {
        this.head = null;
        this.size = 0;
    }

    public void insere(Object elemento, int posicao) {
        if (posicao < 0 || posicao > size) {
            throw new IndexOutOfBoundsException("Index: " + posicao + ", Size: " + size);
        }

        Node newNode = new Node(elemento);

        if (posicao == 0) {
            newNode.next = head;
            head = newNode;
        } else {
            Node current = head;
            for (int i = 0; i < posicao - 1; i++) {
                current = current.next;
            }
            newNode.next = current.next;
            current.next = newNode;
        }

        size++;
    }

    public Object seleciona(int posicao) {
        if (posicao < 0 || posicao >= size) {
            throw new IndexOutOfBoundsException("Index: " + posicao + ", Size: " + size);
        }

        Node current = head;
        for (int i = 0; i < posicao; i++) {
            current = current.next;
        }

        return current.data;
    }

    public void remove(int posicao) {
        if (posicao < 0 || posicao >= size) {
            throw new IndexOutOfBoundsException("Index: " + posicao + ", Size: " + size);
        }

        if (posicao == 0) {
            head = head.next;
        } else {
            Node current = head;
            for (int i = 0; i < posicao - 1; i++) {
                current = current.next;
            }
            current.next = current.next.next;
        }

        size--;
    }

    public int tamanho() {
        return size;
    }

    public static void main(String[] args) {
        ListaArrayV2 lista = new ListaArrayV2();
        lista.insere("Elemento 1", 0);
        lista.insere("Elemento 2", 1);
        lista.insere("Elemento 3", 2);

        System.out.println("Tamanho: " + lista.tamanho());
        System.out.println("Elemento na posição 1: " + lista.seleciona(1));

        lista.remove(1);
        System.out.println("Tamanho após remoção: " + lista.tamanho());
    }
}
