// Capítulo 6 (Estructuras Repetitivas), Ejercicio 3.
// Leer 10 números e imprimir cuantos son positivos, cuantos negativos y cuantos neutros.
Proceso Ejercicio3_Capitulo6
	Definir num, i Como Entero;
	Definir conteo_positivos, conteo_negativos, conteo_neutros Como Entero;
	conteo_positivos <- 0;
	conteo_negativos <- 0;
	conteo_neutros <- 0;
	Para i<-1 Hasta 10 Con Paso 1 Hacer
		Escribir i, '. Ingrese un número.';
		Leer num;
		Si num=0 Entonces
			conteo_neutros <- conteo_neutros+1;
		SiNo
			Si num>0 Entonces
				conteo_positivos <- conteo_positivos+1;
			SiNo
				conteo_negativos <- conteo_negativos+1;
			FinSi
		FinSi
	FinPara
	Escribir 'La cantidad de positivos es de ', conteo_positivos;
	Escribir 'La cantidad de negativos es de ', conteo_negativos;
	Escribir 'La cantidad de neutros es de ', conteo_neutros;
FinProceso
