package lista;
   
import java.util.EmptyStackException;

public class PilhaDinamica implements TADPilha {

    private Node topo;
    private int quantidade;

    public PilhaDinamica() {
        topo = null;
        quantidade = 0;
    }

    @Override
    public boolean isEmpty() {
        return topo == null;
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public void push(String data, String descricao,  String nome, int tempo, String lugar) {
        Node novo = new Node(data, descricao, nome, tempo, lugar);
        novo.proximo = topo;
        topo = novo;
        quantidade++;
    }

    @Override
    public Node pop() throws EmptyStackException {
        if(!isEmpty()){
            Node aux = topo;
            topo = topo.proximo;
            aux.proximo = null;
            quantidade--;
            return aux;
        }
        throw new EmptyStackException();
    }

    @Override
    public Node top() throws EmptyStackException {
         if(!isEmpty()){
            return topo;
        }
        throw new EmptyStackException();
    }
}
