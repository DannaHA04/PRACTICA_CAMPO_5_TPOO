
package Registros;

import java.util.Date;

public class Perro {
     
    //Atributos Encapsulados
    private String codigo;
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String tamanio;
    private String genero;
    private String estadoSalud;
    private Date fechaIngreso;
    
    //Constructor

    public Perro(String codigo, String nombre, String raza, int edad, double peso, String tamanio, String genero, String estadoSalud, Date fechaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.tamanio = tamanio;
        this.genero = genero;
        this.estadoSalud = estadoSalud;
        this.fechaIngreso = fechaIngreso;
    }
    
    //Metodos get y set

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public String getTamanio() {
        return tamanio;
    }

    public void setTamanio(String tamanio) {
        this.tamanio = tamanio;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoSalud() {
        return estadoSalud;
    }

    public void setEstadoSalud(String estadoSalud) {
        this.estadoSalud = estadoSalud;
    }

    public Date getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(Date fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }   
}
