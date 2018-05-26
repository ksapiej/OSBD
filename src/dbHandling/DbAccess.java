package dbHandling;

public class DbAccess {
    IObjectContainer db =
            Db4oEmbedded.OpenFile(Db4oEmbedded.NewConfiguration(), YapFileName);
try
    {
        // do something with db4o
    }
finally
    {
        db.Close();
    }

}
