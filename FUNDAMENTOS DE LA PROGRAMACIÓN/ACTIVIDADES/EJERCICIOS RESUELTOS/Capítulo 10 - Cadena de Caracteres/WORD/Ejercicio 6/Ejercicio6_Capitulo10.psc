// Capítulo 10 (Cadena de Caracteres), Ejercicio 6.
// Diseñar un algoritmo que, tomando como entrada una cadena de texto,
// nos devuelva si es o no un palíndromo. Se conoce que se denomina palíndromo
// a una palabra o frase que, ignorando los espacios en blanco, se lee igual de 
// izquierda a derecha que de derecha a izquierda.
Proceso Ejercicio6_Capitulo10
	Definir i Como Entero;
	Definir frase, frase2, fraseReves Como Cadena;
	Escribir 'Ingrese una cadena.';
	Leer frase;
	i <- 0;
	frase2 <- '';
	Mientras i<Longitud(frase) Hacer
		Si Subcadena(frase,i,i)<>' ' Entonces
			frase2 <- Concatenar(frase2,Subcadena(frase,i,i));
			i <- i+1;
		SiNo
			i <- i+1;
		FinSi
	FinMientras
	frase <- frase2;
	fraseReves <- '';
	Para i<-(Longitud(frase)-1) Hasta 0 Con Paso -1 Hacer
		fraseReves <- Concatenar(fraseReves,Subcadena(frase,i,i));
	FinPara
	Si frase=fraseReves Entonces
		Escribir 'La cadena es un palíndromo: ', frase;
	SiNo
		Escribir 'La cadena no es un palíndromo: ', frase;
	FinSi
FinProceso
