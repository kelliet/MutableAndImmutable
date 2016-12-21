package person;

import java.util.Date;


public class ImmutablePerson {

    private final String firstName;
    private final String lastName;
    private final Date DOB;

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public Date getDOB() {
        return DOB;
       // return new Date(DOB.getTime());
    }


    public ImmutablePerson(String firstName, String lastName, Date DOB) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.DOB = new Date( DOB.getTime() );
    }

}
