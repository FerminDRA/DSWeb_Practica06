

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package org.uv.Controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
//import org.uv.Model.Message;

/**
 *
 * @author fermin
 */
@RequestMapping("/api")
@RestController
public class MessageController {
    @GetMapping("/message")
    public String getMessage(){
        //Message message=new Message(msg);
        return "Hola mundo";
    }
}



