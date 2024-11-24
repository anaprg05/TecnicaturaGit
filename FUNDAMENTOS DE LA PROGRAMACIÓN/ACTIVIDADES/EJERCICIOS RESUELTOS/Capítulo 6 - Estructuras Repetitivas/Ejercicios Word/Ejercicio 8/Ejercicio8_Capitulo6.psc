// Capítulo 6 (Estructuras Repetitivas), Ejercicio 8.
// Dada las horas trabajadas de 5 personas y la tarifa de pago, calcular el salario, y la sumatoria
// de todos los salarios.
Proceso Ejercicio8_Capitulo6
	Definir i, horas Como Entero;
	Definir tarifa, salario, suma Como Real;
	i <- 1;
	suma <- 0;
	Mientras i<=5 Hacer
		Escribir 'Salario del empleado ', i, ':';
		Escribir 'Ingrese la cantidad de horas trabajadas.';
		Leer horas;
		Escribir 'Ingrese la tarifa por día.';
		Leer tarifa;
		salario <- horas*tarifa;
		Escribir 'El salario es de $', salario;
		suma <- suma+salario;
		i <- i+1;
		Escribir '';
	FinMientras
	Escribir 'La suma de todos los salarios es de $', suma;
FinProceso
