# Practica1-U2

Instrucciones Generales
Para todos los ejercicios, se debe utilizar un enfoque de programación estructurada y
secuencial. Queda estrictamente prohibido el uso de estructuras de control (if, switch,
for, while). Se recomienda el uso de métodos estáticos externos para las operaciones
aritméticas para mantener el código organizado.

Ejercicio 1: Descomposición de Monedas
Problema: Desarrollar un programa que reciba una cantidad entera de dinero y cal-
cule la menor cantidad de billetes y monedas necesarios para cubrir dicho monto. Las
denominaciones disponibles son:
- Billetes: $100, $50, $20.
- Monedas: $5, $2, $1.
Restricciones:
- No utilizar estructuras de decisión.
- Utilizar exclusivamente operadores de división entera (/) y residuo (%).


Ejercicio 2: Distancia Euclidiana entre dos Puntos
Problema: Solicitar al usuario las coordenadas de dos puntos en un plano cartesiano:
P1(x1, y1) y P2(x2, y2). 
Calcular la distancia lineal entre ambos puntos utilizando la fór-
mula:
d= (x2− x1)2 + (y2− y1)2

Restricciones:
- No utilizar Math.pow para el cálculo del cuadrado; implementar un método estático
propio en una clase externa para esta operación.
- Los resultados finales deben ser almacenados en variables de tipo double.

Ejercicio 3: Conversión de Tiempo Total
Problema: Dado un número entero que representa una cantidad total de segundos, el
programa debe mostrar su equivalente detallado en el formato: Días : Horas : Minutos
: Segundos.

Restricciones:
- No utilizar estructuras de control.
- Se debe realizar el cálculo de forma descendente, arrastrando el residuo de cada
unidad de tiempo a la unidad inmediata inferior.
