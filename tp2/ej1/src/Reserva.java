import java.util.Date;

public abstract class Reserva {
    private Cliente cliente;
    private Date date;

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public abstract float precioTotal();
    public abstract float precioTotalConDesc();

}
