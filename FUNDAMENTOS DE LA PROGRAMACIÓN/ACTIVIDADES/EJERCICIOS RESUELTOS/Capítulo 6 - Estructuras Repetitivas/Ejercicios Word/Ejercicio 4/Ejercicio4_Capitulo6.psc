// Capítulo 6 (Estructuras Repetitivas), Ejercicio 4.
// Suponga que se tiene un conjunto de calificaciones de un grupo de 10
// alumnos. Realizar un algoritmo para calcular la calificación promedio y 
// la calificación más baja de todo el grupo.
Proceso Ejercicio4_Capitulo6
	Definir calificacion_promedio, calificacion_baja Como Real;
	Definir calificacion, suma Como Real;
	Definir i Como Entero;
	suma <- 0;
	calificacion_baja <- 99999;
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir i, '. Ingrese una calificación.';
		Leer calificacion;
		suma <- suma+calificacion;
		Si calificacion<calificacion_baja Entonces
			calificacion_baja <- calificacion;
		FinSi
	FinPara
	calificacion_promedio <- suma/10;
	Escribir 'La calificación promedio es: ', calificacion_promedio;
	Escribir 'La calificación más baja es: ', calificacion_baja;
FinProceso
