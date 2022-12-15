/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba_Modelo;

/**
 *
 * @author Juano
 */
public class Persona {

    private String nombre;
    private String sexo;
    private int edad;
    private String profesion;
    private int peso;

    public Persona(String nombre, String sexo, int edad, String profesion, int peso) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.edad = edad;
        this.profesion = profesion;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getProfesion() {
        return profesion;
    }

    public void setProfesion(String profesion) {
        this.profesion = profesion;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", sexo=" + sexo + ", edad=" + edad + ", profesion=" + profesion + ", peso=" + peso + '}';
    }

}
