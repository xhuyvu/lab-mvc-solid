package repository;

import java.util.*;
import model.*;

public class HistoryRepository {

    private List<History> list = new ArrayList();

    // save history
    public boolean insert(History history) {
        return list.add(history);
    }

    //get all list
    public List<History> getAll() {
        return list;
    }
}
