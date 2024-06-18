
import java.util.Locale;
import java.util.Scanner;

public class Contador {
    public static void main(String[] args) throws Exception {
        try{
        Scanner Scanner = new
        Scanner(System.in).useLocale(Locale.US);
    
        System.out.println("Digite um número inteiro: ");
        int parametroUm = Scanner.nextInt();
        System.out.println("Digite outro número inteiro: ");
        int parametroDois = Scanner.nextInt();
    
        for( parametroUm = parametroUm  ; parametroUm <= parametroDois; parametroUm++){
            if (parametroDois >= parametroUm) {
                System.out.println("Contagem " + parametroUm);
             }else if(parametroUm < parametroDois){
                 System.out.println("O segundo número deve ser maior que o primeiro.");
             }
       }
       Scanner.close();
       } 
       catch(Exception e){
        System.out.println("O segundo número deve ser maior que o primeiro.");
       }
    }
}