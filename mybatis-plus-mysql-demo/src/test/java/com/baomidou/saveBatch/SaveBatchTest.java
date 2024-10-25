package com.baomidou.saveBatch;

import com.baomidou.SpringBaseTest;
import com.baomidou.entity.Account;
import com.baomidou.service.IAccountService;
import jakarta.annotation.Resource;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

public class SaveBatchTest extends SpringBaseTest {

    @Resource
    private IAccountService accountService;

    @Test
    public void test() {
        List<Account> list = Arrays.asList(
                new Account().setName("qiao").setBalance(10000000),
                new Account().setName("qiao2").setBalance(20000000),
                new Account().setName("qiao3").setBalance(30000000),
                new Account().setName("qiao4").setBalance(40000000),
                new Account().setName("qiao5").setBalance(50000000),
                new Account().setName("qiao6").setBalance(60000000),
                new Account().setName("qiao7").setBalance(70000000),
                new Account().setName("qiao8").setBalance(80000000),
                new Account().setName("qiao9").setBalance(90000000),
                new Account().setName("qiao10").setBalance(100000000)
        );
        accountService.saveBatch(list);
    }
}
