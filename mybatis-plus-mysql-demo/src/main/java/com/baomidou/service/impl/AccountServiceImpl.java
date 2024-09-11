package com.baomidou.service.impl;

import com.baomidou.entity.Account;
import com.baomidou.mapper.AccountMapper;
import com.baomidou.service.IAccountService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author qiao
 * @since 2024-09-11 22:45:15
 */
@Service
public class AccountServiceImpl extends ServiceImpl<AccountMapper, Account> implements IAccountService {

}
