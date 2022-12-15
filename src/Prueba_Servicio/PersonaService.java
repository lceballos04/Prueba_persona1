/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Prueba_Servicio;

import Prueba_Modelo.Persona;
import java.util.List;

/**
 *
 * @author Juano
 */
public interface PersonaService {

    public abstract void crear(Persona persona);

    public abstract List<Persona> listar();

}
