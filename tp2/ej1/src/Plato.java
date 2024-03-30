public class Plato {
    private float precio;
    private String Nombre;
    private String diasDisponibles;

    public Plato(float precio){
        this.precio = precio;
    }
    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getDiasDisponibles() {
        return diasDisponibles;
    }

    public void setDiasDisponibles(String diasDisponibles) {
        this.diasDisponibles = diasDisponibles;
    }



}
