// Cap�tulo 4 (Estructuras Secuenciales), Ejercicio 2.
// Realizar un programa para ingresar el radio de un circulo y se reporte su �rea y la longitud de la circunferencia.
Proceso Ejercicio2_Capitulo4
	// Definici�n de variables.
	Definir radio, area, long Como Real;
	Escribir 'Inserte el valor del radio: ';
	Leer radio;
	area <- pi*radio^2;
	long <- 2*pi*radio;
	Escribir 'El �rea de la circunferencia es: ', area;
	Escribir 'La longitud de la circunferencia es: ', long;
FinProceso
