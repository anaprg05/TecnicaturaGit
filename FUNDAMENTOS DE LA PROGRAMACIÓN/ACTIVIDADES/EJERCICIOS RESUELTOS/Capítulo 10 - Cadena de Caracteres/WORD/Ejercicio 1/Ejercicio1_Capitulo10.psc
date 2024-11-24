// Capítulo 10 (Cadena de Caracteres), Ejercicio 1.
// Diseñar un programa que permita ingresar un a cadena de caracteres y detecte cuántas vocales tiene.
Proceso Ejercicio1_Capitulo10
	Definir i, j, conteoVocales Como Entero;
	Definir frase, vocales Como Cadena;
	Escribir 'Ingrese una cadena: 'Sin Saltar;
	Leer frase;
	frase <- Minusculas(frase);
	vocales <- 'aeiou';
	conteoVocales <- 0;
	Para i<-0 Hasta (Longitud(frase)-1) Con Paso 1 Hacer
		Para j<-0 Hasta (Longitud(vocales)-1) Con Paso 1 Hacer
			Si (Subcadena(frase,i,i)=Subcadena(vocales,j,j)) Entonces
				conteoVocales <- conteoVocales+1;
			FinSi
		FinPara
	FinPara
	Escribir 'El número de vocales en la cadena es de: ', conteoVocales;
FinProceso
