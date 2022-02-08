package com.silnepalce.expensescheduler.expense.service;

import com.silnepalce.expensescheduler.expense.api.dto.in.ExpenseDTO;
import com.silnepalce.expensescheduler.expense.api.dto.out.ExpenseIdDTO;
import com.silnepalce.expensescheduler.expense.infrastructure.ExpenseRepository;
import com.silnepalce.expensescheduler.expense.infrastructure.ExpenseTypeRepository;
import com.silnepalce.expensescheduler.expense.model.Expense;
import com.silnepalce.expensescheduler.expense.model.ExpenseType;
import com.silnepalce.expensescheduler.expense.service.exception.ExpenseResourceNotFoundException;
import com.silnepalce.expensescheduler.expense.service.exception.ExpenseTypeResourceNotFoundException;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Stream;

@Service
public class ExpenseService {

    private final ExpenseRepository expenseRepository;
    private final ExpenseTypeRepository expenseTypeRepository;

    public ExpenseService(ExpenseRepository expenseRepository, ExpenseTypeRepository expenseTypeRepository) {
        this.expenseRepository = expenseRepository;
        this.expenseTypeRepository = expenseTypeRepository;
    }


    public ExpenseIdDTO findById(Long id){
        Expense expense = expenseRepository.findById(id).orElseThrow(() -> new ExpenseResourceNotFoundException(String.format("Expense Id: %s not found", id)));
        return ExpenseIdDTO.from(expense.getId());
    }

    public List<Expense> findAll(){
        return expenseRepository.findAll();
    }

    public ExpenseIdDTO save(ExpenseDTO expenseDTO){

        ExpenseType expenseType = expenseTypeRepository.findById(expenseDTO.getType()).orElseThrow(() -> new ExpenseTypeResourceNotFoundException(String.format("Expense Type Id: %s not found", expenseDTO.getType())));

        Expense expense = new Expense();
        expense.setCost(expenseDTO.getAmount());
        expense.setDateTime(expenseDTO.getDateTime());
        expense.setDescription(expenseDTO.getDescription());
        expense.setExpenseType(expenseType);

        Expense savedExpense = expenseRepository.save(expense);
        return ExpenseIdDTO.from(savedExpense.getId());
    }

    public ExpenseIdDTO delete(Long id){
        Expense expense = expenseRepository.findById(id).orElseThrow(() -> new ExpenseResourceNotFoundException(String.format("Expense Id: %s not found", id)));
        expenseRepository.delete(expense);
        return ExpenseIdDTO.from(expense.getId());
    }
}
