package modificadores;

public class modificador2 {
    public static void main(String[] args) {
        System.out.println(new modificador1().desenhaPublico(2,3));
        System.out.println(new modificador1().desenhaProtected(5, 10));
        //System.out.println(new modificador1().desenhaPrivate(1, 25)); Não é possível executar pois foi declarado como
        // privado. Sendo assim, só pode ser executado dentro do mesmo arquivo.
    }
}

