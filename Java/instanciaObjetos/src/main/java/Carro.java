public class Carro {
    private Integer PessoasNoCarro;

    public Integer SetarPessoasNoCarro(Integer quantidade) {
        if (quantidade <= 5 && quantidade >= 1) {
            return PessoasNoCarro = quantidade;
        } else if (quantidade > 5) {
            return PessoasNoCarro = 5;
        } else if (quantidade < 1) {
            return PessoasNoCarro = 1;
        } else {
            return PessoasNoCarro = 1;
        }
    }

    public String EntraPessoaNoCarro() {
        if (PessoasNoCarro >= 5) {
            return "Não é possível entrar mais gente... :(";
        } else {
            return "Entrou mais uma pessoa! No total agora são => " + ++PessoasNoCarro;
        }
    }

    public String SaiPessoaDoCarro() {
        if (PessoasNoCarro <= 1) {
            return "Tem que ter ao menos uma pessoa no carro";
        } else {
            return "Saiu uma pessoa! No total agora são => " + --PessoasNoCarro;
        }
    }

}
