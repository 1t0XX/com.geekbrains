package lesson1.task1;

public class Main {

    public static void main(String[] args) {
        Person person = new Person.Builder()
                .withLastName("Ivanov")
                .withAge(18)
                .withFirstName("Ivan")
                .build();

    }
}
