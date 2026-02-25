package repository;

import dto.*;
import java.util.*;
import model.Doctor;

public class DoctorRepository {

    private List<Doctor> list = new ArrayList<>();

    // insert doctor
    public boolean insert(RequestDTO dto) {
        Doctor doctor = new Doctor(
                dto.getCode(),
                dto.getName(),
                dto.getSpecialization(),
                dto.getAvailability());

        return list.add(doctor);
    }

    // get all list
    public List<Doctor> getAll() {
        return list;
    }

    // remove 
    public boolean remove(Doctor doctor) {

        return list.remove(doctor);
    }

}
