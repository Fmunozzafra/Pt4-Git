/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package menú;
import java.util.Scanner;

/**
 *
 * @author alumne
 */
public class Menú {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        
        int opcio;
        long primer, num, sum=0; 
        int cont=1;
        char c1, c2, tmp; 
        int num1;
        
        Scanner ent = new Scanner(System.in);
        
        
        
        do {
            
            System.out.println("Perfavor, tria una de les següents opcions:\n 1.Executar programa exercici 28.\n 2.Executar programa exercici 29. \n 3.Sortir.");
       
            opcio=ent.nextInt();
            
            switch(opcio) {
                case 1:
                    
                    System.out.println("L’execució acabarà quant es rebigue un número igual al primer.");
                    System.out.println("Introdueix el números a sumar d'un en un.");
                    
                    primer=sum=ent.nextLong();                    
                    System.out.print(primer);
                        do{
                          System.out.println("");
                         num=ent.nextLong();
                         sum+=num;  
                         System.out.print(sum);
                         cont++;
                            }while(num!=primer);
                            System.out.println(" "+cont);
                    
                    break;
                case 2:
                    
                    System.out.println("Introdueix 2 caràcters i un número");
                    
                    c1=ent.skip("[\r\n]*").nextLine().charAt(0);
                    c2=ent.skip("[\r\n]*").nextLine().charAt(0);
                    num1=ent.nextInt();
        
                    if(c1>c2){
                        tmp=c1;
                        c1=c2;
                        c2=tmp;
                    }
        
                       while(c1<=c2){
                        System.out.println(c1);
                        c1+=num1;
                    }
                    
                    break;
                case 3:
                    System.out.println("Gràcies per utilitzar aquest programa.");
                    
                    break;
                default:
                    System.out.println("Operació incorrecta");
                    
                    break;
            
            
            
            
            
            
            }
                
          
            
            
            
        } while (opcio!=3);
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
        
    }
    
}
