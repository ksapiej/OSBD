package dbHandling;

import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import person.Student;

public class DbAccess {

    public DbAccess(){


    ObjectContainer db=Db4o.openFile("dbo4File");

    try {
            // do something with db4o
            Student student1=new Student("Michael Schumacher");
            db.store(student1);
        }
    finally {
            db.close();
        }
    }
}
