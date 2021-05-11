package com.myweb.service;

import com.myweb.mapper.UserAccountMapper;
import com.myweb.pojo.UserAccount;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserAccountServiceImpl implements UserAccountService{
    @Autowired
    private UserAccountMapper userAccountMapper;

    @Override
    public List<UserAccount> login(String username) {
        return userAccountMapper.login(username);
    }
}
