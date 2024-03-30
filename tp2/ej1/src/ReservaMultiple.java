import java.util.ArrayList;
import java.util.List;

public class ReservaMultiple extends Reserva{
    private List<Plato> platos = new ArrayList<Plato>();

    public void addPlato(Plato plato){
        platos.add(plato);
    }

    public ReservaMultiple(){
    }

    public ReservaMultiple(List<Plato> platos){
        this(); //primero debe ejecutar el constructor de arriba
        platos.addAll(platos);
    }
    public float precioTotal(){
        float total = 0;
        for (Plato p: platos){
            total += p.getPrecio();
        }
        return total;
    }
    public float precioTotalConDesc(){
        return getCliente().aplicarDesc(precioTotal());
    }
}
