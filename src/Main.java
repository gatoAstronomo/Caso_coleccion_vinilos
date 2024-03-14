public class Main {
    public static void main(String[] args){

        ColeccionVinilos myColeccion = new ColeccionVinilos();

        myColeccion.agregarVinilo("Iron Maiden","Iron Maiden","1980");
        myColeccion.agregarVinilo("Iron Maiden", "The Number of the Beast", "1982");
        myColeccion.agregarVinilo("Metallica", "Ride the Lightning", "1984");
        myColeccion.agregarVinilo("Led Zeppelin", "Physical Graffiti", "1975");
        myColeccion.agregarVinilo("Pink Floyd", "Wish You Were Here", "1975");
        myColeccion.agregarVinilo("Queen", "News of the World", "1977");
        myColeccion.agregarVinilo("The Beatles", "Abbey Road", "1969");
        myColeccion.agregarVinilo("AC/DC", "Back in Black", "1980");
        myColeccion.agregarVinilo("Nirvana", "Nevermind", "1991");
        myColeccion.agregarVinilo("The Rolling Stones", "Let It Bleed", "1969");
        myColeccion.agregarVinilo("Bob Dylan", "Highway 61 Revisited", "1965");
        myColeccion.agregarVinilo("Queen", "News of the World", "1977");

        myColeccion.mostrarColeccion();
        myColeccion.mostrarTotal();
        myColeccion.mostrarDisponibles();
        myColeccion.mostrarBusquedaArtista("Queen");

    }
}
