package cafeteria.entidades;

import java.util.Scanner;

public class AtributoCaf {
    
    Scanner leer = new Scanner (System.in);
    
    public int capacidadMaxima;
    public int cantidadActual;

    public AtributoCaf() {
    }

    public AtributoCaf(int capacidadMaxima, int cantidadActual) {
        this.capacidadMaxima = capacidadMaxima;
        this.cantidadActual = cantidadActual;
    }

    public int getCapacidadMaxima() {
        return capacidadMaxima;
    }

    public int getCantidadActual() {
        return cantidadActual;
    }

    public void setCapacidadMaxima(int capacidadMaxims) {
        this.capacidadMaxima = capacidadMaxima;
    }

    public void setCantidadActual(int cantidadActual) {
        this.cantidadActual = cantidadActual;
    }
    
    public int llenarCafetera(){
        System.out.println("Ingrese la cantidad actual de la cafetera");
        cantidadActual = leer.nextInt();            
        capacidadMaxima=cantidadActual;
        return capacidadMaxima;
    }
   
    public int servirTaza (){
        System.out.println("Ingrese el tamaño de la taza vacía");
        int taza = leer.nextInt();
        cantidadActual-=taza;
        return cantidadActual;
    }
    
    public int vaciarCafetera(){
        cantidadActual=0;
        return cantidadActual;
    }
    
    public int agregarCafe(){
        System.out.println("Ingresar una cantidad de cafe, que desee agregar a la cafetera");
        int agregar = leer.nextInt();
        cantidadActual+= agregar;
        return cantidadActual;
    }

    @Override
    public String toString() {
        return "AtributoCaf{" + "capacidadMaxima=" + capacidadMaxima + ", cantidadActual=" + cantidadActual + '}';
    }
    
}
