package lista;

public class Node {
    String data;
    String horInicial;
    String horFinal;
    String nome;
    String lugar;
    boolean completado;
    Node proximo;

    public Node(String dataInicio, String horInicial, String horFinal, String nome, String lugar) {
        this.data = dataInicio;
        this.horInicial = horInicial;
        this.horFinal = horFinal;
        this.nome = nome;
        this.lugar = lugar;
        this.completado = false;
        proximo = null;
    }
}
