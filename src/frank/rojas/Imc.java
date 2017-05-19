
package frank.rojas;



public class Imc {
    
    public float calcular (Usuario u){
       //Aqui va la logica del calculo
       
       float resultado=u.peso/(u.altura*u.altura);
       return resultado;
    }
    
}
