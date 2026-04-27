# Sistema_Clinica_Veterinaria
Integrantes Grupo 2

- Jessica Acevedo
- Cesar España
- Handry Moran
- Andres Diaz


- A tributos comunes: Identifica los tres datos que todo animal tiene, sin importar la especie. Decide qué modificador de // acceso corresponde a cada uno y justifica por qué no son private ni public.

Rsta: Por confidencialidad de lainformación y privacidad de datos del sistema//

- B El método que todas las hijas deben resolver, La clínica necesita calcular el costo de la consulta. ¿Por qué ese método no puede implementarse en Animal? Decídelo como abstract con la firma correcta y el tipo de retorno apropiada

Rsta: Porque cada sub-clase como Perro-Gato-Ave tiene distintos costos//

- C El método que todas las hijas heredan igual: La ficha de presentación siempre muestra los mismos datos en el mismo formato. Impleméntalo en Animal de forma que todas las subclases lo hereden sin necesidad de sobrescribirlo. Debe llamar internamente a calcularCostoConsulta().
Pregunta de diseño: ¿Qué pasaría si alguien intenta hacer new Animal("Luna", 3,
"Carlos")? ¿Cuándo lo detecta Java — en compilación o en ejecución? ¿Por qué?:

Rsta: El error se da en compilación , porque debe completar los atributos de acuerdo  a la especie de animal.

Para cada subclase, responde antes de escribir:


• ¿Qué atributos propios necesita además de los heredados?
Rsta: Raza, PesoGramos, Esterilizado

• ¿Cómo llamas al constructor del padre desde la subclase?
para llamar al constructor se usa super dentro del constructor de la subclase.

• ¿Qué anotación indica que estás cumpliendo un contrato del padre?
la notación que indica que cumple el contrato es extends.

• ¿Por qué Java te obliga a implementar calcularCostoConsulta()?
Porque desde la clase padre Animal se crea un método abstract.
