import assistants.LexScanner;
import assistants.Token;

public class App {

    public static void main(String[] args) {
        LexScanner scan = new LexScanner("input.txt");
        Token token = null;
        do {
            token = scan.nextToken();
            System.out.println(token);
        } while (token != null);
    }
}
