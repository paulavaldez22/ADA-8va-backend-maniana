package ar.com.ada.mongo.nefly.entities;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Serie
 */
@Document(collection = "Series")
public class Serie extends Contenido {

    private List<Temporada> temporadas = new ArrayList<Temporada>();

    public Temporada getTemporada(int nro) {
        // Recorrer cada temporada
        // Si el nro de temporada del ciclo es igual a "nro"
        // Devolver esa temporada

        for (Temporada tempo : this.temporadas) {
            if (tempo.getNumeroTemporada() == nro) {
                return tempo;
            }

        }

        return null;
    }

    public List<Temporada> getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(List<Temporada> temporadas) {
        this.temporadas = temporadas;
    }
}