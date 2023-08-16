public class TestPerson {

    public static void main(String[] args){
        Person person = new Person("Juan", 1, false);
        System.out.println("persona name:" + person.getName());
        System.out.println("Carlos");
        System.out.println("person name" + person.getName());
        System.out.println("person salary" + person.getSalary());
        System.out.println("persona borrada?: " + person.isDeleted());

        person.setName("Carlos");
        person.setSalary(3000);
        person.setDeleted(true);

        System.out.println("persona name:" + person.getName());
        System.out.println("Carlos");
        System.out.println("person name" + person.getName());
        System.out.println("person salary" + person.getSalary());
        System.out.println("persona borrada?: " + person.isDeleted());



    }

}
