/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba_Servicio;

import Prueba_Modelo.Persona;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PersonaServiceImpl implements PersonaService {
    private static List<Persona> personaList;

    public PersonaServiceImpl() {
        this.personaList = new ArrayList<>();
        
    }
    

    @Override
    public void crear(Persona persona) {
    this.personaList.add(persona);
            }

    @Override
    public List<Persona> listar() {
     return this.personaList;
    }
    
}
