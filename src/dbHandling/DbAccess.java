package dbHandling;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import institution.Academy;
import institution.DeansOffice;
import institution.Faculty;
import person.BlueCollar;
import person.Lecturer;
import person.Student;
import person.Worker;

import java.io.Console;

public class DbAccess {

    public DbAccess(){


    ObjectContainer db=Db4o.openFile("dbo4File");

    try {
            // do something with db4o

           /* dodawanie obiektow do  bazy danych*/
        /*   Student student1=new Student("Michael Schumacher");
            Lecturer lec1=new Lecturer(10000,"Arkadiusz Mik", "Profesor");

            Academy aca1=new Academy("Wojskowa Akademia Techniczna",10000,500);
            DeansOffice dea1 = new DeansOffice("Logistyka", 41,true);
            Faculty fac1 = new Faculty("Cybernetyki", 56,"Wojciech Kwiatkowski");
            db.store(student1);
            db.store(lec1);
            db.store(aca1);
            db.store(dea1);
            db.store(fac1);
        BlueCollar blue1=new BlueCollar(2000,"Marek Sawicki", "Gastronomia");
            db.store(blue1);
*/
        {
            /* wypisywanie obiektow 'Student' */
            ObjectSet result = db.queryByExample(Worker.class);
            ListResult(result);
        }

        }
    finally {
            db.close();
        }
    }

    public static void ListResult(ObjectSet result)
    {
        for (Object object : result)
        {
            System.out.println(object);
        }
    }
}
