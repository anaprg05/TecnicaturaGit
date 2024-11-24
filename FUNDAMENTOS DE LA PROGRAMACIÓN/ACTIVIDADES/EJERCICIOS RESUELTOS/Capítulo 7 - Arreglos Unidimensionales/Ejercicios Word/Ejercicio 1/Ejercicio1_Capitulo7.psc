// Capítulo 7 (Arreglos Unidimensionales), Ejercicio 1.
// Crear un arreglo unidimensional con un tamaño de 5 (números reales), 
// preguntándole al usuario los valores y calcular la suma y promedio de todos ellos.
Proceso Ejercicio1_Capitulo7
	Definir i Como Entero;
	Definir numReales, suma, promedio Como Real;
	Dimensionar numReales(5);
	suma <- 0;
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir i, '. Ingrese un número.';
		Leer numReales[i];
		suma <- suma+numReales[i];
	FinPara
	promedio <- suma/5;
	Escribir 'La suma es: ', suma;
	Escribir 'El promedio es: ', promedio;
FinProceso
