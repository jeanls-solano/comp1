package assistants;

import java.util.ArrayList;

public class SyntheticAnalytic {

    private ArrayList<String> entrada = new ArrayList<String>();
    private ArrayList<String> simbolo = new ArrayList<String>();
    private ArrayList<Integer> estado = new ArrayList<Integer>();
    private Boolean desvio = false;
    private Boolean acc = false;

    public void AnalyticalDecision(){
        while(!acc){
            
        }
        if(entrada.get(entrada.size()-1).equals("+") ){
            // pega o ultimo elemento do estado
            switch (estado.get( estado.size()-1)) {
                case 1:
                    System.out.println("");
                    estado.add(8);
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                case 5:
                    //9 = P -> F
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("P");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    break;
                case 7:
                    //9 = F-> id
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("F");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    //vai ter que verificar o simbolo atual e o estado 
                    desvio = true;
                    break;

                case 14:
                    estado.add(8);
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                case 15:
                    //1 = E -> E + T
                    //desempilha O  " +, T " e mantém o  E
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);

                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;
                case 16:
                    //1 = E -> E - T
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 17:
                    // T -> T * P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 18:
                    //T -> T / P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 19:
                    //T -> T ^ P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 21:
                    //F -> (E)
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("F");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 22:
                    //P -> exp [F]
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("P");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals("-")){
            switch (estado.get(estado.get( estado.size()-1))) {
                case 1:
                    estado.add(9);
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 5:
                    //9 = P -> F
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("P");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    break;

                case 7:
                    //9 = F-> id
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("F");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    //vai ter que verificar o simbolo atual e o estado 
                    desvio = true;
                    break;

                case 14:
                    estado.add(9);
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 15:
                    //1 = E -> E + T
                    //desempilha O  " +, T " e mantém o  E
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);

                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                case 16:
                    //1 = E -> E - T
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;
                case 17:
                    // T -> T * P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 18:
                    //T -> T / P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 19:
                    //T -> T ^ P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 21:
                    //F -> (E)
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("F");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 22:
                    //P -> exp [F]
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("P");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals("*")){
            // + get()
            switch (estado.get(estado.get( estado.size()-1))) {
                case 2:
                    estado.add(10);
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 5:
                    //9 = P -> F
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("P");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    break;

                case 7:
                    //9 = F-> id
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("F");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    //vai ter que verificar o simbolo atual e o estado 
                    desvio = true;
                    break;

                case 15:
                    estado.add(10); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 16:
                    estado.add(10);
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 17:
                    // T -> T * P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 18:
                    //T -> T / P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;


                case 19:
                    //T -> T ^ P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 21:
                    //F -> (E)
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("F");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 22:
                    //P -> exp [F]
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("P");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals("/"))
        {
            // + get(estado.get( estado.size()-1))
            switch (estado.get(estado.get( estado.size()-1))) {
                case 2:
                    estado.add(11); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 5:
                    //9 = P -> F
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("P");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    break;

                case 7:
                    //9 = F-> id
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("F");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    //vai ter que verificar o simbolo atual e o estado 
                    desvio = true;
                    break;

                case 15:
                    estado.add(11); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 16:
                    estado.add(11);
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 17:
                    // T -> T * P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 18:
                    //T -> T / P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;


                case 19:
                    //T -> T ^ P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 21:
                    //F -> (E)
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("F");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 22:
                    //P -> exp [F]
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("P");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals("^")){
            // + get(estado.get( estado.size()-1))
            switch (estado.get(estado.get( estado.size()-1))) {
                case 3:
                    estado.add(12); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 5:
                    //9 = P -> F
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("P");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    break;

                case 7:
                    //9 = F-> id
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("F");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    //vai ter que verificar o simbolo atual e o estado 
                    desvio = true;
                    break;

                case 17:
                    estado.add(11); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                    
                case 18:
                    estado.add(11); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;    

                case 19:
                    //T -> T ^ P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 21:
                    //F -> (E)
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("F");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 22:
                    //P -> exp [F]
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("P");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals("EXP"))
        {
            // + get(estado.get( estado.size()-1))
            switch (estado.get(estado.get( estado.size()-1))) {
                case 0:
                    estado.add(4); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 6:
                    estado.add(4); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 8:
                    estado.add(4); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    
                    break;

                case 9:
                    estado.add(4); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1); 
                    break;

                case 10:
                    estado.add(4); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);                
                    break;

                case 11:
                    estado.add(4); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals("["))
        {
            // + get(estado.get( estado.size()-1))
            switch (estado.get(estado.get( estado.size()-1))) {
                case 4:
                    estado.add(13); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
            }
        }
        if(entrada.get(entrada.size()-1).equals("]"))
        {
            // + get(estado.get( estado.size()-1))
            switch (estado.get(estado.get( estado.size()-1))) {
                case 7:
                    //9 = F-> id
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("F");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    //vai ter que verificar o simbolo atual e o estado 
                    desvio = true;
                    break;

                case 20:
                    estado.add(22); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 21:
                    //F -> (E)
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("F");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals("(")){
            // + get(estado.get( estado.size()-1))
            switch(estado.get(estado.get( estado.size()-1))){
                case 0:
                    estado.add(6); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 8:
                    estado.add(6); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 9:
                    estado.add(6); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 10:
                    estado.add(6); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 11:
                    estado.add(6); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 12:            
                    estado.add(6); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

                case 13:
                    estado.add(6); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals(")")){
            // + get(estado.get( estado.size()-1))
            switch(estado.get(estado.get( estado.size()-1))){
                case 5:
                    //9 = P -> F
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("P");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    break;
        
                case 7:
                    //9 = F-> id
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("F");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    //vai ter que verificar o simbolo atual e o estado 
                    desvio = true;
                    break;
        
                case 14:
                    estado.add(21); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
        
                case 15:
                    //1 = E -> E + T
                    //desempilha O  " +, T " e mantém o  E
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);

                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;
                case 16:
                    //1 = E -> E - T
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 17:
                    // T -> T * P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 18:
                    //T -> T / P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 19:
                    //T -> T ^ P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;
                    
                case 21:
                    //F -> (E)
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("F");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 22:
                    //P -> exp [F]
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    simbolo.add("P");
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

            }
        }
        if(entrada.get(entrada.size()-1).equals("id")){
            // + get(estado.get( estado.size()-1))
            switch(estado.get(estado.get( estado.size()-1))){
                case 0:
                    estado.add(7); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                case 6:
                    estado.add(7); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
        
                case 8:
                    estado.add(7); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                case 9:
                    estado.add(7); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                case 10:
                    estado.add(7); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                case 11:
                    estado.add(7); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                case 12:
                    estado.add(7); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
                case 13:
                    estado.add(7); 
                    // simbolo recebe a entrada 
                    simbolo.add(entrada.get(entrada.size()-1));
                    // remove o ultimo elemento da entrada
                    entrada.remove( entrada.size()-1);
                    break;
            }  
        }
        //vazio
        if(entrada.get(entrada.size()-1).equals("$")){
            // + get(estado.get( estado.size()-1))
            switch(estado.get(estado.get( estado.size()-1))){
                case 1:
                    acc = true;
                    break;

                case 5:
                    //9 = P -> F
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("P");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    break;
        
                case 7:
                    //9 = F-> id
                    //desempilha o ultimo simbolo
                    simbolo.remove(simbolo.size()-1);
                    //subistitui pela redução
                    simbolo.add("F");
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    //vai ter que verificar o simbolo atual e o estado 
                    desvio = true;
                    break;
        
                case 15:
                    //1 = E -> E + T
                    //desempilha O  " +, T " e mantém o  E
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);

                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;
                case 16:
                    //1 = E -> E - T
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 17:
                    // T -> T * P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 18:
                    //T -> T / P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;

                case 19:
                    //T -> T ^ P
                    simbolo.remove(simbolo.size()-1);
                    simbolo.remove(simbolo.size()-1);
                    // desempilha o estado atual
                    estado.remove(estado.size()-1);
                    desvio = true;
                    break;
                    
                case 21:
                    break;

                case 22:
                    break;

            }
        }
        //se desvio estiver autorizado
        //eu faco as verificacoes dos simbolos
        if(desvio){
            //entrada.get(entrada.size()-1).equals("-")
            if(simbolo.get(simbolo.size()-1).equals("E")){
                // devio
                switch(estado.get( estado.size()-1)){
                    case 0:
                        estado.add(1);
                        break;
                    case 6:
                        estado.add(14);
                        break;
                }
            }
            if(simbolo.get(simbolo.size()-1).equals("T")){
                // + get(estado.get( estado.size()-1))
                switch(estado.get( estado.size()-1)){
                    case 0:
                        estado.add(2);
                        break;
                    case 6:
                        estado.add(2);
                        break;
                        
                    case 8:
                        estado.add(15);
                        break;
            
                    case 9:
                        estado.add(16);
                        break;
        
                }
            }
            if(simbolo.get(simbolo.size()-1).equals("P")){
                // + get(estado.get( estado.size()-1))
                switch(estado.get( estado.size()-1)){
                    case 0:
                        estado.add(3);
                        break;
        
                    case 6:
                        estado.add(3);
                        break;
            
                    case 8:
                        estado.add(3);
                        break;
            
                    case 9:
                        estado.add(13);
                        break;
            
                    case 10:
                        estado.add(17);
                        break;
            
                    case 11:
                        estado.add(18);
                        break;
        
                }
            }
            if(simbolo.get(simbolo.size()-1).equals("F")){
                // + get(estado.get( estado.size()-1))
                switch(estado.get( estado.size()-1)){
                    case 0:
                        estado.add(5);
                        break;
                        
                    case 6:
                        estado.add(5);
                        break;
            
                    case 8:
                        estado.add(5);
                        break;
            
                    case 9:
                        estado.add(5);
                        break;
            
                    case 10:
                        estado.add(5);
                        break;
            
                    case 11:
                        estado.add(5);
                        break;
                    
                    case 12:
                        estado.add(19);
                        break;
        
                    case 13:
                        estado.add(20);
                        break;
        
                }
            }
        }
    }
}

/*
 * 
 * 
 * public static void main(String[] args) {
 * 
 * //efetuando testes
 * estado.add(0);
 * entrada.add("a");
 * entrada.add("b");
 * entrada.add("c");
 * // só testando para adicioar o estado
 * estado.add(5);
 * // estado.remove(0);
 * // System.out.println("Último elemento da lista: " +
 * estado.get(estado.size()-1));
 * System.out.println(estado);
 * System.out.println(entrada);
 * desvio = true;
 * if(desvio){
 * switch(entrada.get(entrada.size()-1)){
 * case "a":
 * 
 * case "b":
 * 
 * case "c":
 * System.out.println("entrou c");
 * estado.remove(estado.size()-1);
 * entrada.remove(entrada.size()-1);
 * }
 * 
 * }
 * System.out.println(estado);
 * System.out.println(entrada);
 * }
 */

/*
 * 1 = E -> E + T
 * 2 = E -> E - T
 * 3 = E -> T
 * 4 = T -> T * P
 * 5 = T -> T / P
 * 6 = T -> P
 * 7 = P -> P ^ F
 * 8 = P -> exp [ F ]
 * 9 = P -> F
 * 10 = F -> ( E )
 * 11 = F -> id
 */
