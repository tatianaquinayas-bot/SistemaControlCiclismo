
package Controlador;

import Modelo.Competidor;
import java.util.ArrayList;

public class ControladorMundial {

    private ArrayList<Competidor> competidores;

    // Constructor
    public ControladorMundial() {
        competidores = new ArrayList<>();
    }

    // Registrar competidor
    public boolean registrarCompetidor(String nombre, int edad,
            String pais, int ranking, double estatura, double peso) {

        if (buscarCompetidor(nombre) != null) {
            return false;
        }

        Competidor nuevo = new Competidor(
                nombre, edad, pais, ranking, estatura, peso);

        competidores.add(nuevo);

        return true;
    }

    // Buscar competidor por nombre
    public Competidor buscarCompetidor(String nombre) {

        for (Competidor c : competidores) {

            if (c.getNombre().equalsIgnoreCase(nombre)) {
                return c;
            }
        }

        return null;
    }

    // Mostrar competidores
    public String mostrarCompetidores() {

        String resultado = "";

        if (competidores.isEmpty()) {
            return "No hay competidores registrados.";
        }

        for (Competidor c : competidores) {

            resultado += c.toString();
            resultado += "\n-------------------------\n";
        }

        return resultado;
    }

    // Actualizar ranking
    public boolean actualizarRanking(String nombre,
            int puntos, boolean ganoMedalla) {

        Competidor c = buscarCompetidor(nombre);

        if (c == null) {
            return false;
        }

        if (ganoMedalla) {

            c.actualizarRanking(puntos, true);

        } else {

            c.actualizarRanking(puntos);
        }

        return true;
    }
}
