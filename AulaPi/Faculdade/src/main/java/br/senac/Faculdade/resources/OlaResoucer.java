package br.senac.Faculdade.resources;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class OlaResoucer {
    @RequestMapping("/") 
    @ResponseBody 
    public String Ola(){
        return "Aplicacao Funcionando!!!";
    }
}
