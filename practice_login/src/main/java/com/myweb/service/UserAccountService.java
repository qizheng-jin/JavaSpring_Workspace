package com.myweb.service;

import com.myweb.pojo.UserAccount;

import java.util.List;

public interface UserAccountService {

    List<UserAccount> login(String username);
}
