import java.util.ArrayList;

public class District {

    private String title;
    private String city;
    private int districtId;
    ArrayList<Person> personInTheDistrict = new ArrayList<Person>();

    // Constructor with arguments


    public District(String title, String city, int districtId, ArrayList<Person> personInTheDistrict) {
        this.title = title;
        this.city = city;
        this.districtId = districtId;
        this.personInTheDistrict = personInTheDistrict;
    }

    //Constructor without arguments
    public District() {
    }

    // To String

    @Override
    public String toString() {
        return "District{" +
                "title=" + title + '\'' +
                ", city='" + city + '\'' +
                ", districtId=" + districtId +
                ", personInTheDistrict=" + personInTheDistrict +
                '}';
    }


    // Methods to add and remove person

    public boolean addNewPerson(Person person) {
        return personInTheDistrict.add(person);
    }

    public Person removePerson(int index) {
        return personInTheDistrict.remove(index);
    }


    // GETTERS AND SETTERS

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getDistrictId() {
        return districtId;
    }

    public void setDistrictId(int districtId) {
        this.districtId = districtId;
    }

    public ArrayList<Person> getPersonInTheDistrict() {
        return personInTheDistrict;
    }

    public void setPersonInTheDistrict(ArrayList<Person> personInTheDistrict) {
        this.personInTheDistrict = personInTheDistrict;
    }

}
