package ObjetosConstrutores;

public class Construtor {
    public static void main(String[] args) {
        Pessoa alguem = new Pessoa("Carlos");

        System.out.println(alguem.getNome());
        alguem.setNome("Davi");
        System.out.println(alguem.getNome());

    }

}
