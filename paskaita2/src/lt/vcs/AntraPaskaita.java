/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lt.vcs;

/**
 *
 * @author Vytautas
 */
public class AntraPaskaita {
    
    int betkas;
  
    public static void main(String[] args) {
        System.out.println("Antra paskaita");
        System.out.print("123");
        System.out.print("123");
        
        byte baitas = 77;
        baitas = 88; //pakeisti kintamojo reiksme uztenka parasyti jo pavadinima
       
        short trumpas = 7777;
        int intas = 777777777;
        long longas = 7777777777777777777L;//long gale reikia pazymeti L kad tai yra long tipo reiksme
        
        float floatas = 7.777f;//float zymime su f raide
        double doublas = 77777777.7777777;//talpina daugiau skaiciu po kbl
                
        char charas = 'f';//char rasosi tarp viengubu kabuciu
        boolean boolas = true; //true arba false
        
        Byte baitas2 = new Byte(baitas); 
        
        Short trumpas2 = new Short(trumpas);
        
        Integer intas2 = new Integer(777);
        
        Long longas2 = new Long(777);
        
        Float floatas2 = new Float(floatas);
        
        Double dbl = new Double(doublas);
        
        Boolean boolas2 = new Boolean(true);
        
          int betkas = 0; //objektiniam programavime turi buti nurdyta objektu reiksme
          
        System.out.println("" + betkas); //paimtas is klases
        
        
        
        
    }
    
}
