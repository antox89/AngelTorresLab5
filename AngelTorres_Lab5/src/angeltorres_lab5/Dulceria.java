

package angeltorres_lab5;

import java.util.ArrayList;
import java.util.Date;


public class Dulceria extends Empleado{
    
    private ArrayList<Dulce> listaDulces = new ArrayList();

    public Dulceria() {
        super();
    }

    public Dulceria(String nombre, String usuario, String password, String email, Date fechaNacimiento) {
        super(nombre, usuario, password, email, fechaNacimiento, "Dulceria");
    }
    
    public void agregarDulces(Dulce d){
        this.listaDulces.add(d);
    }

    public ArrayList<Dulce> getListaDulces() {
        return listaDulces;
    }

    public void setListaDulces(ArrayList<Dulce> listaDulces) {
        this.listaDulces = listaDulces;
    }

    @Override
    public String toString() {
        return nombre;
    }

    
}
