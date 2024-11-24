// Capítulo 12 (Modularidad), Ejercicio 8.
// Implementar un subprograma recursivo que realice la serie Fibonacci.
Proceso Ejercicio8_Capitulo12
	Definir nElementos Como Entero;
	pedirDatos(nElementos);
	mostrarSerie(nElementos);
	Escribir '';
FinProceso

SubAlgoritmo pedirDatos(nElementos Por Referencia)
	Escribir 'Ingrese el número de elementos: 'Sin Saltar;
	Leer nElementos;
FinSubAlgoritmo

SubAlgoritmo mostrarSerie(nElementos)
	Definir i Como Entero;
	Escribir '';
	Escribir 'La serie Fibonacci es: ';
	Escribir '0 'Sin Saltar;
	Para i<-1 Hasta nElementos-1 Con Paso 1 Hacer
		Escribir fibonacci(i), ' 'Sin Saltar;
	FinPara
FinSubAlgoritmo

SubAlgoritmo retorno <- fibonacci(num)
	Definir retorno Como Entero;
	Si num=1 O num=2 Entonces
		retorno <- 1;
	SiNo
		retorno <- fibonacci(num-1)+fibonacci(num-2);
	FinSi
FinSubAlgoritmo
