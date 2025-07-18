
Funcion resultado2<- suma(x,p)
	resultado2<-x+p
FinFuncion

Funcion conteo<-factorial(x)
	Si x>1 Entonces
		conteo<-x*(factorial(x-1))
	SiNo 
		conteo=1
	FinSi
Finfuncion

Funcion resultado<-multiplicar(x,p)
	Si p>1 Entonces
		resultado=x+multiplicar(x,p-1)
	Sino 
		resultado=x
	FinSi
FinFuncion

Algoritmo prueba
	Leer x,p
	Mostrar x," ,",p
	Mostrar suma(x,p);
	Mostrar factorial(x);
	Mostrar multiplicar(x,p);
FinAlgoritmo


