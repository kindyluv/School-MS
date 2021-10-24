package Models;

public class NonTeaching extends Staffs{


    public NonTeaching(String firstName, String lastName, String dateOfBirth, String nonAdmin, Gender gender) {
        super(firstName, lastName, dateOfBirth, nonAdmin, gender);
    }

    public NonTeaching(String firstName, String lastName, String dateOfBirth, String nonAdmin, Gender gender, Address address) {
        super(firstName, lastName, dateOfBirth, nonAdmin, gender, address);
    }
    @Override
    public String getFirstName() {
        return super.getFirstName();

    }

    @Override
    public void setFirstName(String firstName) {
        super.setFirstName(firstName);
    }

    @Override
    public String getLastName() {
        return super.getLastName();
    }

    @Override
    public void setLastName(String lastName) {
        super.setLastName(lastName);
    }

    @Override
    public String getDateOfBirth() {
        return super.getDateOfBirth();
    }

    @Override
    public void setDateOfBirth(String dateOfBirth) {
        super.setDateOfBirth(dateOfBirth);
    }

    @Override
    public long getId() {
        return super.getId();
    }

    @Override
    public void setId(long id) {
        super.setId(id);
    }

    @Override
    public Gender getGender() {
        return super.getGender();
    }

    @Override
    public void setGender(Gender gender) {
        super.setGender(gender);
    }

    @Override
    public Address getAddress() {
        return super.getAddress();
    }

    @Override
    public void setAddress(Address address) {
        super.setAddress(address);
    }

    @Override
    public String getNonAdmin() {
        return super.getNonAdmin();
    }

    @Override
    public void setNonAdmin(String nonAdmin) {
        super.setNonAdmin(nonAdmin);
    }
}
