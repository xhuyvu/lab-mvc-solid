package service;

import java.util.List;
import model.Doctor;
import dto.*;
import repository.DoctorRepository;

public class DoctorService {

    private DoctorRepository repository = new DoctorRepository();

    // add doctor
    public boolean add(RequestDTO dto) {
        // check if code not exist, add doctor
        if (!isDocotrExist(dto.getCode())) {
            return repository.insert(dto);
        }
        return false;
    }

    // update doctor
    public boolean update(RequestDTO dto) {
        // check code if exist
        if (isDocotrExist(dto.getCode())) {
            return repository.insert(dto);

        }
        return false;
    }

    // delete doctor
    public boolean delete(RequestDTO dto) {
        Doctor doctor = findDoctorById(dto.getRemoveId());
        // check code if exist
        if (doctor != null) {
            return repository.remove(doctor);
        }
        return false;
    }

    //Search by String 
    public ResponseDTO search(RequestDTO dto) {
        List<Doctor> list = repository.getAll();
        StringBuilder sb = new StringBuilder();

        for (Doctor doc : list) {
            if ((doc.getCode().contains(dto.getInfo()))
                    || (doc.getName().contains(dto.getInfo())
                    || doc.getSpecialization().contains(dto.getInfo()))
                    || (String.valueOf(doc.getAvailability()).contains(dto.getInfo()))) {

                sb.append(doc.toString());

            }
        }
        return new ResponseDTO(sb.toString());
    }

    // find doctor by id
    public Doctor findDoctorById(String code) {
        List<Doctor> list = repository.getAll();
        // check code of each doctor
        for (Doctor doc : list) {
            // check if id exist
            if (doc.getCode().equals(code)) {
                return doc;
            }
        }
        return null;
    }

    //check code if exsit
    private boolean isDocotrExist(String code) {
        List<Doctor> list = repository.getAll();
        // check code of each doctor
        for (Doctor doc : list) {
            // check if id exist
            if (doc.getCode().equals(code)) {
                return true;
            }
        }
        return false;
    }

}
