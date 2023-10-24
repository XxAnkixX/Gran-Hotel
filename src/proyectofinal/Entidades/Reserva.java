package proyectofinal.Entidades;

import java.util.Date;

public class Reserva {
    private int idReserva;
    private huesped cliente;
    private habitaciones cuarto;
    private int cantP;
    private Date fechaEntrada, fechaSalida;
    private double precio;

    public Reserva() {
    }

    public Reserva(int idReserva, huesped cliente, habitaciones cuarto, int cantP, Date fechaEntrada, Date fechaSalida, double precio) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.cuarto = cuarto;
        this.cantP = cantP;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
    }
    

    public Reserva(huesped cliente, habitaciones cuarto, int cantP, Date fechaEntrada, Date fechaSalida, double precio) {
        this.cliente = cliente;
        this.cuarto = cuarto;
        this.cantP = cantP;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
        this.precio = precio;
    }

    public int getIdReserva() {
        return idReserva;
    }

    public void setIdReserva(int idReserva) {
        this.idReserva = idReserva;
    }
    

    public huesped getCliente() {
        return cliente;
    }

    public void setCliente(huesped cliente) {
        this.cliente = cliente;
    }

    public habitaciones getCuarto() {
        return cuarto;
    }

    public void setCuarto(habitaciones cuarto) {
        this.cuarto = cuarto;
    }

    public int getCantP() {
        return cantP;
    }

    public void setCantP(int cantP) {
        this.cantP = cantP;
    }

    public Date getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(Date fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public Date getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(Date fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
