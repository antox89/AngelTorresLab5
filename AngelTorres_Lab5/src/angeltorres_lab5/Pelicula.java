

package angeltorres_lab5;


public class Pelicula {
    
    private String nombre, categoria, clasificacion;
    private int duracion;

    public Pelicula() {
    }

    public Pelicula(String nombre, String categoria, int duracion, String clasificacion) {
        this.nombre = nombre;
        this.categoria = categoria;
        this.duracion = duracion;
        this.clasificacion = clasificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public String getClasificacion() {
        return clasificacion;
    }

    public void setClasificacion(String clasificacion) {
        this.clasificacion = clasificacion;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    

}
