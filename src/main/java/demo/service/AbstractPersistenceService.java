package demo.service;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractPersistenceService<T> {

    public List<T> search(T entity) {
        ArrayList<T> arrayList = new ArrayList<>();
        arrayList.add(entity);
        arrayList.add(entity);
        return arrayList;
    }

    public T create(T entity) {
        return entity;
    }
    
    public void update(T entity) {
    }

}