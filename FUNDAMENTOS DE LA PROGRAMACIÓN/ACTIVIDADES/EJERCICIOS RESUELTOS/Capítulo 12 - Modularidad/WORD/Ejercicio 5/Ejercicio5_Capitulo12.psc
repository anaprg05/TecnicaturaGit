// Capítulo 12 (Modularidad), Ejercicio 5.
// Diseñar un algoritmo que pida al usuario 5 apellidos, los almacene en un
// arreglo y posteriormente muestre los apellidos ordenados alfabéticamente.
Proceso Ejercicio5_Capitulo12
	Definir apellidos Como Cadena;
	Dimensionar apellidos(5);
	pedirDatos(apellidos);
	ordenar(apellidos);
	mostrarDatos(apellidos);
	Escribir '';
FinProceso

SubAlgoritmo pedirDatos(apellidos Por Referencia)
	Definir i Como Entero;
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir (i+1), '. Ingrese un apellido: 'Sin Saltar;
		Leer apellidos[i];
	FinPara
FinSubAlgoritmo

SubAlgoritmo ordenar(apellidos Por Referencia)
	Definir i, j Como Entero;
	Definir aux Como Cadena;
	Para i<-0 Hasta 3 Con Paso 1 Hacer
		Para j<-0 Hasta 3-i Con Paso 1 Hacer
			Si apellidos[j]>apellidos[j+1] Entonces
				aux <- apellidos[j];
				apellidos[j] <- apellidos[j+1];
				apellidos[j+1]<-aux;
			FinSi
		FinPara
	FinPara
FinSubAlgoritmo

SubAlgoritmo mostrarDatos(apellidos)
	Definir i Como Entero;
	Escribir '';
	Escribir 'Los apellidos ordenados alfabéticamente son: ';
	Para i<-0 Hasta 4 Con Paso 1 Hacer
		Escribir (i+1), '. ', apellidos[i];
	FinPara
FinSubAlgoritmo
