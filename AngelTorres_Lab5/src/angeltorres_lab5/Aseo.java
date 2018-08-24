

package angeltorres_lab5;

import java.util.ArrayList;
import java.util.Date;


public class Aseo extends Empleado{
    
    private ArrayList<ImplementoLimpieza> listaImplementos = new ArrayList();

    public Aseo() {
        super();
    }
    
    public void agregarImplementoLimpieza(ImplementoLimpieza im){
        this.listaImplementos.add(im);
    }

    public Aseo(String nombre, String usuario, String password, String email, Date fechaNacimiento) {
        super(nombre, usuario, password, email, fechaNacimiento, "Aseo");
    }

    public ArrayList<ImplementoLimpieza> getListaImplementos() {
        return listaImplementos;
    }

    public void setListaImplementos(ArrayList<ImplementoLimpieza> listaImplementos) {
        this.listaImplementos = listaImplementos;
    }
    
    

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
