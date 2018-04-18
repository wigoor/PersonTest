public class TestKlass {
    public static void main(String[] args) {

        Personer person = new Personer();
        person.setPerson("Tobias", "Hjort", "920118",
                "Man", "1.82");

        System.out.println(person.getPerson().toString());

        person.setLängd("2.01");
        System.out.println(person.getLängd().toString());

        System.out.println(person.getPerson().toString());


    }
}
