public enum Moneda {
    PESO(1.00f),DOLAR(137.00f),EURO(132.00f); //puede tomar estos valores (enum)
    private float cotizacion;
    Moneda(float cotizacion){
        this.cotizacion  = cotizacion;
    }

    public float getCotizacion() {
        return cotizacion;
    }

    public void setCotizacion(float cotizacion) {
        this.cotizacion = cotizacion;
    }
    public float getMontoEnPeso(float monto){
        return monto * cotizacion;
    }
}
