package dev.alfredoalas.cost.manager.services;

import java.util.List;

public interface ICrudGenericService<T, ID>{

    //List all
    public List<T> getAll();

    //List active
    public List<T> findCustom(Boolean flat);

    //List by id
    public T findById(Long id);

    //Add
    public T add(T model);

    //Update
    public T update(T model, Long id);

    //Logical eliminated
    public void delete(Long id);

}
