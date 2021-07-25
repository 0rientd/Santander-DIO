package condicionais;

public class condicionais_if {
    public static void main(String[] args) {
        final var condicao = true;

        if (condicao) {
            System.out.println("A condicao eh verdadeira!");
        } else {
            System.out.println("A condicao eh falsa!");
        }

        if (condicao) {
            System.out.println("A condicao eh verdadeira com apenas uma lina!");
        }

        final var ternario = condicao ? "O ternario é verdadeiro" : "O ternario é falso";

        System.out.println(ternario);
    }
}
