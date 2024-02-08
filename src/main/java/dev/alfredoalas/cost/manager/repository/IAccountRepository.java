package dev.alfredoalas.cost.manager.repository;

import dev.alfredoalas.cost.manager.models.Account;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IAccountRepository extends IGenericRepository<Account, Integer>{
    Page<Account> findAccountByIsBalance (Pageable pageable, Boolean isBalance);
}
