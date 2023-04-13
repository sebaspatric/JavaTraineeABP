package CLASES;
//clase que define cada lanzamiento realizado
// dentro del tablero.

public class Huevo {
    //atributos
    private int filaH;
    private int columnaH;
    private int puntajeObtenido;

    //metodo constructor

    public Huevo() {
    }

    public Huevo(int filaH, int columnaH, int puntajeObtenido) {
        this.filaH = filaH;
        this.columnaH = columnaH;
        this.puntajeObtenido = puntajeObtenido;
    }

    //metodo getter and setter

    public int getFilaH() {
        return filaH;
    }

    public void setFilaH(int filaH) {
        this.filaH = filaH;
    }

    public int getColumnaH() {
        return columnaH;
    }

    public void setColumnaH(int columnaH) {
        this.columnaH = columnaH;
    }

    public int getPuntajeObtenido() {
        return puntajeObtenido;
    }

    public void setPuntajeObtenido(int puntajeObtenido) {
        this.puntajeObtenido = puntajeObtenido;
    }

    //metodo toString

    @Override
    public String toString() {
        return "Huevo{" +
                "filaH=" + filaH +
                ", columnaH=" + columnaH +
                ", puntajeObtenido=" + puntajeObtenido +
                '}';
    }
}
