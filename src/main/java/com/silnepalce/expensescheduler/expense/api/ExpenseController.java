package com.silnepalce.expensescheduler.expense.api;

import com.silnepalce.expensescheduler.expense.api.dto.in.ExpenseDTO;
import com.silnepalce.expensescheduler.expense.api.dto.out.ExpenseIdDTO;
import com.silnepalce.expensescheduler.expense.model.Expense;
import com.silnepalce.expensescheduler.expense.service.ExpenseService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path = ExpenseController.EXPENSE_URL)
public class ExpenseController {

    public static final String EXPENSE_URL = "/expenses";

    private final ExpenseService expenseService;

    public ExpenseController(ExpenseService expenseService) {
        this.expenseService = expenseService;
    }

    @GetMapping("/{id}")
    public ExpenseIdDTO find(@PathVariable Long id) {
        ExpenseIdDTO result = expenseService.findById(id);
        return result;
    }

    @GetMapping
    public List<Expense> findAll() {
        return expenseService.findAll();
    }

    @PostMapping
    public ExpenseIdDTO save(@RequestBody ExpenseDTO expenseDTO) {
        ExpenseIdDTO result = expenseService.save(expenseDTO);
        return result;
    }

    @DeleteMapping("/{id}")
    public ExpenseIdDTO delete(@PathVariable Long id) {
        ExpenseIdDTO result = expenseService.delete(id);
        return result;
    }

    @PutMapping
    public String update() {
        return "OK";
    }
}
