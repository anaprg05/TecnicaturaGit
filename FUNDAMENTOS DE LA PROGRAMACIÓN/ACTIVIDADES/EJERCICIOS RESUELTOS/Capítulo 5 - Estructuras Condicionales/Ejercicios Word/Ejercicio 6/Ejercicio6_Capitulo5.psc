// Capítulo 5 (Estructuras Condicionales), Ejercicio 6.
// Una frutería ofrece las manzanas con descuento según los siguientes datos.
// 0-2kg, 0 MOD  de descuento
// 2.01-5kg, 10 MOD  de descuento
// 5.01-10kg, 15 MOD  de descuento
// 10.01kg en adelante, 20 MOD  de descuento
// Determinar cuánto pagará una persona que compre manzanas en esa frutería.
Proceso Ejercicio6_Capitulo5
	Definir precioK, kilos, precioI Como Real;
	Definir descuento, precio_final Como Real;
	Escribir 'Ingrese el precio del kilo de manzanas.';
	Leer precioK;
	Escribir 'Ingrese la cantidad de kilos de manzana que compró.';
	Leer kilos;
	precioI <- precioK*kilos;
	Si kilos>=0 Y kilos<=2 Entonces
		descuento <- 0;
	SiNo
		Si kilos>=2.01 Y kilos<=5 Entonces
			descuento <- precioI*0.1;
		SiNo
			Si kilos>=5.01 Y kilos<=10 Entonces
				descuento <- precioI*0.15;
			SiNo
				descuento <- precioI*0.20;
			FinSi
		FinSi
	FinSi
	precio_final <- precioI-descuento;
	Escribir 'El precio a pagar es de $', precio_final;
FinProceso
