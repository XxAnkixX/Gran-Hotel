package proyectofinal.AccesoADatos;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import proyectofinal.Entidades.Categoria;

public class CategoriaData {

    public List<Double> listaPrecio() {
        ArrayList<Double> precios = new ArrayList<>();
        double cero = 0;
        for (int i = 0; i <= 10; i++) {
            precios.add(i, cero);
        }
        return precios;
    }

//TIPO DE CAMA: 1=ESTANDAR
    //TIPO DE CAMA: 2=QUEEN
    //TIPO DE CAMA: 3=KING
    //idCategoria= X(cantidad de personas) Y(cantidad de camas) Z(tipo de cama)
    //---------------Habitaciones Simples--------------------------
    Categoria A = new Categoria(211, 2, 1, 1, 100);
    Categoria B = new Categoria(221, 2, 2, 1, 120);
    Categoria C = new Categoria(212, 2, 1, 2, 150);
    //---------------Habitaciones Dobles--------------------------
    Categoria D = new Categoria(421, 4, 2, 1, 140);
    Categoria E = new Categoria(422, 4, 2, 2, 180);
    Categoria F = new Categoria(441, 4, 4, 1, 200);
    //---------------Habitaciones Triples--------------------------
    Categoria G = new Categoria(631, 6, 3, 1, 240);
    Categoria H = new Categoria(632, 6, 3, 2, 300);
    Categoria I = new Categoria(661, 6, 6, 1, 340);
    //---------------Suite Lujo--------------------------
    Categoria J = new Categoria(213, 2, 1, 3, 400);
    Categoria K = new Categoria(223, 2, 2, 3, 600);

//categorias: estandar simple, doble, triple y Suite Lujo
    // public void cambiarPrecio();
}
