

package angeltorres_lab5;

import java.util.Date;


public class Administrador extends Empleado{

    public Administrador() {
        super();
    }

    
    public Administrador(String nombre, String usuario, String password, String email, Date fechaNacimiento, String puesto) {
        super(nombre, usuario, password, email, fechaNacimiento, puesto);
    }

    @Override
    public String toString() {
        return nombre;
    }

    
    
}
