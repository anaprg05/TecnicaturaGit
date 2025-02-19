# ***Entidades***
- Cuando mencionamos el nombre de una entidad por lo general lo hacemos de forma plural por ejemplo:
  - Laptops.
  - Autos.
  - Clientes.
- Cada entidad se encierra en un rectángulo.

## Tipos de entidades
- *Entidades fuertes*: son entidades que pueden sobrevivir por sí solas.
- *Entidades débiles*: no pueden existir sin una entidad fuerte y se representan con un cuadrado con doble línea.

### Entidades débiles:
- *Identidades débiles por identidad*: no se diferencian entre sí más que por la clave de su identidad fuerte.
- *Identidades débiles por existencia*: se les asigna una clave propia.

## ¿Cómo representar las entidades en bases de datos?
- Existen varios tipos de notaciones para los modelos entidad relacionamiento.
  - Entidad débil: Atributo.
  - Entidad Fuerte: Atributo llave.
  - Relación: Atributo llave débil.
  - Identificando la relación: Atributo derivado.
  - Entidad asociativa: Atributo multivaluado.

## Relaciones
- Las relaciones nos permiten unir diferentes entidades y se representan con rombos. Se definen a través de verbos.

## Cardinalidad
- Las relaciones tienen una propiedad llamada cardinalidad y tiene que ver con números. Cuántos de un lado pertenecen a cuántos del otro lado:
  - Cardinalidad: 1 a 1
    - Un presidente  puede gobernar un país y un país sólo puede tener 1 presidente.
  - Cardinalidad: 0 a 1
    - La sección actual tiene que tener un usuario pero puede que el usuario no este en línea en ese momento, entonces tendremos una cardinalidad de 0 a 1.
  - Cardinalidad: 1 a N
    - Una persona puede tener muchos autos pero un auto sólo puede tener a una persona como dueño.
  - Cardinalidad: 0 a N
    - Un paciente va a tener una habitación en un hospital pero puede que muchas habitación no tenga pacientes por lo tanto se considera que es opcional.
  - Cardinalidad: N a N (muchos a muchos)
    - Un alumno tiene n (muchas) clases y 1 clase tiene n (muchos) alumnos.

## Diagrama ER (Entidad-Relación)
- Cuando hablamos de un diagrama nos referimos a que es como un mapa que nos ayudará a entender cuáles son las entidades con las que vamos a trabajar, cuales van a ser las relaciones y que papel van a jugar en las aplicaciones de las clases de datos.
