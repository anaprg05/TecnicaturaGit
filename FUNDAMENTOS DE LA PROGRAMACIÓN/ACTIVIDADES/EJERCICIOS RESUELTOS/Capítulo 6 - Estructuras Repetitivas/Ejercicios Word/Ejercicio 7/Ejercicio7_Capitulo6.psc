// Capítulo 6 (Estructuras Repetitivas), Ejercicio 7.
// Ingresar "N" enteros, visualizar la suma de los números pares de la lista,
// cuántos números pares existen y cuál es el promedio de los números impares.
Proceso Ejercicio7_Capitulo6
	Definir n_elementos, i, num Como Entero;
	Definir suma_pares, conteo_pares Como Entero;
	Definir suma_impares, conteo_impares Como Entero;
	Definir promedio_impares Como Real;
	Escribir 'Ingrese la cantidad de elementos.';
	Leer n_elementos;
	i <- 1;
	suma_pares <- 0;
	conteo_pares <- 0;
	suma_impares <- 0;
	conteo_impares <- 0;
	Mientras i<=n_elementos Hacer
		Escribir i, '. Ingrese un número.';
		Leer num;
		Si num MOD 2=0 Entonces
			suma_pares <- suma_pares+num;
			conteo_pares <- conteo_pares+1;
		SiNo
			suma_impares <- suma_impares+num;
			conteo_impares <- conteo_impares+1;
		FinSi
		i <- i+1;
	FinMientras
	Si conteo_pares=0 Entonces
		Escribir 'No se han ingresado números pares.';
	SiNo
		Escribir 'La suma de los números pares es de: ', suma_pares;
		Escribir 'El conteo de los números pares es de: ', conteo_pares;
	FinSi
	Si conteo_impares=0 Entonces
		Escribir 'No se han ingresado números impares.';
	SiNo
		promedio_impares <- suma_impares/conteo_impares;
		Escribir 'El promedio de los números impares es de: ', promedio_impares;
	FinSi
FinProceso
