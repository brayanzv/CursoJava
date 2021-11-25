package CreacionClases;


/**
 * Write a description of class PruebaPersona here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PruebaPersona
{
    public static void main(String[] args){
        Persona persona1;
        persona1 = new Persona();
        persona1.nombre = "juan";
        persona1.apellido = "Perez";
        persona1.desplegarInformacion();
        
        Persona persona2 = new Persona();
        System.out.println("persona2 = " + persona2);
        System.out.println("persona1 = " + persona1);
        
        //no comparten informacion con persona1 
        //solo se comparte los atributos y metodos
        persona2.desplegarInformacion();
        
    }
}
