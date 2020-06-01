public class PropuestaAgregarPrenda {
    Guardarropa guardarropa;
    Prenda prenda;

    public PropuestaAgregarPrenda(Guardarropa guardarropa, Prenda prenda) {
        this.guardarropa = guardarropa;
        this.prenda = prenda;
    }

    public void aplicar() {
        guardarropa.agregarPrenda(prenda);
    }

    public void deshacer() {
        guardarropa.quitarPrenda(prenda);
    }
}