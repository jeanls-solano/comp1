# comp1
Projeto de Compiladores 1 

  Implemente o Analisador Léxico, Sintático e Semântico da gramática a seguir. 
  Como resultado é esperado que o programa calcule o resultado da expressão passada por parâmetro.

# Autômato: 

![image](https://user-images.githubusercontent.com/67402140/174203544-3aab8aa4-2526-4ac7-ad8b-e89a75bb5197.png)

# Furst e Follow
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


# Tabela de Análise

	+	-	*	/	^	exp	(	id
E	E -> E + T  |  E - T  	E -> E + T  |  E - T  	E -> E + T  |  E - T  |  T 	E -> E + T  |  E - T  |  T 	E -> E + T  |  E - T  |  T 	E -> E + T  |  E - T  |  T 	E -> E + T  |  E - T  |  T 	E -> E + T  |  E - T  |  T 
T			T -> T * P  |  T / P	T -> T * P  |  T / P	T -> T * P  |  T / P  | P	T -> T * P  |  T / P  | P	T -> T * P  |  T / P  | P	T -> T * P  |  T / P  | P
P					P ->  P ^ F	P ->  P ^ F | exp [ F ]	P ->  P ^ F |  F 	P ->  P ^ F |  F 
F							F -> ( E )	F -> id
