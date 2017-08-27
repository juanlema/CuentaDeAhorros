import java.util.*; 
/**
 * Programa para Cuenta de Ahorros
 * 
 * @author (Juan León - Leonardo Sotelo) 
 * @version (Agosto 27 de 2017)
 */
public class CuentaDeAhorros {

        private double saldo;
        private double interes_anual;
        
        public CuentaDeAhorros(double saldo, double interes_anual){
            this.saldo = saldo;
            this.interes_anual = interes_anual/100;
        }
        
        public double saldo(){
            return saldo;
        }
        
        public double interes_anual(){
            return interes_anual;
        }
        
        public double retirar(double retiro){
            if (retiro <= saldo){
                saldo -= retiro;
            }
            else{
            	System.out.println("No tiene saldo suficiente.");
            }
            return saldo;
        } 
        
        public void depositar(double deposito){
            saldo += deposito;
        }
        
        public void abonarInteres(){
            saldo += interes_anual/12*saldo;
        }
    
    public static void main(String[] args) {
        CuentaDeAhorros ahorro1 = new CuentaDeAhorros(200000,4);
        CuentaDeAhorros ahorro2 = new CuentaDeAhorros(300000,5);
        
        //System.out.println("Ahorro1 - mes 0 : " + ahorro1.saldo());
        //System.out.println("Ahorro2 - mes 0 : " + ahorro2.saldo() + "\n");

        for(int i=1; i<=12; i++){
            ahorro1.abonarInteres();
            ahorro2.abonarInteres();
            
            System.out.println("Ahorro1 - mes " + i + ": " + ahorro1.saldo());
            System.out.println("Ahorro2 - mes " + i + ": " + ahorro2.saldo() + "\n");
        }
    }
}