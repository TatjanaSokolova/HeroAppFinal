public class Person {

    public String name;
    public String surname;

    //Non argument constructor

    public Person() {
    }

    // Argument constructor

    public Person(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    //Setters/Getters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    //ToString method
    @Override
    public String toString() {
        return "Person:" +
                "name=" + name + '\'' +
                ", surname+" + surname + '\'';
    }
}

