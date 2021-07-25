package condicionais;

public class condicionais_relacional {
    public static void main(String[] args) {
        final var numero = 9;

        if (numero < 5) {
            System.out.println("Numero menor do que 5.");
        } else if (numero >= 10) {
            System.out.println("Numero maior ou igual a 10.");
        } else {
            System.out.println("Numero está entre 5 e 9");
        }

        final var letra = "A";

        if (letra == "A" && numero == 10) {
            System.out.println("Condição com && é verdadeira");
        } else {
            System.out.println("Condição com && é falsa.");
        }

        if (letra == "B" || numero == 9) {
            System.out.println("Condição com || é verdadeira");
        } else {
            System.out.println("Condição com || é falsa.");
        }
    }

}
