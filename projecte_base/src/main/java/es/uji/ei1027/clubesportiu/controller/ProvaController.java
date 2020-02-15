package es.uji.ei1027.clubesportiu.controller;

import es.uji.ei1027.clubesportiu.categoria.Categoria;
import es.uji.ei1027.clubesportiu.dao.NadadorDao;
import es.uji.ei1027.clubesportiu.dao.ProvaDao;
import es.uji.ei1027.clubesportiu.model.Nadador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/prova")
public class ProvaController {

    ProvaDao provaDao;

    @Autowired
    public void setProvaDao(ProvaDao provaDao) {
        this.provaDao=provaDao;
    }

    @RequestMapping("/list")
    public String listProva(Model model) {
        model.addAttribute("prova", provaDao.getProves());
        return "prova/list";
    }



}