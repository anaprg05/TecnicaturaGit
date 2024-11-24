// Capítulo 12 (Modularidad), Ejercicio 1.
// Diseñar un algoritmo que pida un nombre al usuario y que despliegue en pantalla
// el nombre entre asteriscos. La cantidad de asteriscos debe ser la misma que 
// caracteres en el nombre, incluídos los espacios.
SubAlgoritmo pedirDatos(nombre Por Referencia)
	Escribir 'Ingrese su nombre: 'Sin Saltar;
	Leer nombre;
FinSubAlgoritmo

SubAlgoritmo copiarNombre(nombre Por Referencia)
	Definir tamanio, i Como Entero;
	tamanio <- Longitud(nombre);
	Escribir '*'Sin Saltar;
	Para i<-1 Hasta tamanio Con Paso 1 Hacer
		Escribir '*'Sin Saltar;
	FinPara
	Escribir '';
	Escribir nombre;
	Escribir '*'Sin Saltar;
	Para i<-1 Hasta tamanio Con Paso 1 Hacer
		Escribir '*'Sin Saltar;
	FinPara
	Escribir '';
FinSubAlgoritmo

Proceso Ejercicio1_Capitulo12
	Definir nombre Como Cadena;
	pedirDatos(nombre);
	copiarNombre(nombre);
	Escribir '';
FinProceso
