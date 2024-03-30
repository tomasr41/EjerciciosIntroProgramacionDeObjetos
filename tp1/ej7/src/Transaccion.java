public abstract class Transaccion {
    private float monto;
    public Transaccion(float value){
        monto = value;
    }
    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }

    public abstract float montoEnPeso();

    public abstract float montoConImpEnPeso();

}
