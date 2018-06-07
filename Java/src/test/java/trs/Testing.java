package trs;

import example.data.User;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import trs.controller.Controller;
import trs.controller.UserController;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Testing {
    @Autowired
    Controller controller;


    @Test
    public void contextLoads() throws Exception {
        
    }

    @Test
    public void createUser(){
        Controller c = new Controller();
        UserController uc = new UserController(c);
        Assert.assertEquals(true, uc.createUser("TestUser","TestPw"));
    }

    @Test
    public void createSameUserTwice(){
        Controller c = new Controller();
        UserController uc = new UserController(c);
        uc.createUser("TestUserTwice","TestPw");
        Assert.assertEquals(false, uc.createUser("TestUserTwice","TestPw"));
    }

    @Test
    public void createUserAndSearch(){
        Controller c = new Controller();
        UserController uc = new UserController(c);
        uc.createUser("TestFindUser","TestPw");
        Assert.assertEquals("TestFindUser", uc.searchUser("TestFindUser"));
    }

    @Test
    public void loginUser(){
        Controller c = new Controller();
        UserController uc = new UserController(c);
        uc.login("TestUser","TestPw");
        User testUser = new User("TestUser","TestPw");
        Assert.assertEquals(testUser, c.getCurrentUser());
    }

    @Test
    public void loginNotExistingUser(){
        Controller c = new Controller();
        UserController uc = new UserController(c);
        uc.login("Abc","TestPw");
        Assert.assertNull(c.getCurrentUser());
    }




}