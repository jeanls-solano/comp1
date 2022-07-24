package assistants;

import java.util.ArrayList;

public class SyntheticAnalytic {

    private ArrayList<String> simbolo = new ArrayList<String>();
    private ArrayList<Integer> estado = new ArrayList<Integer>();
    private Boolean desvio = false;
    private Boolean acc = true;

    public void AnalyticalDecision(ArrayList<Token> entrada) {
        estado.add(0);

        Token token = new Token();
        token.setTipo(Token.FIM);
        token.setTermo("$");
        entrada.add(token);
        
        System.out.println(entrada);
        while (acc) {
            if (!desvio) {
                //System.out.println(" entrada = " + entrada.get(0).getTermo() + " estado = " + estado + " simbolos ="+ simbolo +" desvio = " + desvio);
                if (entrada.get(0).getTermo().equals("+")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 1:
                            System.out.println("s8");
                            estado.add(8);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            entrada.remove(0);
                            break;
                        case 2:
                            System.out.println("E -> T");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("E");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;
                        case 3:
                            System.out.println("T -> P");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("T");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;
                        
                        case 5:
                            System.out.println("P -> F");
                            // P -> F
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("P");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;
                        case 7:
                            System.out.println("F-> id");
                            // 9 = F-> id
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("F");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            // vai ter que verificar o simbolo atual e o estado
                            desvio = true;
                            break;

                        case 14:
                            System.out.println("s8");
                            estado.add(8);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 15:
                            System.out.println("E -> E + T");
                            // 1 = E -> E + T
                            // desempilha O " +, T " e mantém o E
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);

                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;
                        case 16:
                            System.out.println("E -> E - T");
                            // 1 = E -> E - T
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 17:
                            System.out.println("T -> T * P");
                            // T -> T * P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 18:
                            System.out.println("T -> T / P");
                            // T -> T / P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 19:
                            System.out.println("T -> T ^ P");
                            // T -> T ^ P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 21:
                            System.out.println("F -> (E)");
                            // F -> (E)
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("F");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 22:
                            System.out.println("P -> exp [F]");
                            // P -> exp [F]
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("P");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            
                            desvio = true;
                            break;
                    }
                } else if (entrada.get(0).getTermo().equals("-")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 1:
                            System.out.println("s9");
                            estado.add(9);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 2:
                            System.out.println("E -> T");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("E");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;
                        case 3:
                            System.out.println("T -> P");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("T");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 5:
                            System.out.println("P -> F");
                            // P -> F
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("P");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 7:
                            System.out.println("F-> id");
                            // 9 = F-> id
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("F");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            // vai ter que verificar o simbolo atual e o estado
                            desvio = true;
                            break;

                        case 14:
                            System.out.println("s9");
                            estado.add(9);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 15:
                            System.out.println("E -> E + T");
                            // 1 = E -> E + T
                            // desempilha O " +, T " e mantém o E
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);

                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                        case 16:
                            System.out.println("E -> E - T");
                            // 1 = E -> E - T
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;
                        case 17:
                            System.out.println("T -> T * P");
                            // T -> T * P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 18:
                            System.out.println("T -> T / P");
                            // T -> T / P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 19:
                            System.out.println("T -> T ^ P");
                            // T -> T ^ P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 21:
                            System.out.println("F -> (E)");
                            // F -> (E)
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("F");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 22:
                            System.out.println("P -> exp [F]");
                            // P -> exp [F]
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("P");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                    }
                } else if (entrada.get(0).getTermo().equals("*")) {
                    // + get()
                    switch (estado.get(estado.size() - 1)) {
                        case 2:
                            System.out.println("s10");
                            estado.add(10);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 3:
                            System.out.println("T -> P");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("T");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 5:
                            System.out.println("P -> F");
                            // 9 = P -> F
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("P");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 7:
                            System.out.println("F-> id");
                            // 9 = F-> id
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("F");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            // vai ter que verificar o simbolo atual e o estado

                            desvio = true;
                            break;

                        case 15:
                            System.out.println("s10");
                            estado.add(10);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 16:
                            System.out.println("s10");
                            estado.add(10);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 17:
                            System.out.println("T -> T * P");
                            // T -> T * P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 18:
                            System.out.println("T -> T / P");
                            // T -> T / P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 19:
                            System.out.println("T -> T ^ P");
                            // T -> T ^ P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 21:
                            System.out.println("F -> (E)");
                            // F -> (E)
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("F");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 22:
                            System.out.println("P -> exp [F]");
                            // P -> exp [F]
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("P");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                    }
                } else if (entrada.get(0).getTermo().equals("/")) {

                    switch (estado.get(estado.size() - 1)) {
                        case 2:
                            System.out.println("s11");
                            estado.add(11);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 3:
                            System.out.println("T -> P");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("T");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 5:
                            System.out.println("P -> F");
                            // P -> F
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("P");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);

                            desvio = true;

                            break;

                        case 7:
                            System.out.println("F-> id");
                            // F-> id
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("F");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 15:
                            System.out.println("s11");
                            estado.add(11);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 16:
                            System.out.println("s11");
                            estado.add(11);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 17:
                            System.out.println("T -> T * P");
                            // T -> T * P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 18:
                            System.out.println("T -> T / P");
                            // T -> T / P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 19:
                            System.out.println("T -> T ^ P");
                            // T -> T ^ P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 21:
                            System.out.println("F -> (E)");
                            // F -> (E)
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("F");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 22:
                            System.out.println("P -> exp [F]");
                            // P -> exp [F]
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("P");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                    }
                } else if (entrada.get(0).getTermo().equals("^")) {

                    switch (estado.get(estado.size() - 1)){
                        case 3:
                            System.out.println("s12");
                            estado.add(12);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 5:
                            System.out.println("P -> F");
                            // P -> F
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("P");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 7:
                            System.out.println("F-> id");
                            // F-> id
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("F");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 17:
                            System.out.println("s11");
                            estado.add(11);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 18:
                            System.out.println("s11");
                            estado.add(11);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 19:
                            System.out.println("T -> T ^ P");
                            // T -> T ^ P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 21:
                            System.out.println("F -> (E)");
                            // F -> (E)
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("F");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 22:
                            System.out.println("P -> exp [F]");
                            // P -> exp [F]
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("P");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                    }
                } else if (entrada.get(0).getTermo().equals("EXP")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("s4");
                            estado.add(4);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 6:
                            System.out.println("s4");
                            estado.add(4);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 8:
                            System.out.println("s4");
                            estado.add(4);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);

                            break;

                        case 9:
                            System.out.println("s4");
                            estado.add(4);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 10:
                            System.out.println("s4");
                            estado.add(4);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 11:
                            System.out.println("s4");
                            estado.add(4);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);

                            break;

                    }
                } else if (entrada.get(0).getTermo().equals("[")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 4:
                            System.out.println("s13");
                            estado.add(13);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                    }
                } else if (entrada.get(0).getTermo().equals("]")) {
                    // + get(estado.get( estado.size()-1))
                    switch (estado.get(estado.size() - 1)) {
                        case 7:
                            System.out.println("F-> id");
                            // 9 = F-> id
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("F");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            // vai ter que verificar o simbolo atual e o estado
                            desvio = true;
                            break;

                        case 20:
                            System.out.println("s22");
                            estado.add(22);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 21:
                            System.out.println("F -> (E)");
                            // F -> (E)
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("F");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                    }
                } else if (entrada.get(0).getTermo().equals("(")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("s6");
                            estado.add(6);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 8:
                            System.out.println("s6");
                            estado.add(6);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 9:
                            System.out.println("s6");
                            estado.add(6);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 10:
                            System.out.println("s6");
                            estado.add(6);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 11:
                            System.out.println("s6");
                            estado.add(6);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 12:
                            System.out.println("s6");
                            estado.add(6);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 13:
                            System.out.println("s6");
                            estado.add(6);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                    }
                } else if (entrada.get(0).getTermo().equals(")")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 2:
                            System.out.println("E -> T");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("E");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;
                        case 3:
                            System.out.println("T -> P");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("T");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 5:
                            System.out.println("P -> F");
                            // 9 = P -> F
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("P");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 7:
                            System.out.println("F-> id");
                            // 9 = F-> id
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("F");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            // vai ter que verificar o simbolo atual e o estado
                            desvio = true;
                            break;

                        case 14:
                            System.out.println("s21");
                            estado.add(21);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 15:
                            System.out.println("E -> E + T");
                            // 1 = E -> E + T
                            // desempilha O " +, T " e mantém o E
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);

                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;
                        case 16:
                            System.out.println("E -> E - T");
                            // 1 = E -> E - T
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 17:
                            System.out.println("T -> T * P");
                            // T -> T * P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 18:
                            System.out.println("T -> T / P");
                            // T -> T / P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 19:
                            System.out.println("T -> T ^ P");
                            // T -> T ^ P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 21:
                            System.out.println("F -> (E)");
                            // F -> (E)
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("F");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 22:
                            System.out.println("P -> exp [F]");
                            // P -> exp [F]
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("P");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;
                    }
                } else if ((entrada.get(0).getTipo() == Token.INTEIRO)
                        || (entrada.get(0).getTipo() == Token.DECIMAL)) {
                    // + get(estado.get( estado.size()-1))
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("s7");
                            estado.add(7);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 6:
                            System.out.println("s7");
                            estado.add(7);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;

                        case 8:
                            System.out.println("s7");
                            estado.add(7);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 9:
                            System.out.println("s7");
                            estado.add(7);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 10:
                            System.out.println("s7");
                            estado.add(7);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 11:
                            System.out.println("s7");
                            estado.add(7);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 12:
                            System.out.println("s7");
                            estado.add(7);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                        case 13:
                            System.out.println("s7");
                            estado.add(7);
                            // simbolo recebe a entrada
                            simbolo.add(entrada.get(0).getTermo());
                            // remove o ultimo elemento da entrada
                            entrada.remove(0);
                            break;
                    }
                } else if (entrada.get(0).getTermo().equals("$")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 1:
                            System.out.println("aceitou eba !!");
                            acc = false;
                            break;

                        case 2:
                            System.out.println("E -> T");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("E");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;
                        case 3:
                            System.out.println("T -> P");
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("T");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 5:
                            System.out.println("P -> F");
                            // P -> F
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("P");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;

                        case 7:
                            System.out.println("F-> id");
                            //  F-> id
                            // desempilha o ultimo simbolo
                            simbolo.remove(simbolo.size() - 1);
                            // subistitui pela redução
                            simbolo.add("F");
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            // vai ter que verificar o simbolo atual e o estado
                            desvio = true;
                            break;

                        case 15:
                            System.out.println("E -> E + T");
                            // 1 = E -> E + T
                            // desempilha O " +, T " e mantém o E
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);

                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;
                        case 16:
                            System.out.println("E -> E - T");
                            // 1 = E -> E - T
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 17:
                            System.out.println("T -> T * P");
                            // T -> T * P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 18:
                            System.out.println("T -> T / P");
                            // T -> T / P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 19:
                            System.out.println("T -> T ^ P");
                            // T -> T ^ P
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 21:
                            System.out.println("F -> (E)");
                            // F -> (E)
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("F");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);

                            desvio = true;
                            break;

                        case 22:
                            System.out.println("P -> exp [F]");
                            // P -> exp [F]
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            simbolo.remove(simbolo.size() - 1);
                            // desempilha o estado atual
                            simbolo.add("P");
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            estado.remove(estado.size() - 1);
                            desvio = true;
                            break;
                    }
                } else if (entrada.get(0).getTermo().equals("E")) {
                    // desvio
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("1");
                            estado.add(1);
                            break;
                        case 6:
                            System.out.println("14");
                            estado.add(14);
                            break;
                    }
                } else if (entrada.get(0).getTermo().equals("T")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("2");
                            estado.add(2);
                            break;
                        case 6:
                            System.out.println("2");
                            estado.add(2);
                            break;

                        case 8:
                            System.out.println("15");
                            estado.add(15);
                            break;

                        case 9:
                            System.out.println("16");
                            estado.add(16);
                            break;

                    }
                } else if (entrada.get(0).getTermo().equals("P")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("3");
                            estado.add(3);
                            break;

                        case 6:
                            System.out.println("3");
                            estado.add(3);
                            break;

                        case 8:
                            System.out.println("3");
                            estado.add(3);
                            break;

                        case 9:
                            System.out.println("3");
                            estado.add(3);
                            break;

                        case 10:
                            System.out.println("17");
                            estado.add(17);
                            break;

                        case 11:
                            System.out.println("18");
                            estado.add(18);
                            break;

                    }
                } else if (entrada.get(0).getTermo().equals("F")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("5");
                            estado.add(5);
                            break;

                        case 6:
                            System.out.println("5");
                            estado.add(5);
                            break;

                        case 8:
                            System.out.println("5");
                            estado.add(5);
                            break;

                        case 9:
                            System.out.println("5");
                            estado.add(5);
                            break;

                        case 10:
                            System.out.println("5");
                            estado.add(5);
                            break;

                        case 11:
                            System.out.println("5");
                            estado.add(5);
                            break;

                        case 12:
                            System.out.println("19");
                            estado.add(19);
                            break;

                        case 13:
                            System.out.println("20");
                            estado.add(20);
                            break;
                    }
                } else {
                    System.out.println(" quebrou \n");
                    System.out.println("entrou entrada = " + entrada.get(0).getTermo() + " estado = " + estado);
                    System.exit(0);
                }
            } else {
                //System.out.println("desvio entrada = " + simbolo.get(simbolo.size() - 1) + " estado = " + estado);
                // se desvio estiver autorizado = verdadeiro
                // eu faco as verificacoes dos simbolos
                if (simbolo.get(simbolo.size() - 1).equals("E")) {
                    // desvio
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("desvio 1");
                            estado.add(1);
                            desvio = false;
                            break;
                        case 6:
                            System.out.println("desvio 14");
                            estado.add(14);
                            desvio = false;
                            break;
                    }
                } else if (simbolo.get(simbolo.size() - 1).equals("T")) {
                    // + get(estado.get( estado.size()-1))
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("desvio 2");
                            estado.add(2);
                            desvio = false;
                            break;
                        case 6:
                            System.out.println("desvio 2");
                            estado.add(2);
                            desvio = false;
                            break;

                        case 8:
                            System.out.println("desvio 15");
                            estado.add(15);
                            desvio = false;
                            break;

                        case 9:
                            System.out.println("desvio 16");
                            estado.add(16);
                            desvio = false;
                            break;

                    }
                } else if (simbolo.get(simbolo.size() - 1).equals("P")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("desvio 3");
                            estado.add(3);
                            desvio = false;
                            break;

                        case 6:
                            System.out.println("desvio 3");
                            estado.add(3);
                            desvio = false;
                            break;

                        case 8:
                            System.out.println("desvio 3");
                            estado.add(3);
                            desvio = false;
                            break;

                        case 9:
                            System.out.println("desvio 3");
                            estado.add(3);
                            desvio = false;
                            break;

                        case 10:
                            System.out.println("desvio 17");
                            estado.add(17);
                            desvio = false;
                            break;

                        case 11:
                            System.out.println("desvio 18");
                            estado.add(18);
                            desvio = false;
                            break;

                    }
                } else if (simbolo.get(simbolo.size() - 1).equals("F")) {
                    switch (estado.get(estado.size() - 1)) {
                        case 0:
                            System.out.println("desvio 5");
                            estado.add(5);
                            desvio = false;
                            break;

                        case 6:
                            System.out.println("desvio 5");
                            estado.add(5);
                            desvio = false;
                            break;

                        case 8:
                            System.out.println("desvio 5");
                            estado.add(5);
                            desvio = false;
                            break;

                        case 9:
                            System.out.println("desvio 5");
                            estado.add(5);
                            desvio = false;
                            break;

                        case 10:
                            System.out.println("desvio 5");
                            estado.add(5);
                            desvio = false;
                            break;

                        case 11:
                            System.out.println("desvio 5");
                            estado.add(5);
                            desvio = false;
                            break;

                        case 12:
                            System.out.println("desvio 19");
                            estado.add(19);
                            desvio = false;
                            break;

                        case 13:
                            System.out.println("desvio 20");
                            estado.add(20);
                            desvio = false;
                            break;

                    }
                }
            }
        }
    }
}