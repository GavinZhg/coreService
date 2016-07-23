package com.x.user.repository;

import com.x.user.entity.UserEntity;
import org.junit.Test;

import javax.annotation.Resource;


public class UserRepositoryTest extends BaseTest {
    @Resource
    UserRepository urp;

    @Test
    public void testAdd(){

        UserEntity user = new UserEntity();

        user.setUserName("gavinZh");
        user.setRealName("张均富");

        urp.save(user);
    }
}
