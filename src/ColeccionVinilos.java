import java.util.ArrayList;

public class ColeccionVinilos{

    ArrayList<Vinilo> vinilos = new ArrayList<>();

    public void agregarVinilo(String artista, String album, String year){

        Vinilo vinilo = new Vinilo();
        vinilo.artista = artista;
        vinilo.album = album;
        vinilo.year = year;

        if(vinilos.size() <= 100) {
            vinilos.add(vinilo);
        }else{
            System.out.println("La colección ya tiene 100 espacios %n");
        }

    }

    public int totalVinilos(){
        return vinilos.size();
    }

    public void mostrarTotal(){
        System.out.printf("La colección tiene un total de %s vinilos %n%n", totalVinilos());
    }

    public boolean buscarArtista(String artista){
        for(Vinilo vinilo : vinilos)
            if (vinilo.artista == artista)
                return true;
        return false;
    }

    public void mostrarBusquedaArtista(String artista){
        int i = 1;
        for(Vinilo vinilo : vinilos) {
            if (vinilo.artista == artista)
                System.out.printf("fila %3d %s - %s - %s %n", i, vinilo.album, vinilo.artista, vinilo.year);
            i++;
        }

    }

    public void mostrarColeccion(){

        int i = 1;
        for(Vinilo vinilo : vinilos)
            System.out.printf("fila %3d %s - %s - %s %n", i++, vinilo.album, vinilo.artista, vinilo.year);

        System.out.printf("%n");

    }

    public int disponibles(){
        return 100 - totalVinilos();
    }

    public void mostrarDisponibles(){
        System.out.printf("Queda un total de %d espacios libres %n", disponibles());
    }
}
