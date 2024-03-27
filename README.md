Mi código no está acabado y falta toda la lógica de gestion del concesionario, pero esto es lo que he podido hacer.
En mi código he usado los siguientes principios SOLID.
SINGLE RESPONSABILITY:
· Cada clase tiene una responsabilidad única como Compra, Venta, Coche...
OPEN/CLOSED:
· CocheNuevoELectrico y CocheNuevoCombustion extienden de CocheNuevoy añaden comportamientos sin modificar la clase base.
LISKOV:
· Las subclases de Coche se pueden sustituir por Coche sin ocasionar problemas. 
INTERFACES:
· He usado las interfaces de Electrico y Combustion para diferenciar tipos de Coches. Tambien con MetodoPago.
DEPENDENCIAS:
· No estoy seguro de haber usado


## Pendientes

### Implementación de la Clase Reparación
La implementación de la clase `Reparacion` está pendiente. Esta clase es fundamental, ya que, junto con `Compra` y `Venta`, debe ser declarada como una especialización de `Operacion`. 
De esta manera, las facturas podrían gestionar de manera uniforme todas las operaciones del concesionario. Al hacer esto, estaríamos aplicando el **Principio de Sustitución de Liskov (LSP)**, 
asegurando que las subclases puedan ser reemplazadas por su clase base sin alterar el correcto funcionamiento del sistema.

### Estructuración del Sistema
La estructuración del sistema aún necesita la creación de varios componentes:

- **Clase Main**: Necesitamos desarrollar la clase `Main`, la cual será el punto de entrada de la aplicación.

- **Clase Printer**: La clase `Printer` se encargará de toda la impresión y presentación de información al usuario, manteniendo la separación entre la lógica de la aplicación y la interfaz de usuario(SRP).

- **Controladores**: Es esencial diseñar controladores específicos que manejen la lógica correspondiente a cada una de las operaciones del concesionario (compras, ventas, reparaciones, gestión de inventario, etc.). (DIP).

