import java.util.ArrayList;

import assistants.LexScanner;
import assistants.Token;
import assistants.SyntheticAnalytic;

public class App {

    static ArrayList<Token> entrada = new ArrayList<Token>();
    private static SyntheticAnalytic syntheticAnalytic;

    public static void main(String[] args) {
        LexScanner scan = new LexScanner("input.txt");
        Token token = new Token();
        syntheticAnalytic = new SyntheticAnalytic();
        do {
            token = scan.nextToken();
            entrada.add(token);
        } while (token != null);
        entrada.remove(entrada.size() -1);
        syntheticAnalytic.AnalyticalDecision(entrada);
    }
}

/*
 *             try {
                if(token.getTermo().equals("$")){
                    syntheticAnalytic.AnalyticalDecision(entrada);
                    System.out.println("\n proxima linha \n");
                    entrada.clear();
                }         
            } catch (NullPointerException e) {
                System.out.println("acabou !!");
            }
 */