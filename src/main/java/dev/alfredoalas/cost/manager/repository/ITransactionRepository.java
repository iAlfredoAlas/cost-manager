package dev.alfredoalas.cost.manager.repository;

import dev.alfredoalas.cost.manager.models.Transaction;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.time.LocalDate;
import java.util.List;

public interface ITransactionRepository extends IGenericRepository<Transaction, Long>{
    List<Transaction> findByDateTransaction(LocalDate dateTransaction);

    @Query("SELECT t FROM Transaction t WHERE EXTRACT(YEAR FROM t.dateTransaction) = :year")
    List<Transaction> findByYear(@Param("year") int year);

    @Query("SELECT t FROM Transaction t WHERE EXTRACT(MONTH FROM t.dateTransaction) = :month AND EXTRACT(YEAR FROM t.dateTransaction) = :year")
    List<Transaction> findByMonthAndYear(@Param("month") int month, @Param("year") int year);

    @Query("SELECT t FROM Transaction t")
    List<Transaction> findAllTransactions();
}
