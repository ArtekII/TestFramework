package test.controller;

import java.util.ArrayList;
import java.util.List;

import autumn.annotation.Controller;
import autumn.annotation.UrlMapping;
import autumn.mapping.ModelAndView;

@Controller(path="/dev")
public class TestController {

    // @UrlMapping(value="test", method="GET")
    // public void test1() {
    //     System.out.println("Test GET Ok");
    // }

    // @UrlMapping(value="test", method="POST")
    // public void test2() {
    //     System.out.println("Test POST Ok");
    // }

    // @UrlMapping(value = "error", method = "GET")
    // public void error() {
    //     System.out.println("Test Error Ok"); 
    // }

    // @UrlMapping(value = "print", method = "GET")
    // public void print() {
    //     System.out.println("Test Print Ok"); 
    // }

    // @UrlMapping(value = "hello", method = "GET")
    // public String hello() {
    //     return "Hello World";
    // }

    @UrlMapping(value = "list", method = "GET")
    public ModelAndView fruit() {
        ModelAndView m = new ModelAndView();

        List<String> list = new ArrayList<>();
        list.add("pomme");
        list.add("poire");
        list.add("cerise");

        m.addAttribute("list", list);
        m.setUrl("test/list");

        return m;
    }
}