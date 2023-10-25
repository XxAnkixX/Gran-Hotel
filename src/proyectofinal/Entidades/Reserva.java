package proyectofinal.Entidades;

import java.time.LocalDate;

public class Reserva {
    private int idReserva;
    private huesped cliente;
    private habitaciones cuarto;
    private int cantP;
    private LocalDate fechaEntrada, fechaSalida;
    private double precio;

    public Reserva() {
    }

    public Reserva(int idReserva, huesped cliente, habitaciones cuarto, int cantP, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.idReserva = idReserva;
        this.cliente = cliente;
        this.cuarto = cuarto;
        this.cantP = cantP;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
    }
    

    public Reserva(huesped cliente, habitaciones cuarto, int cantP, LocalDate fechaEntrada, LocalDate fechaSalida) {
        this.cliente = cliente;
        this.cuarto = cuarto;
        this.cantP = cantP;
        this.fechaEntrada = fechaEntrada;
        this.fechaSalida = fechaSalida;
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

    public LocalDate getFechaEntrada() {
        return fechaEntrada;
    }

    public void setFechaEntrada(LocalDate fechaEntrada) {
        this.fechaEntrada = fechaEntrada;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
