package test.controller;

import pumpkin.annotation.Controller;
import pumpkin.annotation.UrlMapping;

@Controller(path="/dev")
public class EmpController {

    @UrlMapping(value="test", method="GET")
    public void test1() {
        System.out.println("Test Ok");
    }

    @UrlMapping(value="test", method="POST")
    public void test2() {

    }

    @UrlMapping(value = "error", method = "GET")
    public void error() {
        throw new RuntimeException("methode executee");
    }

    @UrlMapping(value = "print", method = "GET")
    public void print() {
        System.out.println("methode executee"); //message sera visible dans la console/log Tomcat
    }

    @UrlMapping(value = "hello", method = "GET")
    public String hello() {
        return "Hello World";
    }
}