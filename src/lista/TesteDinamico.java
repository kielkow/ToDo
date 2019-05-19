package lista;

public class TesteDinamico {

    public static void main(String[] args) {
        ListaDinamica atividade = new ListaDinamica();
        atividade.add("correr", "10/05", "10:00", "10:30", "parque", 0);
        atividade.add("correr", "10/05", "10:00", "10:30", "parque", 1);
        atividade.add("correr", "10/05", "10:00", "10:30", "parque", 2);
        System.out.println(atividade.size());
    }
}
