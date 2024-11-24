// Capítulo 11 (Matrices), Ejercicio 4 (VIDEO).
// Ejercicio de práctica.
Proceso Ejercicio4_Video_Capitulo11
	Definir matriz1, matriz2, i, j Como Entero;
	Dimensionar matriz1(2,2), matriz2(2,2);
	Para i<-0 Hasta 1 Hacer
		Para j<-0 Hasta 1 Hacer
			Escribir Sin Saltar 'Ingrese un número[', i, '][', j, ']';
			Leer matriz1[i,j];
		FinPara
	FinPara
	Escribir '';
	Para i<-0 Hasta 1 Hacer
		Para j<-0 Hasta 1 Hacer
			matriz2[i,j] <- matriz1[i,j];
			Si i = 0 y j = 0 Entonces
				Escribir "            ", matriz2[i,j], " ";
			SiNo
				Si i = 1 y j = 0 Entonces
					Escribir "            ", matriz2[i,j], " ";
				SiNo
					Escribir matriz2[i,j], " ";
				FinSi
			FinSi
		FinPara
		Escribir "";
	FinPara
	Escribir "";
FinProceso
