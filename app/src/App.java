import java.util.ArrayList;

import assistants.LexScanner;
import assistants.Token;

public class App {

    static ArrayList<Token> entrada = new ArrayList<Token>();
    public static void main(String[] args) {
        LexScanner scan = new LexScanner("input.txt");
        Token token = null;
        do {
            token = scan.nextToken();
            entrada.add(token);
            System.out.println(token);
        } while (token != null);

    }
}
