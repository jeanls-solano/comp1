import java.util.ArrayList;

import assistants.LexScanner;
import assistants.Token;
import assistants.SyntheticAnalytic;

public class App {

    static ArrayList<Token> entrada = new ArrayList<Token>();
    private static SyntheticAnalytic syntheticAnalytic;

    public static void main(String[] args) {
        LexScanner scan = new LexScanner("input.txt");
        Token token = null;
        syntheticAnalytic = new SyntheticAnalytic();
        do {
            token = scan.nextToken();
            entrada.add(token);
            System.out.println(token);
        } while (token != null);
        entrada.remove(entrada.size()-1);
        entrada.remove(entrada.size()-1);
        syntheticAnalytic.AnalyticalDecision(entrada);
    }
}

// try {
//     syntheticAnalytic.entrada.add(token.getTermo());
// } catch (NullPointerException e) {
//     System.out.println("Final de arquivo");
// }