package service;

import dto.*;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import java.util.*;
import model.*;
import repository.HistoryRepository;
import repository.WorkerRepository;

public class WorkerService {

    private WorkerRepository workerRepository = new WorkerRepository();
    private HistoryRepository historyRepository = new HistoryRepository();

    // insert worker
    public boolean insertWorker(RequestDTO dto) {
        if (!isIdExist(dto.getId())) {
            workerRepository.insert(dto);
            return true;
        }
        return false;
    }

    // increase salary
    public boolean increaseSalary(RequestDTO dto) {
        return changeAmount(dto.getId(), dto.getAmount(), "UP");
    }

    // decrease salary
    public boolean decreaseSalary(RequestDTO dto) {
        return changeAmount(dto.getId(), dto.getAmount(), "DOWN");
    }

    // show 
    public List<ResponseDTO> getInfo() {
        List<History> list = historyRepository.getAll();
        List<ResponseDTO> listDTO = new ArrayList<>();
        for (History h : list) {
            listDTO.add(new ResponseDTO(h.getId(), h.getName(), h.getAge(), h.getSalary(), h.getStatus(), h.getDate()));
        }
        return listDTO;
    }

    // check code is exist
    private boolean isIdExist(String id) {
        Map<String, Worker> map = workerRepository.getAll();
        return map.containsKey(id);
    }

    // find worker by id
    private Worker findWorkerById(String id) {
        Map<String, Worker> map = workerRepository.getAll();
        if (map.containsKey(id)) {
            return map.get(id);
        }
        return null;
    }

    // change Amount
    private boolean changeAmount(String id, double amount, String status) {
        Worker w = findWorkerById(id);

        if (w == null) {
            return false;
        }
        double salary;
        //check if status is up, inscrease
        if (status.equals("UP")) {
            salary = w.getSalary() + amount;
        } else {
            // check if amount greater than salary, return false
            if (amount > w.getSalary()) {
                return false;
            } else {
                salary = w.getSalary() - amount;
            }
        }

        // Update worker salary
        RequestDTO dto = new RequestDTO();
        dto.setId(id);
        dto.setSalary(salary);
        // check update is success
        boolean updated = workerRepository.update(dto);
        if (!updated) {
            return false;
        }

        // Get current date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formattedDate = LocalDate.now().format(formatter);

        // Create history from Worker (not DTO)
        History history = new History(
                w.getId(),
                w.getName(),
                w.getAge(),
                salary,
                w.getWorkLocation(),
                status,
                formattedDate
        );

        return historyRepository.insert(history);
    }
}
