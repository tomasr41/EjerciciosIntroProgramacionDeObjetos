public class Main {
    public static void main(String[] args) {

        Banco b = new Banco();
        //Solucion 1
        Transaccion t = new Nacional(200);
        b.addTransaccion(t);

        Transaccion I = new Internacional(Moneda.DOLAR, 200);
        b.addTransaccion(I);

        //Solucion 2
        b.addTransaccion(new Nacional(150));
        b.addTransaccion((new Internacional(Moneda.DOLAR, 150)));

        System.out.println(b.impuestoACobrar());
    }
}


/*Un banco internacional se encarga de gestionar transacciones de dinero entre diferentes
bancos nacionales o internacionales.
Del banco se conoce, el nombre, la ubicación (incluido el país), las transacciones y los
clientes del mismo.
Las transacciones pueden ser nacionales o internacionales y están compuestas por, una
fecha, un banco destino, un monto y el cliente origen (es decir, el cliente del banco
origen).
En el caso de las transacciones nacionales, el monto de la misma esta expresados en
peso, pero en el caso de las transacciones internacionales el monto está expresado en la
moneda del banco destino, con lo cual se debe tener el tipo de cambio (la moneda) de
dicho banco, por ejemplo: Dólar (U$D), Euro (€), Yen (¥).
Se trabaja únicamente con tres monedas y cada moneda tiene el siguiente valor de
cambio actual:
1 dolar = 137.70 pesos
1 yen = 1.09 pesos
1 euro = 132.22 pesos

Recuerde que el valor de la moneda es fijo, es decir, una vez que se crea la transacción y
se le asigna la moneda está y su valor al cambio no varía. Es por ello que se debe tener
en cuenta como diseña esta parte.
Por cada transacción, el banco cobra un impuesto sobre el monto de la transacción, que
varía según la transacción sea nacional o internacional.
En el caso de las transacciones nacionales el impuesto de las mismas es del 3% en
todos los casos. Y en el caso de las internacionales es del 7%.

