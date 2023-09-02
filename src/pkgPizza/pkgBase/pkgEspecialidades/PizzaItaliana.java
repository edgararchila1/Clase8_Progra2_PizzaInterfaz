package pkgPizza.pkgBase.pkgEspecialidades;

import pkgPizza.pkgBase.Pizza;
import pkgPizza.pkgBase.Topping;

import java.util.List;

public class PizzaItaliana extends Pizza {
    private String salsa;

    public PizzaItaliana(String name, String salsa, Topping... toppings){
        super(name, toppings);
        this.salsa = salsa;
    }


    public String getSalsa() {
        return salsa;
    }

    public void setSalsa(String salsa) {
        this.salsa = salsa;
    }
}
