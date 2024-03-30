public class Main {
    public static void main(String[] args) {
        ReservaMultiple r = new ReservaMultiple();
        r.addPlato(new Plato(100f));
        r.addPlato(new Plato(150f));
        r.setCliente(new Alumno());
        System.out.println(r.precioTotalConDesc());
        
    }
}
