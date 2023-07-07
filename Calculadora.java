package pruebas.calculadora;

import java.util.Scanner;


public class Calculadora {

    public static void main(String[] args) {
        
        Scanner Patata = new Scanner (System.in);
        
        System.out.println("Ingrese los numeros que quiere operacionar:");
        
        Resultado res = new Resultado(Patata.nextInt(), Patata.nextInt());
        
        System.out.println("escoja una opcion: 1-Suma 2-Resta 3-Multiplicacion 4-Division");
        
        int i = 0;
        
        do{
        
            i = Patata.nextInt();
            
            if(i > 4){
                System.out.println("Ingrese una opcion valida");
            }
        }while(i < 0 || i > 5 );
        
        
        
        
        switch (i) {
           
                case 1:

                    res.suma();
                    break;
                case 2:

                    res.resta();
                    break;
                case 3:

                    res.Mult();
                    break;

                case 4:

                    res.div();
                    break;
    
        }
        
        System.out.println("Su resultado es: " + res.getRes());
        
    }
}
