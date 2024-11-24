// Capítulo 10 (Cadena de Caracteres), Ejercicio 9.
// Leer una frase y contar el número de cada una de las vocales que aparecen.
Proceso Ejercicio9_Capitulo10
	Definir frase, letra Como Cadena;
	Definir i, contA, contE, contI, contO, contU Como Entero;
	Escribir 'Ingrese una cadena: 'Sin Saltar;
	Leer frase;
	frase <- Minusculas(frase);
	contA <- 0;
	contE <- 0;
	contI <- 0;
	contO <- 0;
	contU <- 0;
	Para i<-0 Hasta (Longitud(frase)-1) Hacer
		letra <- Subcadena(frase,i,i);
		Si letra='a' Entonces
			contA <- contA+1;
		SiNo
			Si letra='e' Entonces
				contE <- contE+1;
			SiNo
				Si letra='i' Entonces
					contI <- contI+1;
				SiNo
					Si letra='o' Entonces
						contO <- contO+1;
					SiNo
						Si letra='u' Entonces
							contU <- contU+1;
						FinSi
					FinSi
				FinSi
			FinSi
		FinSi
	FinPara
	Escribir '';
	Escribir 'Conteo de la vocal A: ', contA;
	Escribir 'Conteo de la vocal E: ', contE;
	Escribir 'Conteo de la vocal I: ', contI;
	Escribir 'Conteo de la vocal O: ', contO;
	Escribir 'Conteo de la vocal U: ', contU;
FinProceso
