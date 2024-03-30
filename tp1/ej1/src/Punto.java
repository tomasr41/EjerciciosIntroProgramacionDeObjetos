public class Punto {

    private int x;
    private int y;

    public Punto(int x, int y) {
        setX(x);
        setY(y);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }





    public void sumar(int v){
        /*Suma el mismo valor a x e y*/

        this.setX(getX()+v);
        this.setY(getY()+v);
    }



    public void sumar(Punto unPunto){
        /*Suma unPunto a los valores que tiene el punto*/
        setX(getX() + unPunto.getX());
        setY(getY() + unPunto.getY());
    }






}
