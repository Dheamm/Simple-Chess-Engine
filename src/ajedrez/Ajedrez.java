package ajedrez;

public class Ajedrez {

    public static void main(String[] args) {
        
        Peon peon = new Peon("Positiva", "Negro");
        
        Tablero tablero = new Tablero();
        
        tablero.colocar_pieza(peon, 0, 1);
        tablero.mostrar_tablero();
        System.out.println(peon.getUsos());
        
        System.out.println("-------------------------");
        
        tablero.mover_pieza(peon,3, 1);
        tablero.mostrar_tablero();
        System.out.println(peon.getUsos());
        
        tablero.mover_pieza(peon,6, 1);
        tablero.mostrar_tablero();
        System.out.println(peon.getUsos());
        
    }
}
