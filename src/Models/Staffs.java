package Models;

public class Staffs {
    private String firstName;
    private String lastName;
    private String dateOfBirth;
    private long id;
    private String nonAdmin;
    private Gender gender;
    private Address address;
    private static long count = 0;

    public Staffs(String firstName, String lastName, String dateOfBirth,
                      Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.id = ++count;
    }
    public Staffs(String firstName, String lastName, String dateOfBirth, String nonAdmin,
                      Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nonAdmin = nonAdmin;
        this.gender = gender;
        this.id = ++count;
    }

    public Staffs(String firstName, String lastName, String dateOfBirth, Gender gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.address = address;
        this.id = ++count;
    }

    public Staffs(String firstName, String lastName, String dateOfBirth, String nonAdmin,
                      Gender gender, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.dateOfBirth = dateOfBirth;
        this.nonAdmin = nonAdmin;
        this.gender = gender;
        this.address = address;
        this.id = ++count;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNonAdmin() {
        return nonAdmin;
    }

    public void setNonAdmin(String nonAdmin) {
        this.nonAdmin = nonAdmin;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
