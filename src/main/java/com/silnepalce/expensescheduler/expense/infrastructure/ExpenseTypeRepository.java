package com.silnepalce.expensescheduler.expense.infrastructure;

import com.silnepalce.expensescheduler.expense.model.Expense;
import com.silnepalce.expensescheduler.expense.model.ExpenseType;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExpenseTypeRepository extends CrudRepository<ExpenseType, Long> {
}
