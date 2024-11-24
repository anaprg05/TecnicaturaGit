// Capítulo 4 (Estructuras Secuenciales), Ejercicio 3.
// Un maestro desea saber qué porcentaje de hombres y qué porcentaje de mujeres hay en un grupo de estudiantes.
Proceso Ejercicio3_Capitulo4
	// Definición de variables.
	Definir numH, numM, total_estudiantes Como Entero;
	Definir porcentajeH, porcentajeM Como Real;
	Escribir 'Ingrese la cantidad de hombres: ';
	Leer numH;
	Escribir 'Ingrese la cantidad de mujeres: ';
	Leer numM;
	total_estudiantes <- numH+numM;
	porcentajeH <- numH/total_estudiantes*100;
	porcentajeM <- numM/total_estudiantes*100;
	Escribir 'El porcentaje de hombres es: ', porcentajeH;
	Escribir 'El porcentaje de mujeres es: ', porcentajeM;
FinProceso
