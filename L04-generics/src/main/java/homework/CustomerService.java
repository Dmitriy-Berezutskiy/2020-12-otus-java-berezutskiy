package homework;


import java.util.*;

public class CustomerService {

    //todo: 3. надо реализовать методы этого класса
    //важно подобрать подходящую Map-у, посмотрите на редко используемые методы, они тут полезны

    private TreeMap<Long, Map.Entry<Customer, String>> sortedMap = new TreeMap<>();

    public Map.Entry<Customer, String> getSmallest() {
        return returnCopy(sortedMap.firstEntry().getValue());
    }

    public Map.Entry<Customer, String> getNext(Customer customer) {
        Map.Entry<Long, Map.Entry<Customer, String>> res = sortedMap.higherEntry(customer.scores);
        if (res == null){
            return null;
        } else {
            return returnCopy(res.getValue());
        }
    }

    private static Map.Entry<Customer, String> returnCopy(Map.Entry<Customer, String> entry){
        if (entry == null){
            return null;
        }
        Customer customer = new Customer(entry.getKey().id, entry.getKey().name, entry.getKey().scores);
        String data = entry.getValue();
        return new AbstractMap.SimpleEntry<>(customer, data);
    }

    public void add(Customer customer, String data) {
        sortedMap.put(customer.scores, new AbstractMap.SimpleEntry<>(customer, data));
    }
}
