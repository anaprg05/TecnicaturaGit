// Capítulo 5 (Estructuras Condicionales), Ejercicio 3.
// En un almacén se hace un 20 MOD  de descuento a los clientes cuya compra supere los $100.
// ¿Cuál será la cantidad que pagará una persona por su compra?
Proceso Ejercicio3_Capitulo5
	Definir compra, descuento, precio_final Como Real;
	Escribir 'Ingrese la cantidad de $ a pagar';
	Leer compra;
	Si compra>100 Entonces
		descuento <- compra*0.2;
	SiNo
		descuento <- 0;
	FinSi
	precio_final <- compra-descuento;
	Escribir 'El precio total a pagar es de: $', precio_final;
FinProceso
