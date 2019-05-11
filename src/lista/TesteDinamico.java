package lista;

public class TesteDinamico {

    public static void main(String[] args) {
        ListaDinamica atividade = new ListaDinamica();
        
        atividade.add("01-02-18", "correr1", 15, "parque ibirapuera1", 0);
        atividade.add("01-02-19", "correr2", 16, "parque ibirapuera2", 1);
        atividade.add("01-02-20", "correr3", 17, "parque ibirapuera3", 2);
        
        atividade.print(0);
        atividade.completar(0);
        atividade.print(0);
        
    }
}
