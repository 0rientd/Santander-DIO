package Heranca;

public class Carro extends Veiculo {
    public static void main(String[] args) {
        Carro meuCarro = new Carro();

        System.out.println("Meu modelo é => " + meuCarro.marca); // Cria uma instância do objeto, herdando funções mas sem
                                                              // passar argumento pois não é obrigatório.
        System.out.println("Alterando marca direto no atributo para => Fiat");
        meuCarro.marca = "Fiat";
        System.out.println("Meu modelo é => " + meuCarro.marca);

        System.out.println("Alterando valor direto na função para => Ferrari");
        meuCarro.setMarca("Ferrari");
        System.out.println("Meu modelo é => " + meuCarro.marca);

        // Esta opção da erro pois o atributo é privado e só pode ser acessando pela classe que ele pertence
        // System.out.println("Printando modelo acessando diretamente o atributo");
        // System.out.println(meuCarro.modelo);

        meuCarro.setModelo("448 Italia");
        System.out.println(meuCarro.printaModelo());
    }

}
