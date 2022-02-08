package com.silnepalce.expensescheduler.expense.infrastructure;

import com.silnepalce.expensescheduler.expense.model.Expense;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ExpenseRepository extends CrudRepository<Expense, Long> {

    List<Expense> findAll();
}
