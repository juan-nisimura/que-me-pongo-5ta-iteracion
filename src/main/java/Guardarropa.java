import java.util.ArrayList;
import java.util.List;

public class Guardarropa {

    List<Prenda> prendas = new ArrayList<Prenda>();
    String nombre;

    public Guardarropa(String nombre) {
        this.nombre = nombre;
    }

    public void agregarPrenda(Prenda prenda) {
        prendas.add(prenda);
    }

    public void quitarPrenda(Prenda prenda) {
        prendas.remove(prenda);
    }
}
