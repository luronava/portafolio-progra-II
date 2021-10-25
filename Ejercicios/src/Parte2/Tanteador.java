package Parte2;

public class Tanteador {
    private int puntuacion;

    public Tanteador() {
        puntuacion = 0;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }
    
    public void mostrarPuntuacion()
    {
        System.out.println("Puntuacion: "+puntuacion);
    }
    public void incrementrar()
    {
        puntuacion++;
    }
    public void decrementar()
    {
        puntuacion--;
    }
    public void reiniciar()
    {
        puntuacion=0;
    }
}
