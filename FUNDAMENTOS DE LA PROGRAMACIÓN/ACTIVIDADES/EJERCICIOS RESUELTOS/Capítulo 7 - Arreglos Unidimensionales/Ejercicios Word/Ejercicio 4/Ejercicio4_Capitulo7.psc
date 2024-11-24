// Capítulo 7 (Arreglos Unidimensionales), Ejercicio 4.
// Crear un arreglo con "N" números, leer los elementos por teclado, guardarlos en el arreglo,
// calcular cuál de los números es el mayor de todos y además cuál es el menor de todos.
Proceso Ejercicio4_Capitulo7
	Definir mayor, menor Como Real;
	Definir n_elementos, i Como Entero;
	Definir num Como Real;
	Dimension num[100];
	Repetir
		Escribir "Ingrese el número de elementos para el arreglo.";
		Leer n_elementos;
	Hasta Que n_elementos > 0
	Para i<-0 Hasta (n_elementos - 1) Con Paso 1 Hacer
		Escribir (i + 1), ". Ingrese un número.";
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
	Escribir "El número mayor es: ", mayor;
	Escribir "El número menor es:", menor;
FinProceso
