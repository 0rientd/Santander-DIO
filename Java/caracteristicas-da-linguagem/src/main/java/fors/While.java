package fors;

public class While {
    public static void main(String[] args) {
        var x = 0;

        while (x < 5) {
            System.out.println(String.format("Com 'while' => %d", x));
            x++;
        }

        var y = 0;
        do {
            System.out.println(String.format("Com 'do while' => %d", y));
        } while (y++ < 2);

    }
}
