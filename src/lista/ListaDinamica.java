package lista;

public class ListaDinamica implements TADLista {

    public Node inicio, fim;
    public int quantidade;

    public ListaDinamica() {
        quantidade = 0;
        inicio = fim = null;
    }

    @Override
    public boolean isEmpty() {
        return quantidade == 0;
    }

    @Override
    public int size() {
        return quantidade;
    }

    @Override
    public void add(String data, String nome, int tempo, String lugar, int indice) throws IndexOutOfBoundsException {
        if (indice >= 0 && indice <= quantidade) {
            Node novo = new Node(data, nome, tempo, lugar);
            if (indice == 0) {
                novo.proximo = inicio;
                inicio = novo;
                if (quantidade == 0) {
                    fim = novo;
                }
            } else if (indice == quantidade) {
                fim.proximo = novo;
                fim = novo;
            } else {
                Node aux = inicio;
                for (int i = 0; i < indice - 1; i++) {
                    aux = aux.proximo;
                }
                novo.proximo = aux.proximo;
                aux.proximo = novo;
            }
            quantidade++;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    @Override
    public Node remove(int indice) throws IndexOutOfBoundsException {
        if (indice >= 0 && indice <= quantidade) {
            Node retorno;
            if (indice == 0) {
                retorno = inicio;
                inicio = inicio.proximo;
                retorno.proximo = null;
                if (inicio == null) {
                    fim = null;
                }
            } else {
                Node aux = inicio;
                for (int i = 0; i < indice - 1; i++) {
                    aux = aux.proximo;
                }
                retorno = aux.proximo;
                aux.proximo = retorno.proximo; //aux.proximo = aux.proximo.proximo;
                retorno.proximo = null;
                if (aux.proximo == null) {
                    fim = aux;
                }
            }
            quantidade--;
            return retorno;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Node set(String data,  String nome, int tempo, String lugar, int indice) throws IndexOutOfBoundsException {
        if (indice >= 0 && indice <= quantidade) {
            Node aux = inicio;
            for (int i = 0; i < indice; i++) {
                aux = aux.proximo;
            }
            String retornoData = aux.data;
            String retornoNome = aux.nome;
            int retornoTempo = aux.tempo;
            String retornoLugar = aux.lugar;

            aux.data = data;
            aux.nome = nome;
            aux.tempo = tempo;
            aux.lugar = lugar;
            return aux;
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public Node get(int indice) throws IndexOutOfBoundsException {
        if (indice >= 0 && indice <= quantidade) {
            Node aux = inicio;
            for (int i = 0; i < indice; i++) {
                aux = aux.proximo;
            }
            return aux;
        }
        throw new IndexOutOfBoundsException();
    }

    public void print(int indice) {
        try {
            System.out.println(this.get(indice).data);
            System.out.println(this.get(indice).nome);
            System.out.println(this.get(indice).tempo);
            System.out.println(this.get(indice).lugar);
            System.out.println(this.get(indice).completado);
            
            System.out.println("\n");
        } catch (Exception e) {
            System.out.println("Erro, indice nao existe");
        }
        
    }
    
    public void completar(int indice){
        this.get(indice).completado = true;
    }

}
