package pkgPizza.pkgBase;

import java.util.*;
import java.util.Collections;
public class Pizza {

    //Eliminar la propiedad price de la pizza
    //Crear un metodo que se llame getPizzaPrice
    //En este metodo haga la sumatoria de los ingredientes y nos de el precio
    private static String name;
    //private double price;
    private static List<Topping> toppings = new ArrayList<>();

    //    los tres puntos (...) en el parámetro Topping... toppings del constructor de la clase Pizza tienen
//    un significado especial en Java.
//    Estos three dots se llaman "spread operator" (operador de dispersión) y permiten pasar un
//    conjunto de argumentos variádicos a un método. En este caso, el constructor de la clase Pizza
//    espera una lista de objetos Topping, pero en lugar de especificar explícitamente la lista de
//    objetos, se utiliza el operador de dispersión para pasar todos los argumentos restantes como una
//    lista de objetos Topping.
    public Pizza(String name, Topping... toppings) {
        this.name = name;
        //this.price = price;
        for (Topping topping : toppings) {
            this.toppings.add(topping);
        }
    }

    public static void addTopping(Topping topping) {
        toppings.add(topping);
    }

    public void removeTopping(int index) {
        this.toppings.remove(index);
    }

    public List<Topping> getToppings() {

        return Collections.unmodifiableList(new ArrayList<>(toppings));
    }

    public String getName() {
        return name;
    }

//    public double getPrice() {
//        return price;
//    }
    public double getPizzaPrice(){
        double totalPrice = 0;
        for (Topping topping : toppings) {
            totalPrice += topping.getPrecio();
        }
        return totalPrice;
    }

    @Override
    public String toString() {
        return "Pizza{" + "name='" + name + '\'' + ", toppings=" + toppings + '}';
    }

    public static void prepare() {
        System.out.println("Preparing..... " + name);
        System.out.println("Adding toppings:");
        for (Topping topping : toppings) {
            System.out.println("- " + topping.getNombre());
            //put 1 second delay
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("The Pizza is ready!");
    }
}