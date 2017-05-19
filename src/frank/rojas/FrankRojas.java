
package frank.rojas;

public class FrankRojas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo cruel c:  ");
        
        //Probaremos nuestra solucion
        //1.- Crear un usuario hipotetico
        
        Usuario u=new Usuario();
        //Le asignamos valores
        u.altura=1.68f;
        u.peso=73f;
        
        //GENERAMOS EL MODELO
        Imc imc=new Imc();
        
        
        System.out.println("El valor del IMC ES" + imc.calcular(u));
        
        
        
        
    }
    
}
