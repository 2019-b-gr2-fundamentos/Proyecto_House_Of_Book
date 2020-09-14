
package Modelo;

public class Estudiante {
    //Atributos
    private int id;
    private String cedula;
    private String codigo_unico;
    private String nombre;
    private String apellido;
    private String carrera;
    private String correo;
    //Setters y Getters
    public String getCedula() {
        return cedula;
    }
    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getCodigo_unico() {
        return codigo_unico;
    }

    public void setCodigo_unico(String codigo_unico) {
        this.codigo_unico = codigo_unico;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }
    
}
