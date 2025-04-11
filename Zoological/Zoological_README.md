## Zoological

Zoological is a simple Java application for managing animals and staff within a zoo environment.
It includes support for roles such as Zone Boss and Zookeeper, and allows registration, feeding, and reporting of animals like mammals and reptiles.

## Start

you execute the App.java that you found in the module zoo.app


## Análisis y diseño

¿Qué modificador de acceso debe tener el atributo nombre del animal? ¿Por qué?

  R/ El modificador de acceso seria private, ya que solo es accesible dentro de la clase.

¿Qué modificador aplicarías a zonaAsignada si solo debe accederse dentro del paquete modelo?

  R/ Aplicaría el modificador por defecto ya que con este se encapsula dentro del mismo paquete
    y esto permite que no sea visible ni modificable por fuera.

¿Cómo harías para que el atributo idAnimal solo sea accesible por clases que heredan de Animal?

  R/ Utilize el modificador "protected" ya que este me permite acceder solo cuando se hereda

El método mostrarInfo() debe poder ser llamado desde cualquier clase. ¿Qué modificador necesita?

  R/ el modificador a usar en este caso el "public"

El método reporteInterno() contiene datos confidenciales y solo debe usarse en subclases. ¿Qué modificador aplicarías?

  R/ Para este se uso "protected"

¿Qué modificador pondrías al método validarZona(), que solo será usado por clases como RegistroAnimal en el mismo paquete?

  R/ para eso usaria el modificador por defecto ya que este permite acceder por classes en el mismo paquete

## Reflexión

Redacta brevemente (5 a 10 líneas):

- ¿Qué problemas podrías enfrentar si haces públicos todos los atributos?

  R/ Los problemas que podría enfrentar son principalmente de seguridad, al no tener un nivel de encapsulamiento consistente, el programam podría volverse muy facíl de romper. Pero además esto ocacionaria muchos conflictos al no tener claro cuales son los metodos y atributos a los cuales se puede acceder y a cuales son pertenecientes a la clase internamente.

- ¿Qué ventajas encuentras en usar protected para clases base?

  R/ la ventaja mas grande es que tiene un nivel de encapsulamiento mas bajo que el "private" por lo cual puedo acceder a estos metodos o atrivutos cuando se hereda en una subclase.

- ¿Qué beneficios ofrece restringir algunos métodos a un paquete
específico?

  R/ La ventaja que esto ofrece es tener control claro del flujo del programa, al tener metodos restringidos al paquete obligamos a desarrollar de forma mas clara y modular, favoreciendo la legibilidad del código y su posterior mantenimiento sea el caso.  

- ¿Crees que aplicar estos principios mejora el diseño del software? ¿Por qué?

  R/ Aplicar estos pricipios mejoran la calidad del software al hacer de este algo mudular, legible y mantenible. Esto es por que al tener in correcto nivel de encapsulamiento, el desarrollo se vuelver mucho mas eficiente, y hasta se es mas rapido de completar, su estricto orden hace que se eviten cometer errores y en el momento de corregir algo o hace mantenimiento es mucho mas facil si esta claro el uso de cada paquete y clase.
