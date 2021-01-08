package com.offcn.springbootdemo01.service;


import com.offcn.springbootdemo01.pojo.User;

import java.util.List;

public interface UserService {
    public void save(User user);


    public void update(User user);


    public void delete(Long id);


    public List<User> getAll();


    public User findOne(Long id);
}
