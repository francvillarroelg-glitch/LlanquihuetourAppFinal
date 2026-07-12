package data;

import model.*;

import java.util.ArrayList;

public class GestorEntidades {

    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        entidades = new ArrayList<>();
    }

    public void agregar(Registrable r) {
        entidades.add(r);
    }

    public String mostrarTodo() {

        StringBuilder sb = new StringBuilder();

        for (Registrable r : entidades) {

            sb.append(r.mostrarResumen()).append("\n");

            if (r instanceof GuiaTuristico) {
                sb.append("→ Tipo: Guía Turístico\n");
            }

            if (r instanceof Proveedor) {
                sb.append("→ Tipo: Proveedor\n");
            }

            if (r instanceof Persona) {
                sb.append("→ Es una Persona\n");
            }

            sb.append("----------------------\n");
        }

        return sb.toString();
    }

}