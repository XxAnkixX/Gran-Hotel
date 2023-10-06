package proyectofinal.Entidades;

public class habitaciones {
    private int idHabitacion;
    private Categoria tipo;
    private boolean disponible;

    public habitaciones() {
    }

    public habitaciones(int idHabitacion, Categoria tipo, boolean disponible) {
        this.idHabitacion = idHabitacion;
        this.tipo = tipo;
        this.disponible = disponible;
    }

    public habitaciones(Categoria tipo, boolean disponible) {
        this.tipo = tipo;
        this.disponible = disponible;
    }

    public int getIdHabitacion() {
        return idHabitacion;
    }

    public void setIdHabitacion(int idHabitacion) {
        this.idHabitacion = idHabitacion;
    }

    public Categoria getTipo() {
        return tipo;
    }

    public void setTipo(Categoria tipo) {
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
