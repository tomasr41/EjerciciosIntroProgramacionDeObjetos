public class Internacional extends Transaccion{
    private Moneda moneda;

    public Internacional(Moneda m, float value){
        super(value); //la clase hija le pasa el valor al padre que se construye primero que esta.
        moneda = m;
    }
    public float montoEnPeso(){
        return moneda.getMontoEnPeso(getMonto());
    }

    public float montoConImpEnPeso(){
        return montoEnPeso() - 3; //por ciento
    }
    
}
