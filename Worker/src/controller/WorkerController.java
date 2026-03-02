package controller;

import service.WorkerService;
import view.WorkerView;
import dto.*;
import java.util.List;

public class WorkerController {

    private WorkerService service = new WorkerService();
    private WorkerView view = new WorkerView();

    public RequestDTO requestDTO;

    public void setRequestDTO(RequestDTO requestDTO) {
        this.requestDTO = requestDTO;
    }

    // add worker;
    public void addWorker() {
        if (service.insertWorker(requestDTO)) {
            view.setMessage(constant.Message.MSG_ADD_SUSSCESS);
        } else {
            view.setMessage(constant.Message.MSG_WORKER_EXIST);

        }
        view.displayMessage();
    }

    public void increaseSalary() {
        if (service.increaseSalary(requestDTO)) {
            view.setMessage(constant.Message.MSG_INCREASE_SUSSCESS);
        } else {
            view.setMessage(constant.Message.MSG_NOT_EXIST);
        }
        view.displayMessage();
    }

    public void decreaseSalary() {
        if (service.decreaseSalary(requestDTO)) {
            view.setMessage(constant.Message.MSG_DECREASE_SUSSCESS);
        } else {
            view.setMessage(constant.Message.MSG_NOT_EXIST);
        }
        view.displayMessage();
    }

    public void displayInformation() {
        List<ResponseDTO> list = service.getInfo();
        view.setList(list);
        view.displayInfo();
    }
    //
}
