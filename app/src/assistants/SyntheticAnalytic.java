package assistants;

import java.util.ArrayList;

public class SyntheticAnalytic {

    //ação vai ser (case e if) 
    ArrayList<String> entrada = new ArrayList<String>();
    static ArrayList<String> simbolo = new ArrayList<String>();
    static ArrayList<Integer> estado = new ArrayList<Integer>();

    public static void main(String[] args) {
        estado.add(0);
        // só testando para adicioar o estado
        // estado.add(5);
        // estado.remove(0);
        // System.out.println("Último elemento da lista: " + estado.get(estado.size()-1));
    }

    /*  
    1 = E -> E + T
    2 = E -> E - T  
    3 = E -> T
    4 = T -> T * P 
    5 = T -> T / P
    6 = T -> P
    7 = P ->  P ^ F
    8 = P -> exp [ F ] 
    9 = P -> F
    10 = F -> ( E )
    11 = F -> id
    */




    if(entrada=="+"){
        // pega o ultimo elemento do estado
        switch (estado.get( estado.size()-1)) {
            case 1:
                estado.add(8);
                // simbolo recebe a entrada 
                simbolo.add(entrada.get(entrada.size()-1));
                // remove o ultimo elemento da entrada
                entrada.remove( entrada.size()-1);
            case 5:
                //9 = P -> F
                //desempilha o ultimo simbolo
                simbolo.remove(simbolo.size()-1);
                //subistitui pela redução
                simbolo.add("P");
                // desempilha o estado atual
                estado.remove(estado.size()-1);
            case 7:

            case 14:

            case 15:

            case 16:

            case 17:

            case 18:

            case 19:

            case 21:

            case 22:

        }
    }
    if(entrada=="-"){
        switch (estado.get(estado.get( estado.size()-1))) {
            case 1:

            case 5:

            case 7:

            case 14:

            case 15:

            case 16:

            case 17:

            case 18:

            case 19:

            case 21:

            case 22:

        }
    }
    if(entrada=="*"){
        // + get()
        switch (estado.get(estado.get( estado.size()-1))) {
            case 2:

            case 5:

            case 7:

            case 15:

            case 16:

            case 17:

            case 18:

            case 19:

            case 21:

            case 22:

        }
    }
    if(entrada=="/")
    {
        // + get(estado.get( estado.size()-1))
        switch (estado.get(estado.get( estado.size()-1))) {
            case 2:

            case 5:

            case 7:

            case 15:

            case 16:

            case 17:

            case 18:

            case 19:

            case 21:

            case 22:

        }
    }
    if(entrada=="^")
    {
        // + get(estado.get( estado.size()-1))
        switch (estado.get(estado.get( estado.size()-1))) {
            case 3:

            case 5:

            case 7:

            case 17:

            case 18:

            case 19:

            case 21:

        }
    }
    if(entrada=="EXP")
    {
        // + get(estado.get( estado.size()-1))
        switch (estado.get(estado.get( estado.size()-1))) {
            case 0:

            case 6:

            case 8:

            case 9:

            case 10:

            case 11:

        }
    }
    if(entrada=="[")
    {
        // + get(estado.get( estado.size()-1))
        switch (estado.get(estado.get( estado.size()-1))) {
            case 4:

            case 5:

        }
    }
    if(entrada=="]")
    {
        // + get(estado.get( estado.size()-1))
        switch (estado.get(estado.get( estado.size()-1))) {
            case 7:

            case 20:

            case 21:

        }
    }
    if(entrada=="("){
        // + get(estado.get( estado.size()-1))
        switch(estado.get(estado.get( estado.size()-1))){
            case 0:

            case 8:

            case 9:

            case 10:

            case 11:

            case 12:

            case 13:

        }
    }
    if(entrada == ")"){
        // + get(estado.get( estado.size()-1))
        switch(estado.get(estado.get( estado.size()-1))){
            case 5:

            case 6:
    
            case 7:
    
            case 14:
    
            case 15:
    
            case 16:
    
            case 17:
                
            case 18:

            case 19:
                
            case 21:

            case 22:

        }
    }
    if(entrada == "id"){
        // + get(estado.get( estado.size()-1))
        switch(estado.get(estado.get( estado.size()-1))){
            case 0:

            case 6:
    
            case 8:
    
            case 9:
    
            case 10:
    
            case 11:
    
            case 12:
                
            case 13:

        }  
    }
    //vazio
    if(entrada == "$"){
        // + get(estado.get( estado.size()-1))
        switch(estado.get(estado.get( estado.size()-1))){
            case 1:

            case 5:
    
            case 7:
    
            case 15:
    
            case 16:
    
            case 17:
                
            case 18:

            case 19:
                
            case 21:

            case 22:

        }
    }

    if(entrada == "E"){
        // + get(estado.get( estado.size()-1))
        switch(estado.get(estado.get( estado.size()-1))){
            case 1:

            case 6:

        }
    }
    if(entrada == "T"){
        // + get(estado.get( estado.size()-1))
        switch(estado.get(estado.get( estado.size()-1))){
            case 1:

            case 6:
    
            case 8:
    
            case 9:

        }
    }
    if(entrada == "P"){
        // + get(estado.get( estado.size()-1))
        switch(estado.get(estado.get( estado.size()-1))){
            case 1:

            case 6:
    
            case 8:
    
            case 9:
    
            case 10:
    
            case 11:

        }
    }
    if(entrada == "F"){
        // + get(estado.get( estado.size()-1))
        switch(estado.get(estado.get( estado.size()-1))){
            case 1:

            case 6:
    
            case 8:
    
            case 9:
    
            case 10:
    
            case 11:
            
            case 12:

            case 13:

        }
    }
}
