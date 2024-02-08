package dev.alfredoalas.cost.manager.repository;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IGenericRepository<T, ID> extends JpaRepository<T, ID> {
}
