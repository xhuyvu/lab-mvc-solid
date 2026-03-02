package repository;

import dto.RequestDTO;
import java.util.*;
import model.Worker;

public class WorkerRepository {

    private Map<String, Worker> map = new LinkedHashMap<>();

    // insert worker
    public void insert(RequestDTO dto) {
        Worker worker = new Worker(
                dto.getId(),
                dto.getName(),
                dto.getAge(),
                dto.getSalary(),
                dto.getWorkLocation());
        map.put(dto.getId(), worker);
    }

    // get all worker
    public Map<String, Worker> getAll() {
        return map;
    }

    //update 
    public boolean update(RequestDTO dto) {
        //check id is exist, update
        if (map.containsKey(dto.getId())) {
            Worker w = map.get(dto.getId());
            w.setSalary(dto.getSalary());
            return true;
        }
        return false;
    }

}
