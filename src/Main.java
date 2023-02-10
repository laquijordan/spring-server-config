import testing.Account;
import testing.Customer;
import testing.PersonalCustomer;

import javax.naming.InsufficientResourcesException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
      /*  List<Empleado> empleados = new ArrayList<>();
        empleados.add(new Empleado("empleado 1", 2000.d, 5));
        empleados.add(new Empleado("empleado 2", 1000.d, 10));
        empleados.add(new Empleado("empleado 3", 3000.d, 1));

        Predicate<Empleado> moreThan1500 = empleado -> empleado.getSueldo() > 1500.d;
        Predicate<Empleado> lessThan5Years = empleado -> empleado.getAniosDeTrabajo() < 5;
        BiPredicate<String, String> contiene = (a, b) -> b.contains(a);

        List<Integer> numbers = Arrays.asList(3, 2, 3, 1, 4, 5);
        List<Integer> squaresList = numbers.stream().map(i -> i * i).distinct().collect(Collectors.toList());
*/

        Customer customer = new PersonalCustomer(32151321L, "Jordan", new Account());
        System.out.println(customer.getId());
    }
}