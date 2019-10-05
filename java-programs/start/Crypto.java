import java.util.Scanner;

public class Crypto {
    public static void main(String[] agrs) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the text to encrypt : ");
        String text = input.nextLine();

        String encrypted = encryptText(text);

    }


    public static String normalizeText(String text) {

        Integer length = text.length();
        Integer i = 0;

      //  If(text[i] == "." || text[i] == "," || text[i] == ";" || text[i] == ":" || text[i] == "'" || text[i] == "\"" || text[i] == "!" || text[i] == "?" || text[i] == "(" || text[i] == ")") {

        }

    }

    public static String obify(String text) {

    }

    public static String ceasarify(String text) {

    }

    public static String groupify(String text) {

    }

    public static String encryptText(String text) {

        normalizeText(text);

    }
}
