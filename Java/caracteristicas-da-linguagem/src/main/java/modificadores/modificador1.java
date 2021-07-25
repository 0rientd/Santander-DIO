package modificadores;

public class modificador1 {
    public String desenhaPublico(int x, int y) {
        return String.format("Desenhando coordenadas X = %d Y = %d", x, y);
    }

    protected String desenhaProtected(int x, int y) {
        return String.format("Desenhando coordenadas X = %d Y = %d", x, y);
    }

    private String desenhaPrivate(int x, int y) {
        return String.format("Desenhando coordenadas X = %d Y = %d", x, y);
    }

    public static void main(String[] args) {
        System.out.println(new modificador1().desenhaPrivate(1, 25));
    }

}
