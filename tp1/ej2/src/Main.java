public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}

/*Implemente en JAVA una CuentaBancaria con sus respectivas subclases
CajaDeAhorro y CuentaCorriente las cuales permiten extraer y depositar dinero.
Ambas poseen un saldo, el cual se puede consultar. Además, ambas poseen un
limiteMinimo de extracción, es decir que el saldo no puede quedar menor a eso.
Mientras que en la caja de ahorro el limiteMinimo es de 10, en la cuenta corriente es de
-150. La caja de ahorro tiene un máximo de extracciones (inicialmente 5 y se “resetea
manualmente una vez al mes”) y la cuenta corriente no.
Ambas cuentas tienen un titular (uno y solo uno) que es de la clase Persona (La cual
posee todos los atributos de una persona) y una fecha de apertura de cuenta.
Por otro lado, se desea llevar un control de las transacciones realizada, es por ellos que
cada vez que se realice una transacción, la misma se debe guardar en la cuenta. De cada
Transacción se conoce la fecha, el monto y el tipo de transacción.
