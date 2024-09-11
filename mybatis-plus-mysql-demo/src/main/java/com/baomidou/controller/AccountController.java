package com.baomidou.controller;

import com.baomidou.entity.Account;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 *  前端控制器
 * </p>
 *
 * @author qiao
 * @since 2024-09-11 22:45:15
 */
@RestController
@RequestMapping("/account")
public class AccountController {

    @GetMapping("/add")
    public String add() {
        new Account().setName("qiao").setBalance(10000000).insert();
        return "success";
    }

}
