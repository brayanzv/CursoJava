package metodos;


/**
 * Write a description of class Arit here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Aritmetica
{
    int a,b;
    
    public void sumar(){
        int resultado = this.a + this.b;
        
        System.out.println("la suma es: "+resultado);
    }
    
    public int sumarConRetorno(){
        return a+b;
    }
    
    public int sumarConArgumentos(int a, int b){
        this.a=a;
        this.b=b;
        return sumarConRetorno();
    }
}
