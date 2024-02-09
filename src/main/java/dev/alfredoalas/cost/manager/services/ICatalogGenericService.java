package dev.alfredoalas.cost.manager.services;

import java.util.List;

public interface ICatalogGenericService<T, ID> {

    //List all
    public List<T> getAll();

    //List active
    public List<T> findCustom(Boolean flat);

    //List by id
    public T findById(Long id);

}
