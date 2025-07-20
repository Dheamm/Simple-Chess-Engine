
package ajedrez;

public class Tablero {
    private Pieza[][] tablero;
    
    public Tablero(){
        
        tablero = new Pieza[8][8];
    }
    
    public void colocar_pieza(Pieza pieza, int fila, int columna) {
        tablero[fila][columna] = pieza;
        pieza.setFila(fila);
        pieza.setColumna(columna);
    }
    
    public Pieza obtener_pieza(int fila, int columna){
        return tablero[fila][columna];
    }
    
    public void mover_pieza(Pieza pieza, int fila_destino, int columna_destino){
        if (pieza.movimiento_valido(fila_destino, columna_destino)) {
                tablero[pieza.getFila()][pieza.getColumna()] = null;
                 colocar_pieza(pieza, fila_destino, columna_destino);
                 pieza.setUsos(+1);
        }
        else {
            System.out.println("Movimiento invalido");
        }
    }
    
    public void mostrar_tablero() {
//        System.out.println("  A  B  C  D  E  F  G  H"); // Columnas
        System.out.println("  0  1  2  3  4  5  6  7"); // Columnas

        for (int fila = 0; fila < 8; fila++) {
            System.out.print(fila + " "); // Números estilo ajedrez
            for (int columna = 0; columna < 8; columna++) {
                Pieza pieza = tablero[fila][columna];
                if (pieza == null) {
                    System.out.print(".  ");
                } else {
                    System.out.print(pieza + " ");
                }
            }
            System.out.println();
        }
    }
}
