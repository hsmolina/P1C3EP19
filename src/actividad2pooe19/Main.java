
package actividad2pooe19;

//Importamos el java.lang.Math.sqrt para calcular la raiz
import static java.lang.Math.sqrt;
//Importamos el java.util.Scanner para registrar los datos escritos
import java.util.Scanner;

public class Main {

   
    public static void main(String[] args) {
        
        //Título y datos
        System.out.println("Ejercicio propuesto #19");
        
        //Definimos la variable scanner de tipo Scanner para que registre las entradas
        Scanner scanner = new Scanner(System.in);

        //Pedimos al usuario digitar la medida de un lado del triángulo equilatero
        System.out.print("Ingrese la medida de cualquiera de los lados del triángulo equilatero: ");
        //Definimos una variable entrada de tipo String que almacenará el dato de entrada
        String entrada = scanner.nextLine();
        double lado = Double.parseDouble(entrada);        
        //Operaciones
        double perimetro = lado*3;
        double altura = (sqrt(3)*3)/2;
        double area = (altura*lado)/2;        
        
        //Enseñar al usuario los valores de perimetro, altura y area del triángulo, indicando además que se muestre solo con 2 decimales
        System.out.println("El perimetro del triángulo es: " + perimetro);
        System.out.println("La altura del triángulo es: " + altura);
        System.out.println("El área del triángulo es: " + area);
        
    }
    
}
