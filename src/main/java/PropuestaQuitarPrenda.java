public class PropuestaQuitarPrenda {
    Guardarropa guardarropa;
    Prenda prenda;

    public PropuestaQuitarPrenda(Guardarropa guardarropa, Prenda prenda) {
        this.guardarropa = guardarropa;
        this.prenda = prenda;
    }

    public void aplicar() {
        guardarropa.quitarPrenda(prenda);
    }

    public void deshacer() {
        guardarropa.agregarPrenda(prenda);
    }
}