
package Registros;

import java.util.Date;

public class Perro {
     
    //Atributos Encapsulados
    private String codigo;
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String tamaño;
    private String genero;
    private String estadoSalud;
    private Date fechaIngreso;
    
    //Constructor

    public Perro(String codigo, String nombre, String raza, int edad, double peso, String Tamaño, String genero, String estadoSalud, Date fechaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.tamaño = Tamaño;
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
        return tamaño;
    }

    public void setTamanio(String tamanio) {
        this.tamaño = tamanio;
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
    
    
    //METODOS ADICIONALES
    
    public double calcularCostoBase() {
        double costoBase = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoBase = 50;
        } else if (tamaño.equalsIgnoreCase("mediano")) {
            costoBase = 70;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoBase = 90;
        }
        return costoBase;
    }

    public double calcularAdicionalSalud() {
        double adicional = 0;
        if (estadoSalud.equalsIgnoreCase("saludable")) {
            adicional = 0;
        } else if (estadoSalud.equalsIgnoreCase("en tratamiento")) {
            adicional = 0.25;
        } else if (estadoSalud.equalsIgnoreCase("recuperación")) {
            adicional = 0.15;
        } else if (estadoSalud.equalsIgnoreCase("crítico")) {
            adicional = 0.40;
        }
        return adicional;
    }

    public double calcularCostoAlimentacion() {
        double costoComida = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoComida = 20;
        } else if (tamaño.equalsIgnoreCase("mediano")) {
            costoComida = 30;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoComida = 40;
        }
        return costoComida;
    }

    public double calcularDescuentoEstadia() {
        long diferenciaEnMilisegundos = new Date().getTime() - fechaIngreso.getTime();
        long diasEstadia = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24);

        if (diasEstadia < 30) {
            return 0;
        } else if (diasEstadia >= 30 && diasEstadia <= 90) {
            return 0.05;
        } else if (diasEstadia > 90 && diasEstadia <= 180) {
            return 0.10;
        } else {
            return 0.15;
        }
    }
    
    package Registros;

import java.util.Date;

public class Perro {
     
    //Atributos Encapsulados
    private String codigo;
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String tamaño;
    private String genero;
    private String estadoSalud;
    private Date fechaIngreso;
    
    //Constructor

    public Perro(String codigo, String nombre, String raza, int edad, double peso, String Tamaño, String genero, String estadoSalud, Date fechaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.tamaño = Tamaño;
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
        return tamaño;
    }

    public void setTamanio(String tamanio) {
        this.tamaño = tamanio;
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
    
    
    //METODOS ADICIONALES
    
    public double calcularCostoBase() {
        double costoBase = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoBase = 50;
        } else if (tamaño.equalsIgnoreCase("mediano")) {
            costoBase = 70;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoBase = 90;
        }
        return costoBase;
    }

    public double calcularAdicionalSalud() {
        double adicional = 0;
        if (estadoSalud.equalsIgnoreCase("saludable")) {
            adicional = 0;
        } else if (estadoSalud.equalsIgnoreCase("en tratamiento")) {
            adicional = 0.25;
        } else if (estadoSalud.equalsIgnoreCase("recuperación")) {
            adicional = 0.15;
        } else if (estadoSalud.equalsIgnoreCase("crítico")) {
            adicional = 0.40;
        }
        return adicional;
    }

    public double calcularCostoAlimentacion() {
        double costoComida = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoComida = 20;
        } else if (tamaño.equalsIgnoreCase("mediano")) {
            costoComida = 30;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoComida = 40;
        }
        return costoComida;
    }

    public double calcularDescuentoEstadia() {
        long diferenciaEnMilisegundos = new Date().getTime() - fechaIngreso.getTime();
        long diasEstadia = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24);

        if (diasEstadia < 30) {
            return 0;
        } else if (diasEstadia >= 30 && diasEstadia <= 90) {
            return 0.05;
        } else if (diasEstadia > 90 && diasEstadia <= 180) {
            return 0.10;
        } else {
            return 0.15;
        }
    }
    
    package Registros;

import java.util.Date;

public class Perro {
     
    //Atributos Encapsulados
    private String codigo;
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String tamaño;
    private String genero;
    private String estadoSalud;
    private Date fechaIngreso;
    
    //Constructor

    public Perro(String codigo, String nombre, String raza, int edad, double peso, String Tamaño, String genero, String estadoSalud, Date fechaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.tamaño = Tamaño;
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
        return tamaño;
    }

    public void setTamanio(String tamanio) {
        this.tamaño = tamanio;
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
    
    
    //METODOS ADICIONALES
    
    public double calcularCostoBase() {
        double costoBase = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoBase = 50;
        } else if (tamaño.equalsIgnoreCase("mediano")) {
            costoBase = 70;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoBase = 90;
        }
        return costoBase;
    }

    public double calcularAdicionalSalud() {
        double adicional = 0;
        if (estadoSalud.equalsIgnoreCase("saludable")) {
            adicional = 0;
        } else if (estadoSalud.equalsIgnoreCase("en tratamiento")) {
            adicional = 0.25;
        } else if (estadoSalud.equalsIgnoreCase("recuperación")) {
            adicional = 0.15;
        } else if (estadoSalud.equalsIgnoreCase("crítico")) {
            adicional = 0.40;
        }
        return adicional;
    }

    public double calcularCostoAlimentacion() {
        double costoComida = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoComida = 20;
        } else if (tamaño.equalsIgnoreCase("mediano")) {
            costoComida = 30;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoComida = 40;
        }
        return costoComida;
    }

    public double calcularDescuentoEstadia() {
        long diferenciaEnMilisegundos = new Date().getTime() - fechaIngreso.getTime();
        long diasEstadia = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24);

        if (diasEstadia < 30) {
            return 0;
        } else if (diasEstadia >= 30 && diasEstadia <= 90) {
            return 0.05;
        } else if (diasEstadia > 90 && diasEstadia <= 180) {
            return 0.10;
        } else {
            return 0.15;
        }
    }
    
    pubpackage Registros;

import java.util.Date;

public class Perro {
     
    //Atributos Encapsulados
    private String codigo;
    private String nombre;
    private String raza;
    private int edad;
    private double peso;
    private String tamaño;
    private String genero;
    private String estadoSalud;
    private Date fechaIngreso;
    
    //Constructor

    public Perro(String codigo, String nombre, String raza, int edad, double peso, String Tamaño, String genero, String estadoSalud, Date fechaIngreso) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.raza = raza;
        this.edad = edad;
        this.peso = peso;
        this.tamaño = Tamaño;
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
        return tamaño;
    }

    public void setTamanio(String tamanio) {
        this.tamaño = tamanio;
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
    
    
    //METODOS ADICIONALES
    
    public double calcularCostoBase() {
        double costoBase = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoBase = 50;
        } else if (tamaño.equalsIgnoreCase("mediano")) {
            costoBase = 70;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoBase = 90;
        }
        return costoBase;
    }

    public double calcularAdicionalSalud() {
        double adicional = 0;
        if (estadoSalud.equalsIgnoreCase("saludable")) {
            adicional = 0;
        } else if (estadoSalud.equalsIgnoreCase("en tratamiento")) {
            adicional = 0.25;
        } else if (estadoSalud.equalsIgnoreCase("recuperación")) {
            adicional = 0.15;
        } else if (estadoSalud.equalsIgnoreCase("crítico")) {
            adicional = 0.40;
        }
        return adicional;
    }

    public double calcularCostoAlimentacion() {
        double costoComida = 0;
        if (tamaño.equalsIgnoreCase("pequeño")) {
            costoComida = 20;
        } else if (tamaño.equalsIgnoreCase("mediano")) {
            costoComida = 30;
        } else if (tamaño.equalsIgnoreCase("grande")) {
            costoComida = 40;
        }
        return costoComida;
    }

    public double calcularDescuentoEstadia() {
        long diferenciaEnMilisegundos = new Date().getTime() - fechaIngreso.getTime();
        long diasEstadia = diferenciaEnMilisegundos / (1000 * 60 * 60 * 24);

        if (diasEstadia < 30) {
            return 0;
        } else if (diasEstadia >= 30 && diasEstadia <= 90) {
            return 0.05;
        } else if (diasEstadia > 90 && diasEstadia <= 180) {
            return 0.10;
        } else {
            return 0.15;
        }
    }
    
    // Método para calcular el gasto mensual total del perro
    public double calcularGastoTotal() {
        
        double costoCuidado = calcularCostoBase() * (1 + calcularAdicionalSalud());
        double costoTotalAntesDescuento = costoCuidado + calcularCostoAlimentacion();
        double descuento = calcularDescuentoEstadia();
        return costoTotalAntesDescuento * (1 - descuento);
    }

}
