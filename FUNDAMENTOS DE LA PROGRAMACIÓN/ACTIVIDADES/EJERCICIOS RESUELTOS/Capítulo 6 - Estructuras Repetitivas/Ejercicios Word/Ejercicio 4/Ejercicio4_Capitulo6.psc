// Cap�tulo 6 (Estructuras Repetitivas), Ejercicio 4.
// Suponga que se tiene un conjunto de calificaciones de un grupo de 10
// alumnos. Realizar un algoritmo para calcular la calificaci�n promedio y 
// la calificaci�n m�s baja de todo el grupo.
Proceso Ejercicio4_Capitulo6
	Definir calificacion_promedio, calificacion_baja Como Real;
	Definir calificacion, suma Como Real;
	Definir i Como Entero;
	suma <- 0;
	calificacion_baja <- 99999;
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir i, '. Ingrese una calificaci�n.';
		Leer calificacion;
		suma <- suma+calificacion;
		Si calificacion<calificacion_baja Entonces
			calificacion_baja <- calificacion;
		FinSi
	FinPara
	calificacion_promedio <- suma/10;
	Escribir 'La calificaci�n promedio es: ', calificacion_promedio;
	Escribir 'La calificaci�n m�s baja es: ', calificacion_baja;
FinProceso
