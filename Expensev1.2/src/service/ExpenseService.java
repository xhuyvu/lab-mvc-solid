package service;

import dto.RequestDTO;
import dto.*;
import java.util.ArrayList;
import java.util.List;
import model.Expense;
import repository.ExpenseRepository;

/**
 *
 * @author xhuyvu
 */
public class ExpenseService {

    private ExpenseRepository repository = new ExpenseRepository();

    // add expense
    public boolean addAnExpense(RequestDTO requestDTO) {
        return repository.insert(requestDTO);
    }

    //show all and caculate total number
    public List<ResponseDTO> showAll() {

        List<Expense> getListExpesne = repository.getAll();
        List<ResponseDTO> resDTO = new ArrayList<>();
        
        // add expense to dto 
        for (Expense ex : getListExpesne) {   
            ResponseDTO dto = new ResponseDTO(
                    ex.getId(),
                    ex.getDate(),
                    ex.getNumber(),
                    ex.getContent()               
            );
            resDTO.add(dto);  
        }
        
        return resDTO;
        
        
        
    }

    //remove expense
    public boolean removeExpense(int id) {
        List<Expense> list = repository.getAll();
        for (Expense ex : list) {
            if (id == ex.getId()) {
                return repository.remove(ex);
            }
        }
        return false;
    }

}
