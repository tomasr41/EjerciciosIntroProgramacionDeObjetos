public class Nacional extends Transaccion{
    private Moneda moneda = Moneda.PESO;

    public Nacional(float value){
        super(value); //la clase hija le pasa el valor al padre que se construye primero que esta.
    }
    public float montoEnPeso(){
        return moneda.getMontoEnPeso(getMonto());
    }

    public float montoConImpEnPeso(){
        return montoEnPeso() - 3;
    }

}
