package proyectofinal.Entidades;

public class habitaciones {
    private int idHabitacion;
    private int tipo;
    private boolean disponible;

    public habitaciones() {
    }

    public habitaciones(int idHabitacion, int tipo, boolean disponible) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.disponible = disponible;
    }

    public habitaciones(int tipo, boolean disponible) {
        this.tipo = tipo;
        this.disponible = disponible;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    @Override
    public String toString() {
        if(disponible){
            return "habitacion"  + idHabitacion + ":" + "disponible";
        }else{
            return "habitacion"  + idHabitacion + ":" + "no disponible";
        }
    }
    
    
}
