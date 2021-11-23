/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package convocatoriarueda;

/**
 *
 * @author Kirpak Villa
 */
public class Jugador {
    
    
   
    private int numeroCamisa;
    private int edad;
    private String nombre;
    private String apellido;
    private String posicion;
    private String equipo;

    public Jugador() {
    }

    public Jugador(int numeroCamisa, int edad, String nombre, String apellido, String posicion, String equipo) {
        this.numeroCamisa = numeroCamisa;
        this.edad = edad;
        this.nombre = nombre;
        this.apellido = apellido;
        this.posicion = posicion;
        this.equipo = equipo;
    }

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
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

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }
    
    
    
}
    

