
package entrada.ycocatenacióndevalores;
import java.util.Scanner;
public class EntradaYCocatenacióndeValores {
    
    public static void main(String[] args) {
        //Ahora realiza un programa donde el usuario deba introducir
        //el día, el mes y el año de nacimiento (sin realizar preguntas),
        //este programa deberá imprimir en una sola línea los datos de nacimiento.
        
               
        int d, m, año;
        Scanner ent = new Scanner(System.in);
        
        System.out.println("Ingresa el día:");
        d=ent.nextInt();
        
        System.out.println("Ingresa mes: ");    
        m=ent.nextInt();
        
        System.out.println("Ingresa el año: ");
        año=ent.nextInt();
        
        System.out.printf("Naciste el día %d del %d° mes del año %d \n", d, m, año);
    }
}
