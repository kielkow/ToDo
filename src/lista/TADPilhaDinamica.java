package lista;

import java.util.EmptyStackException;

public interface TADPilhaDinamica {
    
    public boolean isEmpty();
    public int size();
    public void push(String nome, String data, String horInicial, String horFinal, String lugar);
    public Node pop() throws EmptyStackException;
    public Node top() throws EmptyStackException;
    
}