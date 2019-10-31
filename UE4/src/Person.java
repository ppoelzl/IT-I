public class Person {
    private String name;
    private Person partner;

    Person(String name, Person partner) {
        this.name = name;
        this.partner = partner;
        this.partner.partner = this;
    }

    public String getName() {
        return this.name;
    }

    public Person getPartner() {
        return this.partner;
    }
}
