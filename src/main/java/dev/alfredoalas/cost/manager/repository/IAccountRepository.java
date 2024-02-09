package dev.alfredoalas.cost.manager.repository;

import dev.alfredoalas.cost.manager.models.Account;

import java.util.List;

public interface IAccountRepository extends IGenericRepository<Account, Integer>{
    List<Account> findAccountByIsBalance (Boolean isBalance);
}
