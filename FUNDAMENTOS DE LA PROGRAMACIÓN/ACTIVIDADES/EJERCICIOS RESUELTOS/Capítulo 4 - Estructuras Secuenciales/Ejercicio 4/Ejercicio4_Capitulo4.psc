// Capítulo 4 (Estructuras Secuenciales), Ejercicio 4.
// Un profesor prepara tres cuestionarios para una evaluación final: A, B y C. Se sabe que se tarda 5 minutos
// en revisar el cuestionario A, 8 en revisar el cuestionario B y 6 minutos en el C. La cantidad de exámenes
// de cada tipo se entran por teclado. ¿Cuántas horas y cuántos minutos se tardará en revisar todas las evaluaciones?
Proceso Ejercicio4_Capitulo4
	// Definición de variables.
	Definir cantidadA, cantidadB, cantidadC Como Entero;
	Definir tiempoA, tiempoB, tiempoC Como Entero;
	Definir tiempo_total, horas, minutos Como Entero;
	Escribir 'Ingrese la cantidad de cuestionarios A: ';
	Leer cantidadA;
	Escribir 'Ingrese la cantidad de cuestionarios B: ';
	Leer cantidadB;
	Escribir 'Ingrese la cantidad de cuestionarios C: ';
	Leer cantidadC;
	tiempoA <- cantidadA*5;
	tiempoB <- cantidadB*8;
	tiempoC <- cantidadC*6;
	tiempo_total <- tiempoA+tiempoB+tiempoC;
	horas <- trunc(tiempo_total/60);
	minutos <- tiempo_total MOD 60;
	Escribir 'Se tardará ', horas, ' horas y ', minutos, ' minutos.';
FinProceso
