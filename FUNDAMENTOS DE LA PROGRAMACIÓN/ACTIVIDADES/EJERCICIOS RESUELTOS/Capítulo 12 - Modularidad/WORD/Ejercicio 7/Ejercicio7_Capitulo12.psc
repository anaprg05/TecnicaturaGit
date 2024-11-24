// Capítulo 12 (Modularidad), Ejercicio 7.
// Escribir una función recursiva para elevar un número a una potencia.
SubAlgoritmo pedirDatos(base Por Referencia,exponente Por Referencia)
	Escribir 'Ingrese una base: 'Sin Saltar;
	Leer base;
	Escribir 'Ingrese un exponente: 'Sin Saltar;
	Leer exponente;
FinSubAlgoritmo

SubAlgoritmo retorno <- potencia(base,exponente)
	Definir retorno Como Entero;
	Si exponente=0 Entonces
		retorno <- 1;
	SiNo
		retorno <- base*potencia(base,exponente-1);
	FinSi
FinSubAlgoritmo

Proceso Ejercicio7_Capitulo12
	Definir base, exponente Como Entero;
	pedirDatos(base,exponente);
	Escribir 'La potencia es: ', potencia(base,exponente);
FinProceso
