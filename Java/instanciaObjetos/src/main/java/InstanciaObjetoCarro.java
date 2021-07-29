public class InstanciaObjetoCarro {
    public static void main(String[] args) {
        Carro Fiat = new Carro();

        System.out.println("Pessoas no carro => " + Fiat.SetarPessoasNoCarro(10));
        System.out.println(Fiat.EntraPessoaNoCarro());

        System.out.println(Fiat.SaiPessoaDoCarro());
        System.out.println(Fiat.SaiPessoaDoCarro());
        System.out.println(Fiat.SaiPessoaDoCarro());
        System.out.println(Fiat.SaiPessoaDoCarro());
        System.out.println(Fiat.SaiPessoaDoCarro());

        System.out.println(Fiat.EntraPessoaNoCarro());
        System.out.println(Fiat.EntraPessoaNoCarro());
        System.out.println(Fiat.EntraPessoaNoCarro());
        System.out.println(Fiat.EntraPessoaNoCarro());
        System.out.println(Fiat.EntraPessoaNoCarro());

    }

}
