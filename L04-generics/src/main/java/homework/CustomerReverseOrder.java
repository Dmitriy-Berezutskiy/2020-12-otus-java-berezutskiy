package homework;
import java.util.ArrayDeque;

public class CustomerReverseOrder {

    //todo: 2. надо реализовать методы этого класса
    //надо подобрать подходящую структуру данных, тогда решение будет в "две строчки"

    private final ArrayDeque<Customer> queue = new ArrayDeque<>();

    public void add(Customer customer) {
        queue.add(customer);
    }

    public Customer take() {
        return queue.pollLast();
    }
}
