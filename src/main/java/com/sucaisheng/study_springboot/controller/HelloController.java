package com.sucaisheng.study_springboot.controller;

import com.sucaisheng.study_springboot.pojo.Users;
import com.sucaisheng.study_springboot.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @Autowired
    IUserService iService;

    @Autowired
    JdbcTemplate jt;

    @RequestMapping("/hello")
    public String hello(){
        return "Hello Word!";
    }

    @GetMapping("/getUsers")
    public Users getUsersById(Integer id){
//        List<Users> usersList = jt.query("select * from t_user where id = ?", new RowMapper<Users>() {
//            @Override
//            public Users mapRow(ResultSet resultSet, int i) throws SQLException {
//                Users us = new Users();
//                us.setId(resultSet.getInt("id"));
//                us.setAge(resultSet.getInt("age"));
//                us.setName(resultSet.getString("name"));
//                us.setEmail(resultSet.getString("email"));
//                return us;
//            }
//        }, id);
//        return usersList.get(0);
        return iService.getUsersById(id);
    }
}
