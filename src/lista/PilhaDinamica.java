package lista;
   
import java.util.EmptyStackException;

public class PilhaDinamica implements TADPilhaDinamica {

    public Node topo;
    public int quantidade;

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
    public void push(String nome, String data, String horInicial, String horFinal, String lugar) {
        Node novo = new Node(nome, data, horInicial, horFinal, lugar);
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