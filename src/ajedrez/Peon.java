package ajedrez;

public class Peon extends Pieza {
    
    private String polaridad;
    
    public Peon(String polaridad, String color) {
        super(color);
        this.polaridad = polaridad;
    }

    public String getPolaridad() {
        return polaridad;
    }

    public void setPolaridad(String polaridad) {
        this.polaridad = polaridad;
    }
   
    @Override
    public boolean movimiento_valido(int fila_destino, int columna_destino){
        if (getColumna() != columna_destino){
            System.out.println("El peon solo puede moverse verticalmente");
            return false;
        }
        
        int diferencia = (fila_destino-getFila());
        
        if (getPolaridad().equals("Positiva")) {
            if (diferencia <= 0) {
                System.out.println("El peón no puede moverse hacia atrás.");
                return false;
            }

            if (diferencia == 1) {
                return true; // movimiento normal
            }

            if (diferencia == 2 && getUsos() == 0) {
                return true; // primer movimiento doble
            }

            System.out.println("Movimiento inválido para peón positivo.");
            return false;
    }

        if (getPolaridad().equals("Negativa")) {
            if (diferencia >= 0) {
                System.out.println("El peón no puede moverse hacia atrás.");
                return false;
            }

            if (diferencia == -1) {
                return true; // movimiento normal
            }

            if (diferencia == -2 && getUsos() == 0) {
                return true; // primer movimiento doble
            }

            System.out.println("Movimiento inválido para peón negativo.");
            return false;
        }
        
        System.out.println("Polaridad desconocida.");
        return false;
    }
       
    @Override
    public String toString(){
        return "P" + (getColor().equals("Blanco") ? "B" : "N");
    }
}
