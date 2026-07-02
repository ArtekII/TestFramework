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
}