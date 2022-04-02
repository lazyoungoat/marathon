package guide.example.chapter2;

public class Literals {
    public static void main(String[] args) {
        int number;
        //when the literal is compiled, the underscores are simply discarded.
        number = 233_44;
        System.out.println(number);
        int hex = 0xff;
        System.out.println("hex FF in decimal is " + hex);

        int oct = 0112;
        System.out.println("oct 112 in decimal is " + oct);

        int bi = 0b11_1;
        System.out.println("bi 11_1 in decimal is " + bi);

        //Character Escape Sequences
        char ch = '\t';
        System.out.println("99" + ch + '\b' + "wl");
        System.out.println(ch);

        //Demonstrate escape sequences in strings.
        System.out.println("first line \n waswas");
        System.out.println("second line \t isis");

    }
}
