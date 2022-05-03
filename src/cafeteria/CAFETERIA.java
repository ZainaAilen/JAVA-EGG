package cafeteria;

import cafeteria.entidades.AtributoCaf;
import java.util.Scanner;

public class CAFETERIA {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        AtributoCaf CAF = new AtributoCaf();
        
        boolean salir = false;
        
        do {
            System.out.println("A continuación se le mostrará un menú. Ingrese la opción que desea realizar");
            System.out.println("MENÚ: ");
            System.out.println("A: LLENAR LA CAFETERA");
            System.out.println("B: SERVIR TAZA");
            System.out.println("C: VACIAR CAFETERA");
            System.out.println("D: AGREGAR CAFE A LA CAFETERA");
            System.out.println("E: SALIR");
            System.out.println("Elija la opción: ");
            String opc = leer.next();
            switch (opc) {
                case "A":
                    System.out.println("A: LLENAR LA CAFETERA");
                    System.out.println(CAF.llenarCafetera());
                    break;
                case "B":
                    System.out.println("B: SERVIR TAZA");
                    System.out.println(CAF.servirTaza());
                    break;
                case "C":
                    System.out.println("C: VACIAR CAFETERA");
                    System.out.println(CAF.vaciarCafetera());
                    break;
                case "D":
                    System.out.println("D: AGREGAR CAFE A LA CAFETERA");
                    System.out.println(CAF.agregarCafe());
                    break;
                case "E":
                    System.out.println("E: SALIR");
                    System.out.println("¿ESTÁ SEGURO QUE DESEA SALIR DE LA CUENTA");
                    String car = leer.next();
                    if (car.equals("SI")) {
                        salir = true;
                    }
                    break;
                    
                default: System.out.println("LA OPCIÓN INGRESADA NO ES CORRECTA");
            }
        } while (salir==false); 
     
        
    }
    
}
//Programa Nespresso. Desarrolle una clase Cafetera con los 
//atributos capacidadMaxima (la cantidad máxima de café que puede 
//contener la cafetera) y cantidadActual (la cantidad actual de 
//café que hay en la cafetera). Implemente, al menos, los 
//siguientes métodos:
//• Constructor predeterminado o vacío
//• Constructor con la capacidad máxima y la cantidad actual
//• Métodos getters y setters.
//• Método llenarCafetera(): hace que la cantidad actual sea igual
//a la capacidad máxima.
//• Método servirTaza(int): se pide el tamaño de una taza vacía, 
//el método recibe el tamaño de la taza y simula la acción de 
//servir la taza con la capacidad indicada. Si la cantidad actual 
//de café “no alcanza” para llenar la taza, se sirve lo que quede.
//El método le informará al usuario si se llenó o no la taza, y 
//de no haberse llenado en cuanto quedó la taza.
//• Método vaciarCafetera(): pone la cantidad de café actual en cero.
//• Método agregarCafe(int): se le pide al usuario una cantidad 
//de café, el método lo recibe y se añade a la cafetera la 
//cantidad de café indicada.