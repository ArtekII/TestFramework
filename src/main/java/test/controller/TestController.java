package test.controller;

import java.util.ArrayList;
import java.util.List;

import autumn.annotation.Controller;
import autumn.annotation.UrlMapping;
import autumn.mapping.ModelAndView;
import autumn.annotation.WebApiRest;

@Controller(path="/dev")
public class TestController {

    @UrlMapping(value = "test", method = "GET")
    @WebApiRest
    public List<String> test() {
        List<String> list = new ArrayList<>();
        list.add("chaine1");
        list.add("chaine2");
        list.add("chaine3");
        list.add("chaine4");
        list.add("chaine5");
        list.add("chaine6");
        list.add("chaine7");
        list.add("chaine8");

        return list;
    }

    @UrlMapping(value = "ok", method = "GET")
    @WebApiRest
    public String ok() {
        return "{\"nom\":\"utilisateur\",\"estInscrit\":true,\"role\":1}";
    }

    @UrlMapping(value = "user", method = "GET")
    public ModelAndView form() {
        ModelAndView modelAndView = new ModelAndView("index");
        
        return modelAndView;
    }

    @UrlMapping(value = "user", method = "POST")
    public String user(String name, int age, double montant) {
        return "nom : " + name + ", age : " + age + ", montant : " + montant;
    }
}