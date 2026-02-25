package controller;

import dto.*;
import service.DoctorService;
import view.DoctorView;

public class DoctorController {

    private DoctorView view = new DoctorView();
    private DoctorService service = new DoctorService();
    private RequestDTO requestDTO;

    // setter requestDTO
    public void setRequestDTO(RequestDTO requestDTO) {
        this.requestDTO = requestDTO;
    }

    // fuction one : add a doctor
    public void addDoctor() {
        if (service.add(requestDTO)) {
            view.setMessage(constant.Message.MSG_ADD_SUCCESS);
            view.printMessage();
        } else {
            view.setMessage(constant.Message.MSG_EXIST);
            view.printMessage();
        }
    }

    //function two: update
    public void updateDoctor() {
        if (service.update(requestDTO)) {
            view.setMessage(constant.Message.MSG_UPDATE_SUCCESS);
            view.printMessage();
        } else {
            view.setMessage(constant.Message.MSG_NOT_EXIST);
            view.printMessage();
        }
    }

    // function three: delete doctor
    public void deleteDoctor() {
        if (service.delete(requestDTO)) {
            view.setMessage(constant.Message.MSG__DELETE_SUCCESS);
            view.printMessage();
        } else {
            view.setMessage(constant.Message.MSG_NOT_EXIST);
            view.printMessage();
        }
    }

    public void SearchDoctor() {
        ResponseDTO res = service.search(requestDTO);
        view.setResponseDTO(res);
        view.displayDoctor();
    }

}
