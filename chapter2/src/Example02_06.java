public class Example02_06 {
    long Id = 6606021621097L;
    String name = "kochakron";
    String surname = "singlee";
    int age = 24;

    public Example02_06() { // constrator method
    }

    public static void main(String[] args) {
        String info;
        Example02_06 person = new  Example02_06(); //create object
        info = person.name+" "+person.surname;
        info += " , " + person.age + "year old.";

        System.out.println("ID : " + person.Id);
        System.out.println("Data person : "+ info);
        System.out.println("========================================");
        person.name = "John";
        person.surname = "Smith";
        person.age = 29;
        info = person.name + " "+person.surname;
        info += " , "+ person.age +"year old.";
        System.out.println("ID : " + person.Id);
        System.out.println("New data person :" + info);
    }
}