// Capítulo 4 (Estructuras Secuenciales), Ejercicio 1.
// Calcular la cantidad de segundos que están incluídos en el número de horas, minutos y segundos ingresados por el usuario.
Proceso Ejercicio1_Capitulo4
	// Definición de las variables.
	Definir horas, minutos, seg Como Entero;
	Definir horas_seg, minutos_seg, total_seg Como Entero;
	// Imprimir textos para que el usuario defina los valores.
	Escribir 'Ingrese la cantidad de horas: ';
	Leer horas;
	Escribir 'Ingrese la cantidad de minutos: ';
	Leer minutos;
	Escribir 'Ingrese la cantidad de segundos: ';
	Leer seg;
	horas_seg <- horas*3600;
	minutos_seg <- minutos*60;
	total_seg <- horas_seg+minutos_seg+seg;
	Escribir 'La cantidad de segundos equivalentes son: ', total_seg;
FinProceso
