package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;

public class GestorServicios {

    public void mostrarServicios() {

        RutaGastronomica ruta1 =
                new RutaGastronomica("Ruta del Salmón", 5, 6);

        RutaGastronomica ruta2 =
                new RutaGastronomica("Sabores de Llanquihue", 4, 4);

        PaseoLacustre paseo1 =
                new PaseoLacustre("Lago Llanquihue", 3, "Catamarán");

        PaseoLacustre paseo2 =
                new PaseoLacustre("Navegación Frutillar", 2, "Lancha");

        ExcursionCultural excursion1 =
                new ExcursionCultural("Puerto Varas Histórico", 4, "Iglesia del Sagrado Corazón");

        ExcursionCultural excursion2 =
                new ExcursionCultural("Museos de Frutillar", 3, "Museo Colonial Alemán");

        System.out.println(ruta1);
        System.out.println();

        System.out.println(ruta2);
        System.out.println();

        System.out.println(paseo1);
        System.out.println();

        System.out.println(paseo2);
        System.out.println();

        System.out.println(excursion1);
        System.out.println();

        System.out.println(excursion2);
    }
}
