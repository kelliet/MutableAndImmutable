package main;

import person.ImmutablePerson;
import person.MutablePerson;

import java.util.Calendar;
import java.util.Date;

/**
 * Created by kellie on 12/21/16.
 */
public class Application {

    public static void main(String[] args) {


        Calendar cal = Calendar.getInstance();
        cal.set(1985, Calendar.NOVEMBER, 10);
        Date d = cal.getTime();

        MutablePerson harry = createMutable("harry", "houdini", d);
        System.out.println(harry.getFirstName() + " DOB is " + harry.getDOB() + "\n");

        d.setMonth(Calendar.JANUARY);
        MutablePerson jill = createMutable("jill", "Barber", d);
        System.out.println(jill.getFirstName() + " DOB is " + jill.getDOB() + "\n");

        System.out.println(harry.getFirstName() + " DOB is " + harry.getDOB() + "\n");

        ImmutablePerson john = new ImmutablePerson("john", "smith", d);

        System.out.println(john.getFirstName() + " DOB is " + john.getDOB() + "\n");
        d.setMonth(Calendar.AUGUST);
        System.out.println(john.getFirstName() + " DOB is " + john.getDOB() + "\n");

        Date newDate = john.getDOB();
        newDate.setMonth(Calendar.AUGUST);
        System.out.println(john.getFirstName() + " DOB is " + john.getDOB() + "\n");

    }

    public static MutablePerson createMutable(String firstName, String lastName, Date date) {
        MutablePerson mutablePerson = new MutablePerson();
        mutablePerson.setFirstName(firstName);
        mutablePerson.setLastName(lastName);
        mutablePerson.setDOB(date);

        return mutablePerson;
    }

    public static ImmutablePerson createImmutable(String firstName, String lastName, Date date) {
        ImmutablePerson immutablePerson = new ImmutablePerson(firstName, lastName, date);

        return immutablePerson;
    }
}
