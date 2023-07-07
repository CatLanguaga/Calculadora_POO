
package pruebas.calculadora;


public class Resultado {
    
    private int Num1;
    private int Num2;
    private int Res;
    
    public Resultado(int Num1, int Num2){
        
        this.Num1 = Num1;
        this.Num2 = Num2;
        
    }
    
    public int suma(){
        
        Res = this.Num1 + this.Num2;
        
        return Res;
    }
    
    public int resta(){
        
        Res = this.Num1 - this.Num2;
        
        return Res;
    }
        
    public int Mult(){
        
        Res = this.Num1 * this.Num2;
        
        return Res;
    }
            
    public int div(){
        
        Res = this.Num1 / this.Num2;
        
        return Res;
    }

    public int getRes() {
        return Res;
    }
    
    
    
    
    
}
