package lista;

import java.util.EmptyStackException;

public interface TADPilha {
    
    public boolean isEmpty();
    public int size();
    public void push(String data, String descricao,  String nome, int tempo, String lugar);
    public Node pop() throws EmptyStackException;
    public Node top() throws EmptyStackException;
    
}
