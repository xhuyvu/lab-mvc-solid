package repository;

import dto.RequestDTO;
import java.util.ArrayList;
import java.util.List;
import model.Expense;

/**
 *
 * @author xhuyvu
 */
public class ExpenseRepository {

    private List<Expense> list = new ArrayList<>();
    private static int autoId = 1;

    // insert expense into list
    public boolean insert(RequestDTO dto) {
        Expense expense = new Expense(autoId++,
                dto.getDate(),
                dto.getNumber(),
                dto.getContent());
        return list.add(expense);
    }

    // get all list expense
    public List<Expense> getAll() {
        return list;
    }
    
    // remove expense
    public boolean remove(Expense expense) {
        return list.remove(expense);
    }

}
