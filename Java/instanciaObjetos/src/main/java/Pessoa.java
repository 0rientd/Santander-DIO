public class Pessoa {
    private String nome = "Carlos";

    public String getNome() {
        return nome;
    }

    public String falarMeuPrimeiroNome() {
        return "Olá, meu primeiro nome é " + getNome();
    }

}
