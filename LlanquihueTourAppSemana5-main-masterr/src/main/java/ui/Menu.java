package ui;

import data.GestorEntidades;
import model.Direccion;
import model.GuiaTuristico;
import model.Proveedor;

import javax.swing.JOptionPane;

public class Menu {

    private GestorEntidades gestor;

    public Menu() {
        gestor = new GestorEntidades();
    }

    public void iniciar() {

        while (true) {

            String opcion = JOptionPane.showInputDialog(
                    null,
                    "====== LLANQUIHUE TOUR ======\n\n" +
                            "1. Agregar Guía Turístico\n" +
                            "2. Agregar Proveedor\n" +
                            "3. Mostrar Entidades\n" +
                            "4. Salir\n\n" +
                            "Seleccione una opción:"
            );

            if (opcion == null) {
                break;
            }

            switch (opcion) {

                case "1":
                    agregarGuia();
                    break;

                case "2":
                    agregarProveedor();
                    break;

                case "3":
                    JOptionPane.showMessageDialog(
                            null,
                            gestor.mostrarTodo(),
                            "Listado",
                            JOptionPane.INFORMATION_MESSAGE
                    );
                    break;

                case "4":
                    JOptionPane.showMessageDialog(
                            null,
                            "Hasta luego."
                    );
                    return;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción inválida."
                    );
            }
        }
    }

    private void agregarGuia() {

        String nombre = JOptionPane.showInputDialog("Nombre");
        String rut = JOptionPane.showInputDialog("RUT");
        String telefono = JOptionPane.showInputDialog("Teléfono");
        String correo = JOptionPane.showInputDialog("Correo");

        String calle = JOptionPane.showInputDialog("Calle");
        String ciudad = JOptionPane.showInputDialog("Ciudad");

        Direccion direccion = new Direccion(calle, ciudad);

        String especialidad = JOptionPane.showInputDialog("Especialidad");

        int experiencia = Integer.parseInt(
                JOptionPane.showInputDialog("Años de experiencia")
        );

        GuiaTuristico guia = new GuiaTuristico(
                nombre,
                rut,
                telefono,
                correo,
                direccion,
                especialidad,
                experiencia
        );

        gestor.agregar(guia);

        JOptionPane.showMessageDialog(
                null,
                "Guía registrado correctamente."
        );
    }

    private void agregarProveedor() {

        String nombre = JOptionPane.showInputDialog("Nombre");
        String rut = JOptionPane.showInputDialog("RUT");
        String telefono = JOptionPane.showInputDialog("Teléfono");
        String correo = JOptionPane.showInputDialog("Correo");

        String calle = JOptionPane.showInputDialog("Calle");
        String ciudad = JOptionPane.showInputDialog("Ciudad");

        Direccion direccion = new Direccion(calle, ciudad);

        String servicio = JOptionPane.showInputDialog("Servicio");

        Proveedor proveedor = new Proveedor(
                nombre,
                rut,
                telefono,
                correo,
                direccion,
                servicio
        );

        gestor.agregar(proveedor);

        JOptionPane.showMessageDialog(
                null,
                "Proveedor registrado correctamente."
        );
    }
}