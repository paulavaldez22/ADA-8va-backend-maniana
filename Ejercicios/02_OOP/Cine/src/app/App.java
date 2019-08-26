package app;

/**
 * Simple prototipo donde instancia una sala, cine, peli y un espectador y hace las validaciones de entrada y luego lo "sienta"
 * La sala se arma en el momento con una configuracion especifica que no es una mmatrix de NxN
 * 
 */
public class App {
//
    public static void main(String[] args) throws Exception {

        // Creo la pelicula
        Pelicula pelicula = new Pelicula("Mi vida", 90, 16, "DDR");
        double precio = 350;

        // Creo una sala

        Sala sala = new Sala(pelicula);

        sala.agregarFila('A',5);
        sala.agregarFila('B',5);
        sala.agregarFila('C',4);
        sala.agregarFila('D',5);

        // Creo cine

        // Creo el cine, necesito la pelicula para ello
        Cine cine = new Cine(sala, precio, pelicula);

        Espectador e1 = new Espectador("Ana", 30, 10);

        System.out.println(e1);

        Asiento proxAsiento = sala.proximoAsientoDisponibleParaEspectador();

        if (proxAsiento == null) {
            System.out.println("No hay asientos disponibles");
            return;
        }

        if (cine.sePuedeSentar(e1)) {
         
            System.out.println("Se pudo sentar");
          
            proxAsiento.setEspectador(e1);
        
        }
        else
         {
             System.out.println("El espectador no se puede sentar");
         }

        cine.mostrar(); // Mostramos la información del cine, tambien se puede usar un toString

        System.out.println("Fin");

    }

}
