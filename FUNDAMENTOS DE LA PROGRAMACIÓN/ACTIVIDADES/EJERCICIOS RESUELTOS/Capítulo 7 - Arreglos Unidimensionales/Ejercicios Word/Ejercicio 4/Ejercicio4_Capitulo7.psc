// Cap�tulo 7 (Arreglos Unidimensionales), Ejercicio 4.
// Crear un arreglo con "N" n�meros, leer los elementos por teclado, guardarlos en el arreglo,
// calcular cu�l de los n�meros es el mayor de todos y adem�s cu�l es el menor de todos.
Proceso Ejercicio4_Capitulo7
	Definir mayor, menor Como Real;
	Definir n_elementos, i Como Entero;
	Definir num Como Real;
	Dimension num[100];
	Repetir
		Escribir "Ingrese el n�mero de elementos para el arreglo.";
		Leer n_elementos;
	Hasta Que n_elementos > 0
	Para i<-0 Hasta (n_elementos - 1) Con Paso 1 Hacer
		Escribir (i + 1), ". Ingrese un n�mero.";
		Leer num[i];
	FinPara
	mayor <- num[0];
	menor <- num[0];
	Para i<-1 Hasta (n_elementos - 1) Con Paso 1 Hacer
		Si num[i] > mayor Entonces
			mayor <- num[i];
		SiNo
			Si num[i] < menor Entonces
				menor <- num[i];
			FinSi
		FinSi
	FinPara
	Escribir "El n�mero mayor es: ", mayor;
	Escribir "El n�mero menor es:", menor;
FinProceso
