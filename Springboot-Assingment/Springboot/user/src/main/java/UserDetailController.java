package com.userdetail.controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserDetailController {
    @RequestMapping("/UserDetailApplication")
    public String detail() {

        String userDetail = " Name: Nihal Kharwar \n
                             Current_Address : Noida\n
                             Role : SDE \n
                             Company : Quantiphi \n
                             Personel_Interest : Watching TV shows and anime";

        return userDetail;
    }
}