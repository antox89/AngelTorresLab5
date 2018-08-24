

package angeltorres_lab5;

import java.util.ArrayList;
import java.util.Date;


public class Boleteria extends Empleado{
    
    private ArrayList<Pelicula> listaPeliculas = new ArrayList();

    public Boleteria() {
    }

    public Boleteria(String nombre, String usuario, String password, String email, Date fechaNacimiento) {
        super(nombre, usuario, password, email, fechaNacimiento, "Boleteria");
    }
    
    public void agregarPeliculas(Pelicula pel){
        this.listaPeliculas.add(pel);
    }

    public ArrayList<Pelicula> getListaPeliculas() {
        return listaPeliculas;
    }

    public void setListaPeliculas(ArrayList<Pelicula> listaPeliculas) {
        this.listaPeliculas = listaPeliculas;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
