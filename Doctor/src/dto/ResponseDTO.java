/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dto;

import model.Doctor;

/**
 *
 * @author xhuyvu
 */
public class ResponseDTO {

    private String body;

    public ResponseDTO(String body) {
        this.body = body;
    }

    public String getBody() {
        return body;
    }

}
