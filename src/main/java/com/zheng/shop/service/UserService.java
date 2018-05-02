package com.zheng.shop.service;

import com.zheng.shop.dao.TbUserMapper;
import com.zheng.shop.model.TbUser;
import com.zheng.shop.model.TbUserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private TbUserMapper userMapper;

    public List<TbUser> list(){
        TbUserExample example = new TbUserExample();
        return userMapper.selectByExample(example);
    }
}
