package lista;

import java.util.EmptyStackException;

public class PilhaEstatica implements TADPilhaEstatica {
    public String vetor[];
    public int topo;

    public PilhaEstatica(int tamanho) {
        vetor = new String[tamanho];
        topo = -1;
    }

    @Override
    public boolean isEmpty() {
        return topo == -1;
    }

    @Override
    public boolean isFull() {
        return topo == vetor.length - 1;
    }

    @Override
    public int size() {
        return topo + 1;
    }

    @Override
    public void push(String elemento) {
        if (!isFull()) {
            topo++;
            vetor[topo] = elemento;
        }
    }

    @Override
    public String pop() throws EmptyStackException {
        if (!isEmpty()) {
            String retorno = vetor[topo];
            topo--;
            return retorno;
        }
        throw new EmptyStackException();
    }

    @Override
    public String top() throws EmptyStackException {
        if (!isEmpty()) {
            return vetor[topo];
        }
        throw new EmptyStackException();
    }
}
