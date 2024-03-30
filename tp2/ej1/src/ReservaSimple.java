public class ReservaSimple extends Reserva{
    private Plato plato;
    public ReservaSimple(Plato plato){
        this.plato = plato;
    }

    public float precioTotal(){
        return plato.getPrecio();
    }
    public float precioTotalConDesc(){
        return getCliente().aplicarDesc(precioTotal());
    }
}
