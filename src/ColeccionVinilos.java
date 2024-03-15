import java.util.ArrayList;

public class ColeccionVinilos{

    // Lista dinamica con las instancias de tipo Vinilo
    ArrayList<Vinilo> vinilos = new ArrayList<>();

    // Agrega un vinilo a la lista vinilos con sus respectivos datos
    public void agregarVinilo(String artista, String album, String year){

        // Crea una instancia de un Vinilo
        Vinilo vinilo = new Vinilo();

        // Inserta los datos
        vinilo.artista = artista;
        vinilo.album = album;
        vinilo.year = year;

        // Si hay espacio lo inserta
        if(vinilos.size() <= 100) {
            vinilos.add(vinilo);
        //Sino no inserta y alerta que la colección ya esta completa
        }else{
            System.out.println("La colección ya tiene 100 espacios %n");
        }

    }

    // Retorna el total de vinilos
    public int totalVinilos(){return vinilos.size();}

    // Mustra por pantalla la cantidad de vinilos de la colección
    public void mostrarTotal(){ System.out.printf("La colección tiene un total de %s vinilos %n%n", totalVinilos()); }

    /*
    * Se le ingresa un artista e indica si este es autor de almenos un vinilo de la colección, además retorna
    * true o false según el caso
    */
    public boolean buscarArtista(String artista){
        for(Vinilo vinilo : vinilos) {
            if (vinilo.artista.toLowerCase().equals(artista.toLowerCase())){
                System.out.printf("El artista %s se encuentra en la colección%n%n", artista);
                return true;
            }
        }

        System.out.printf("El artista %s no existe en la colección%n%n", artista);
        return false;
    }

    // Se le indica un artista e imprime todos los vinilos de este
    public void mostrarBusquedaArtista(String artista){
        int i = 1;
        for(Vinilo vinilo : vinilos) {
            if (vinilo.artista.toLowerCase().equals(artista.toLowerCase()))
                System.out.printf("fila %3d %s - %s - %s %n", i, vinilo.artista, vinilo.album, vinilo.year);
            i++;
        }
        System.out.println();

    }

    // Imprime por pantalla toda la coleccion de vinilos
    public void mostrarColeccion(){
        int i = 1;
        for(Vinilo vinilo : vinilos)
            System.out.printf("fila %3d %s - %s - %s %n", i++, vinilo.album, vinilo.artista, vinilo.year);

        System.out.println();
    }

    // Retorna la cantidad de filas disponibles
    public int disponibles(){return 100 - totalVinilos();}

    // Muestra cuantos espacios quedan disponibles
    public void mostrarDisponibles(){System.out.printf("Queda un total de %d espacios libres %n%n", disponibles());}
}
