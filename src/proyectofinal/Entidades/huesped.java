package proyectofinal.Entidades;

public class huesped {
    private int idHuesped;
    private int DNI;
    private String Apellido, Nombre;
    private String Domicilio, Mail;
    private int celular;
    private boolean estado;

    public huesped() {
    }

    public huesped(int idHuesped, int DNI, String Apellido, String Nombre, String Domicilio, String Mail, int celular, boolean estado) {
        this.idHuesped = idHuesped;
        this.DNI = DNI;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Mail = Mail;
        this.celular = celular;
        this.estado = estado;
    }
    
    

    public huesped(int DNI, String Apellido, String Nombre, String Domicilio, String Mail, int celular, boolean estado) {
        this.DNI = DNI;
        this.Apellido = Apellido;
        this.Nombre = Nombre;
        this.Domicilio = Domicilio;
        this.Mail = Mail;
        this.celular = celular;
        this.estado= estado;
    }

    public int getIdHuesped() {
        return idHuesped;
    }

    public void setIdHuesped(int idHuesped) {
        this.idHuesped = idHuesped;
    }
    
    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String Domicilio) {
        this.Domicilio = Domicilio;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String Mail) {
        this.Mail = Mail;
    }

    public int getCelular() {
        return celular;
    }

    public void setCelular(int celular) {
        this.celular = celular;
    }

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "huesped{" + DNI + ", " + Apellido +" "+ Nombre + '}';
    }
    
    
}
