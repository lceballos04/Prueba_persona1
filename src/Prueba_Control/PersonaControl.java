/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Prueba_Control;

import Prueba_Modelo.Persona;
import Prueba_Servicio.PersonaServiceImpl;
import java.util.List;

/**
 *
 * @author Juano
 */
public class PersonaControl {
    private PersonaServiceImpl personaServiceImpl = new PersonaServiceImpl ();
    
    public String Crear(String[]data){
        var retorno="No se pudo crear";
        
        var nombre=data[0];
        var sexo=data[1];
        var edad=Integer.valueOf(data[2]).intValue();
        var profesion=data[3];
        var peso=Integer.valueOf(data[4]).intValue();
        if(edad<0){
            retorno+="No se puedo crear";
        }else{
            var persona= new Persona(nombre,sexo,edad,profesion,peso);
            this.personaServiceImpl.crear(persona);
            
            retorno="Persona=  "+persona.getNombre()+" creada correctamente";
        }
        
        return retorno;
        
    }
    
    public List<Persona> Listar(){
        return this.personaServiceImpl.listar();
        
    }
    
}
