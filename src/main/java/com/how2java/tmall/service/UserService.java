package com.how2java.tmall.service;

import com.how2java.tmall.pojo.User;

import java.util.List;

public interface UserService {

    void add(User user);

    void delete(int id);

    void update(User user);

    User get(int id);

    List list();

    boolean isExitst(String name);

    User get(String name, String password);
}
