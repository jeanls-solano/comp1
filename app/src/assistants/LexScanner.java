package assistants;

import java.nio.file.Files;
import java.nio.file.Paths;

public class LexScanner {
    
    private char[] conteudo;
    private int estado;
    private int pos;

    //ler o arquivo txt e transformar em uma string
    public LexScanner(String arquivo){
        try {
            byte[] bytes = Files.readAllBytes(Paths.get(arquivo));
            conteudo = (new String(bytes)).toCharArray();
        } catch (Exception e) {
            System.out.println("entrou aq");
            e.printStackTrace();
        }
    }

    public Token nextToken(){
        if(isEOF()){
            return null;
        }
        estado = 0;
        char c;
        Token token = null;
        String termo = "";
        while(true){
            c = nextChar();
            switch(estado){
                case  0:
                    if(isEspaco(c)){
                        estado = 1;
                    }else if(isParametro(c)){
                        termo += c;
                        estado = 2;
                    }else if(isCalculo(c)){
                        termo += c;
                        estado = 3;
                    }else if(isNumero(c)){
                        termo += c;
                        estado = 4;
                    }else if(isLetraE(c)){
                        termo += c;
                        estado = 8;
                    }else{
                        //perguntar ao professor
                        System.out.println("c = (" + c + "]");
                        throw new RuntimeException("token não reconhecido");
                    }
                    break;

                case 1:
                    if(isEspaco(c)){
                        estado = 1;
                    }else{
                        token = new Token();
                        token.setTipo(Token.ESPACO);
                        back();
                        System.out.println("ESPACO");
                        return token;
                    }
                    break;

                case 2:
                    token = new Token();
                    token.setTipo(Token.PARAMETRO);
                    token.setTermo(termo);
                    back();
                    System.out.println("PARAMETRO");
                    return token;

                case 3:
                    token = new Token();
                    token.setTipo(Token.CALCULO);
                    token.setTermo(termo);
                    back();
                    System.out.println("CALCULO");
                    return token;

                case 4:
                    if(isNumero(c)){
                        termo += c;
                        estado = 4;
                    }
                    if(isPonto(c)){
                        termo += c;
                        estado = 6;
                    }else{
                        estado = 5;
                    }
                    break;

                case 5:
                    token = new Token();
                    token.setTipo(Token.INTEIRO);
                    token.setTermo(termo);
                    back();
                    System.out.println("INTEIRO");
                    return token;

                case 6:
                    if(isNumero(c)){
                        termo += c;
                        estado = 7;
                    }else{
                        System.out.println(c);
                        throw new RuntimeException("token não reconhecido");
                    }
                    break;

                case 7:
                    if(isNumero(c)){
                        estado = 7;
                    }else{
                        token = new Token();
                        token.setTipo(Token.DECIMAL);
                        token.setTermo(termo);
                        back();
                        System.out.println("DECIMAL");
                        return token;
                    }
                    break;

                case 8: 
                    if(isLetraX(c)){
                        termo += c;
                        estado = 9;
                    }else{
                        System.out.println(c);
                        throw new RuntimeException("token não reconhecido X");
                    }
                    break;

                case 9:
                    if(isLetraP(c)){
                        termo += c;
                        estado = 10;
                    }else{
                        System.out.println(c);
                        throw new RuntimeException("token não reconhecido P");
                    }
                    break;

                case 10:
                    token = new Token();
                    token.setTipo(Token.LETRA);
                    token.setTermo(termo);
                    back();
                    System.out.println("LETRA");
                    return token;

            }
        }
    }


//verificar o tipo do arquivo lido
    private boolean isCalculo(char c){
        return c == '/' || c == '*' || c == '^' || c == '+' || c == '-'; 
    }

    private boolean isParametro(char c){
        return c == '['  || c == '(' || c == ']' ||  c == ')';
    }
    
    private boolean isEspaco(char c){
        return c == ' ' || c == '\n' || c == '\r';
    }
    // \\r\\n|\\n"

    private boolean isNumero(char c){
        return c >= '0'  && c <= '9'; 
    }
    
    private boolean isLetraE(char c){
        return c == 'E'; 
    }

    private boolean isLetraX(char c){
        return  c == 'X'; 
    }

    private boolean isLetraP(char c){
        return  c == 'P'; 
    }

    private boolean isPonto(char c){
        return c == '.';
    }

    //verifica se esta no fim da lista
    private boolean isEOF(){
        return pos == conteudo.length;
    }
    
    // incrementa a posicao e retorna ela
    private char nextChar(){
        if(isEOF()){
            return 0;
        }
        return conteudo[pos++];
    }

    //retorna a posicao anterior
    private void back(){
        if(!isEOF()){
            pos--;
        }
    }
}
