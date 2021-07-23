/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilder
 */
public class Encriptador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        String res= letraAscii("+++Vk*Z|yq|kwkmsyx*o}*Qoxskv++)");
        System.out.println(res);
//        
//       String res= letraAscii("!!!La Programacion es Genial!!");
//       System.out.println(res);
//        
    }
    public static String letraAscii(String Palabra){
        int codificar=0;
        String resultados="";
        int llaves=10;
    for (int x=0; x<Palabra.length(); x++)
    {
        codificar= (int)Palabra.charAt(x);
        codificar=codificar-llaves;
  
        char caracter = (char)codificar;
        resultados = resultados +caracter;   
        }
        return resultados; 
        
    }
    
}
