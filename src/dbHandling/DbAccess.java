package dbHandling;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import person.Student;

import java.io.Console;

public class DbAccess {

    public DbAccess(){


    ObjectContainer db=Db4o.openFile("dbo4File");

    try {
            // do something with db4o
           /*
            dodawanie obiektow do  bazy danych
            Student student1=new Student("Michael Schumacher");
            db.store(student1);
*/
        {
            /* wypisywanie obiektow 'Student' */
            ObjectSet result = db.queryByExample(Student.class);
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
