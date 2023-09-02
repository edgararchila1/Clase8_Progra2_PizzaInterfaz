import pkgPizza.pkgBase.Interfaces.PizzaBase;
import pkgPizza.pkgBase.Pizza;
import pkgPizza.pkgBase.Topping;
import pkgPizza.pkgBase.pkgEspecialidades.PizzaItaliana;


public class Main {
    public static void main(String[] args)
    {
        // ejercicio #1
        Pizza pizza = new Pizza("Pizza Sin precio");
        Pizza.addTopping(new Topping("Tomate.", 10));
        Pizza.addTopping(new Topping("Mozarella.", 20));
        Pizza.addTopping(new Topping("Basil.", 30));
        Pizza.addTopping(new Topping("Queso Extra.",40));

        Pizza.prepare();
        System.out.println(pizza.getPizzaPrice());
    }
}