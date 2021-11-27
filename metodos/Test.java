package metodos;


/**
 * Write a description of class Test here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Test
{
    public static void main(String args[]){
        Aritmetica arit1 = new Aritmetica();
        arit1.a=2;
        arit1.b=5;
        
        arit1.sumar();
        
        var resultado = arit1.sumarConRetorno();
        
        System.out.println("Este es el valor del resultado con retorno " 
        + resultado);
        
        resultado = arit1.sumarConArgumentos(8,6);
        
        System.out.println("resultadoConArgumento " + resultado);
        
    }
}
