package proyectofinal.Entidades;

public class Categoria {
    private int idCategoria; 
    private int maxP, cantC;
    private int tipoC;
    private double precio;

    public Categoria() {
    }
    
    

    public Categoria(int idCategoria, int maxP, int cantC, int tipoC, double precio) {
        this.idCategoria = idCategoria;
        this.maxP = maxP;
        this.cantC = cantC;
        this.tipoC = tipoC;
        this.precio = precio;
    }

    public int getCodigo() {
        return idCategoria;
    }

    public void setCodigo(int codigo) {
        this.idCategoria = codigo;
    }

    public int getMaxtP() {
        return maxP;
    }

    public void setMaxP(int maxP) {
        this.maxP = maxP;
    }

    public int getCantC() {
        return cantC;
    }

    public void setCantC(int cantC) {
        this.cantC = cantC;
    }

    public int getTipoC() {
        return tipoC;
    }

    public void setTipoC(int tipoC) {
        this.tipoC = tipoC;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
