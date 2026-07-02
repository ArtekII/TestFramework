package test.controller;

import pumpkin.annotation.Controller;
import pumpkin.annotation.UrlMapping;

@Controller(path="/dev")
public class EmpController {

    @UrlMapping(value="test", method="GET")
    public void test1() {

    }

    @UrlMapping(value="test", method="POST")
    public void test2() {

    }

    @UrlMapping(value="execute/error", method="GET")
    public void execute1() {
        throw new RuntimeException("methode executee");
    }

    @UrlMapping(value = "execute/print", method = "GET")
    public void execute2() {
        System.out.println("methode executee"); //message sera visible dans la console/log Tomcat
    }
}