package fors;

public class For {
    public static void main(String[] args) {
        for (int i = 0; i <= 10; i++) { // For igual em C
            System.out.println(String.format("I = %d", i));
        }

        for (int x = 0; x <= 5; x = x +1) // Tudo numa mesma linha
            System.out.println(String.format("X = %d", x));
    }
}
