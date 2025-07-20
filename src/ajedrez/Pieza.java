package ajedrez;

public abstract class Pieza {
    private String color;
    private int fila;
    private int columna;
    private int usos;
    

    public Pieza(String color) {
        this.color = color;
        this.usos = 0;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
    public int getFila(){
        return fila;
    }
    
    public int getColumna(){
        return columna;
    }
    
    public void setFila(int nueva_fila){
        this.fila = nueva_fila;
    }
    
    public void setColumna(int nueva_columna){
        this.columna = nueva_columna;
    }

    public int getUsos() {
        return usos;
    }

    public void setUsos(int usos) {
        this.usos = getUsos() + usos;
    }

    public String getPosicion(){
        return Integer.toString(getFila()) + Integer.toString(getColumna());
    }
    
    public boolean movimiento_valido(int fila_destino, int columna_destino){
        return true;
    }

}
