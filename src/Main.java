public class Main {
    public static void main(String[] args){

        // Instancia una coleccion de vinilos llamada myColeccion
        ColectionVinilos myColeccion = new ColectionVinilos();

        // Agrega 13 vinilos
        myColeccion.agregarVinilo("Iron Maiden","Iron Maiden","1980");
        myColeccion.agregarVinilo("Iron Maiden", "The Number of the Beast", "1982");
        myColeccion.agregarVinilo("Metallica", "Ride the Lightning", "1984");
        myColeccion.agregarVinilo("Led Zeppelin", "Physical Graffiti", "1975");
        myColeccion.agregarVinilo("Pink Floyd", "Wish You Were Here", "1975");
        myColeccion.agregarVinilo("Los Enanitos Verdes", "Lamento Boliviano", "1994");
        myColeccion.agregarVinilo("Queen", "News of the World", "1977");
        myColeccion.agregarVinilo("Charly García", "No Voy en Tren", "1987");
        myColeccion.agregarVinilo("The Beatles", "Abbey Road", "1969");
        myColeccion.agregarVinilo("AC/DC", "Back in Black", "1980");
        myColeccion.agregarVinilo("Nirvana", "Nevermind", "1991");
        myColeccion.agregarVinilo("The Rolling Stones", "Let It Bleed", "1969");
        myColeccion.agregarVinilo("Bob Dylan", "Highway 61 Revisited", "1965");

        for(int i = 0; i < 89; i++){
            myColeccion.agregarVinilo("asdfadf","sdf","af");
        }

        // Muestra el estado de la coleccion
        myColeccion.mostrarTotal();
        myColeccion.mostrarDisponibles();

        // Busca un artista con sus vinilos y los imprime por pantalla
        System.out.println("Buscar el artista Iron Maiden");
        myColeccion.buscarArtista("Iron Maiden");
        myColeccion.mostrarBusquedaArtista("Iron Maiden");

        // Imprime por pantalla toda la colección
        myColeccion.mostrarColeccion();

    }
}
