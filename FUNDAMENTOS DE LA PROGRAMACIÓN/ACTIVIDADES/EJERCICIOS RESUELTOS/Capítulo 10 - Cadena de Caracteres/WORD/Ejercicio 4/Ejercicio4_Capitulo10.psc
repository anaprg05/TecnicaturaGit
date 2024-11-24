// Capítulo 10 (Cadena de Caracteres), Ejercicio 4.
// Diseñar un algoritmo que elimine los espacios en blanco de un texto.
Proceso Ejercicio4_Capitulo10
	Definir frase, frase1 Como Cadena;
	Definir i Como Entero;
	Escribir 'Ingrese una cadena: 'Sin Saltar;
	Leer frase;
	i <- 0;
	frase1 <- '';
	Mientras (i<Longitud(frase)) Hacer
		Si Subcadena(frase,i,i)=' ' Entonces
			i <- i+1;
		SiNo
			frase1 <- Concatenar(frase1,Subcadena(frase,i,i));
			i <- i+1;
		FinSi
	FinMientras
	frase <- frase1;
	Escribir 'La cadena sin espacios en blanco es: ', frase;
FinProceso
