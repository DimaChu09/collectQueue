import java.util.*;

public class Main {

    public static void main(String[] args) {
        Queue<Person> attraction = new LinkedList<>(generateClients());

        System.out.println(attraction + "\n");

        while (!attraction.isEmpty()) {
            attraction.peek().tickets--;
            Person p = attraction.poll();
            if (p.tickets > 0) {
                System.out.println(p.printPersonalInfo() + " прокатился на аттракционе. Билетов осталось: " + p.tickets);
                attraction.offer(p);
            } else if (p.tickets == 0) {
                System.out.println(p.printPersonalInfo() + " прокатился на аттракционе в последний раз. Билетов не осталось.");
            }
        }
    }

    static List<Person> generateClients() {
        Person person1 = new Person("Дима", "Чудов", 4);
        Person person2 = new Person("Даша", "Чудова", 2);
        Person person3 = new Person("Таня", "Чудова", 3);
        Person person4 = new Person("Саша", "Чудов", 5);
        Person person5 = new Person("Данил", "Чудов", 2);
        List<Person> list = new LinkedList<>();
        list.add(person1);
        list.add(person2);
        list.add(person3);
        list.add(person4);
        list.add(person5);
        return list;
    }
}
