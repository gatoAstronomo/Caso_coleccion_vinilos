Este repositorio contiene un programa en java que permite almacenar una colección de vinilos.  

Contiene tres clases principales: 
  
### Main:
- Se encuentra el codigo final donde se hace uso de las otras clases y metodos para administrar la colección de vinilos.

### Vinilo
- Clase que permite almacenar el nombre, artista y año de un vinilo.

### ColeccionVinilos  
- Es la abstracción de una colección de vinilos aqui ahi un ejemplo de como se ocupan: 
- (Importante: la coleccion admite un maximo de 100 vinilos)
```java
//Primero creamos una coleccion de vinilos
ColeccionVinilos myColeccion = new ColeccionVinilos();

//Agrega un vinilo a la colección
myColeccion.agregarVinilo("<nombre_artista>", "<nombre_grupo>", "<año_lanzamiento>");

// Muestra el total de vinilos
myColeccion.mostrarTotal();

// Muestra los espacios disponibles
myColeccion.mostrarDisponibles();

// Busca si un artista esta en la colección
myColeccion.buscarArtista("<nombre_artista>");

// Muestra todos los vinilos del artista
myColeccion.mostrarBusquedaArtista("<nombre_artista>");

// Imprime por pantalla toda la colección de vinilos
myColeccion.mostrarColeccion();
```

 