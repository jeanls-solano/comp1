# comp1
Projeto de Compiladores 1 

  Implemente o Analisador Léxico, Sintático e Semântico da gramática a seguir. 
  Como resultado é esperado que o programa calcule o resultado da expressão passada por parâmetro.

# Autômato: 

![image](https://user-images.githubusercontent.com/67402140/175380225-f753a2d7-2c4e-423c-a8f8-78aed7b0cbea.png)

# First e Follow
Não terminais =  E, T, P, F

Terminais = +, -, *, /, ^, exp, [, ] ,( ,) ,id
 
FIRST[E] = + - * / ^ exp ( id

FIRST[T] = * / ^ exp ( id  

FIRST[P] = ^ exp ( id  

FIRST[F] = ( id
 
FOLLOW[E] = + - ) $

FOLLOW[T] = * / + - ) $

FOLLOW[P] = ^ * / + - ) $

FOLLOW[F] = ] ^ * / + - ) $


# Tabela do Compilador Sintático

