package db;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

/**
 * Created by nowor_000 on 24/02/2016.
 */
public abstract class DataBaseManager {

    private DbHelper helper;
    private SQLiteDatabase db;


    public DataBaseManager(Context ctx) {
        helper= new DbHelper(ctx);
        db=helper.getWritableDatabase();

    }


    public void cerrar(){
        db.close();
    }


    abstract void insertar_4parametros(String id, String nombre, String descripcion, String precio);
    abstract void actualizar_4parametros(String id, String nombre, String descripcion, String precio);


    abstract public void eliminar(String id);
    abstract public void eliminarTodo();
    abstract public Cursor cargarCursor();
    abstract Boolean compruebaRegistro(String id);








    /**
     * GET Y SET
     * @return
     */
    public DbHelper getHelper() {
        return helper;
    }

    public void setHelper(DbHelper helper) {
        this.helper = helper;
    }

    public SQLiteDatabase getDb() {
        return db;
    }

    public void setDb(SQLiteDatabase db) {
        this.db = db;
    }
}
