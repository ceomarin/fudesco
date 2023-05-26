### Individual 31

**Observación**: este ejercicio es la continuación de los ejercicios individuales de días anteriores

Una empresa corredora de propiedades necesita contar con un sistema de registro de sus
trabajadores y sus cargas familiares. Anteriormente se definió la clase Trabajador, la que contiene
los siguientes campos:

- Nombres
- Apellidos
- RUN (se debe almacenar con guion)
- Teléfono
- Edad

A la clase anterior se debe agregar el método mostrarDatos(), el cual debe mostrar el teléfono
y edad del trabajador.

Además, se sabe que existen tres tipos de trabajadores:

- Honorario: respecto de este tipo de trabajadores, se desea saber su giro y año de iniciación
de actividades.
- Contratado: de esta categoría se debe conocer su fecha de ingreso y salario mensual.
- Eventual: de este tipo de trabajador se interesa saber su disponibilidad y correo electrónico.

Como parte de este ejercicio se pide:

- Cree las tres clases indicadas en el listado anterior. Todas tienen que extender desde la clase
Trabajador.
- Cada clase hija debe tener los atributos antes indicados, junto con sus accesores, mutadores
y método toString().
- Por cada una de estas clases implemente el método mostrarDatos(). En cada una de
ellas, el método a crear debe sustituir el comportamiento establecido en la clase Padre.