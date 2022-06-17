package assistants;

public class Token {

    public static final int INTEIRO = 0;
    public static final int LETRA = 1;
    public static final int DECIMAL = 2;
    public static final int CALCULO = 3;
    public static final int  PARAMETRO = 4;
    public static final int  ESPACO = 5;

    private int  tipo;
    private String termo;

    /**
     * @return int return the tipo
     */
    public int getTipo() {
        return tipo;
    }

    /**
     * @param tipo the tipo to set
     */
    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    /**
     * @return String return the termo
     */
    public String getTermo() {
        return termo;
    }

    /**
     * @param termo the termo to set
     */
    public void setTermo(String termo) {
        this.termo = termo;
    }


    @Override
    public String toString() {
        return "Token [" + tipo + ", " + termo + "]";
    }
}
