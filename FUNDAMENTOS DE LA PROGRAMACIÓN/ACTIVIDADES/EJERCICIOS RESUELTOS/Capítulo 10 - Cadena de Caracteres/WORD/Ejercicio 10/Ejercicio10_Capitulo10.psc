// Capítulo 10 (Cadena de Caracteres), Ejercicio 10.
// Realizar un programa que permita contabilizar cuantas veces una subcadena se repite dentro de una frase.
Proceso Ejercicio10_Capitulo10
	Definir i, contador Como Entero;
	Definir frase, subfrase, palabra Como Cadena;
	Escribir 'Ingrese una cadena: 'Sin Saltar;
	Leer frase;
	Escribir 'Ingrese la palabra que desea buscar en la frase: 'Sin Saltar;
	Leer subfrase;
	i <- 0;
	contador <- 0;
	Mientras i<Longitud(frase) Hacer
		palabra <- '';
		Si Subcadena(frase,i,i)<>' ' Entonces
			Mientras Subcadena(frase,i,i)<>' ' Y i<Longitud(frase) Hacer
				palabra <- Concatenar(palabra,Subcadena(frase,i,i));
				i <- i+1;
			FinMientras
			Si palabra=subfrase Entonces
				contador <- contador+1;
			FinSi
		SiNo
			Mientras Subcadena(frase,i,i)=' ' Y i<Longitud(frase) Hacer
				i <- i+1;
			FinMientras
		FinSi
	FinMientras
	Escribir '';
	Escribir 'La palabra: ', subfrase, ' se repite ', contador, ' veces.';
FinProceso
