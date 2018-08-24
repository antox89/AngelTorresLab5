

package angeltorres_lab5;

import java.util.Date;


public class Empleado {
    
    protected String nombre, usuario, password, email;
    protected Date fechaNacimiento;
    protected String puesto;

    public Empleado() {
    }

    public Empleado(String nombre, String usuario, String password, String email, Date fechaNacimiento, String puesto) {
        this.nombre = nombre;
        this.usuario = usuario;
        this.password = password;
        this.email = email;
        this.fechaNacimiento = fechaNacimiento;
        this.puesto = puesto;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    @Override
    public String toString() {
        return nombre;
    }

    

    

}
