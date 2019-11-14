

package operaciones; 

public class main {
    
    
    public static void main(string[] args) {
        Scanner entrada=new Scanner(system.in);
        double Numero1=0;
        double Numero2=0;
        double Suma=0;
        double Resta=0;
        double Division=0;
        double Multiplicacion=0;
        
                
            
        System.out.println("Escriba el primer numero");
        Numero1=entrada.nextDouble ();
        System.out.println("Escriba el segundo numero");
        Numero2=entrada.nextDouble ();
        
        Suma=Numero1+Numero2;
        Resta=Numero1-Numero2;
        Division=Numero1/Numero2;
        Multiplicacion=Numero1*Numero2;
        
        System.out.prtln("La suma es: "+Suma);
        System.out.prtln("La resta es: "+Resta);
        System.out.prtln("La division es: "+Division);
        System.out.prtln("La multiplicacion es: "+Multiplicacion);
        
        
        
        
        
                
        
       
        
        
    }
}