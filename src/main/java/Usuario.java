import java.util.ArrayList;
import java.util.List;

public class Usuario {
    private List<Guardarropa> guardarropas = new ArrayList<Guardarropa>();
    private List<Propuesta> propuestasPendientes = new ArrayList<Propuesta>();
    private List<Propuesta> propuestasAceptadas = new ArrayList<Propuesta>();

    public void agregarGuardarropa(Guardarropa guardarropa) {
        this.guardarropas.add(guardarropa);
    }

    public void crearGuardarropaCompartido(String nombreGuardarropa, List<Usuario> usuarios) {
        Guardarropa guardarropa = new Guardarropa(nombreGuardarropa);
        this.agregarGuardarropa(guardarropa);
        usuarios.stream().forEach(usuario -> usuario.agregarGuardarropa(guardarropa));
    }

    public void recibirPropuesta(Propuesta propuesta) {
        this.propuestasPendientes.add(propuesta);
    }

    public List<Propuesta> getPropuestasPendientes() {
        return propuestasPendientes;
    }

    public void aceptarPropuesta(Propuesta propuesta) {
        // Confío que me pasan por parámetro una propuesta que sacaron de la lista
        propuestasPendientes.remove(propuesta);
        propuesta.aplicar();
        propuestasAceptadas.add(propuesta);
    }

    public void rechazarPropuesta(Propuesta propuesta) {
        // Confío que me pasan por parámetro una propuesta que sacaron de la lista
        propuestasPendientes.remove(propuesta);
    }

    public void deshacerPropuesta(Propuesta propuesta) {
        // Confío que me pasan por parámetro una propuesta que sacaron de la lista
        propuestasAceptadas.remove(propuesta);
        propuesta.deshacer();
    }
}