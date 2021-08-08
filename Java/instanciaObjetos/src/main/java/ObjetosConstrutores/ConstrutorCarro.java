package ObjetosConstrutores;

public class ConstrutorCarro {
    public static void main(String[] args) {
        Carro MeuCarro = new Carro("EcoSport", "Ford", 2020);

        System.out.println(MeuCarro.getAno());
        System.out.println(MeuCarro.getMarca());
        System.out.println(MeuCarro.getModelo());

        System.out.println(MeuCarro.getVariante());
        MeuCarro.setVariante("EcoSport 2021");
        System.out.println(MeuCarro.getVariante());
    }

}
