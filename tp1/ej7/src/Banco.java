import java.util.ArrayList;
import java.util.List;


public class Banco {
    private Moneda moneda;
    private List<Transaccion>transacciones = new ArrayList<Transaccion>(); //Lista permite elementos repetidos

    public void addTransaccion(Transaccion t){
        transacciones.add(t);
    }

    public float impuestoACobrar(){
        float total = 0;
        for(Transaccion t: transacciones){
            total += t.montoConImpEnPeso();
        }
        return total;
    }

    public float impuestoACobrarDe(Transaccion t){
        return t.montoConImpEnPeso();
    }
}
