package adapter;

public class AdapterJavaToDatabase extends JavaApplication implements Database {
    @Override
    public void insert() {
        saveObject();

    }

    @Override
    public void update() {
        updateObject();

    }

    @Override
    public void select() {
        saveObject();

    }

    @Override
    public void remove() {
        deleteObject();

    }
}
