/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Nilder
 */
public class lenguaje {
    

    
    public static void main(String[]args){
     String mensaje ="hola jutiapa ";
     char Ascii[]= mensaje.toCharArray();
     for (int i=0; i<Ascii.length; i ++){
     Ascii [i]=(char)((Ascii[i])+(char)9);
     }
     
    String encriptado =String.valueOf(Ascii);
    System.out.print(encriptado);
    
      char Asciis[]= mensaje.toCharArray();
     for (int i=0; i<Ascii.length; i ++){
     Ascii [i]=(char)((Ascii[i])-(char)9);
     }
     
//    String encriptados =String.valueOf(Ascii);
//    System.out.print(encriptados);
    
    
    
    }
    
    
}
