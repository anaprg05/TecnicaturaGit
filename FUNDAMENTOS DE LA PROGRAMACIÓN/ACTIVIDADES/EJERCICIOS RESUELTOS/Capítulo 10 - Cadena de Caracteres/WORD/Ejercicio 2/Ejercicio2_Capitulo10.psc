// Capítulo 10 (Cadena de Caracteres), Ejercicio 2.
// Calcular la longitud de 2 cadenas de caracteres, y mostrar la cadena con la mayor longitud.
Proceso Ejercicio2_Capitulo10
	Definir frase1, frase2 Como Caracter;
	Escribir "Ingrese la primer cadena.";
	Leer frase1;
	Escribir "Ingrese la segunda cadena.";
	Leer frase2;
	Escribir "";
	Si Longitud(frase1) = Longitud(frase2) Entonces
		Escribir "Ambas cadenas tienen la misma longitud.";
	SiNo
		Si Longitud(frase1) > Longitud(frase2) Entonces
			Escribir frase1;
			Escribir "La cadena tiene una longitud de: ", Longitud(frase1);
		SiNo
			Escribir frase2;
			Escribir "La cadena tiene una longitud de: ", Longitud(frase2);
		FinSi
	FinSi
FinProceso
