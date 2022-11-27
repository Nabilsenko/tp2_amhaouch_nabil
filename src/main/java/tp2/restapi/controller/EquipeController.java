package tp2.restapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import tp2.restapi.dao.IEquipeDAO;
import tp2.restapi.model.Equipe;

import java.util.List;

@RestController
public class EquipeController {

    @Autowired
    private IEquipeDAO dao;

    @GetMapping(value = "/equipes")
    public List<Equipe> getLesEquipes() {
        return dao.findAll();
    }

    @GetMapping(value = "/equipes/{id}")
    public Equipe getEquipe(@PathVariable String id) {
        return dao.findById(id);
    }

    @PostMapping(value = "/equipes")
    public void addEquipe(@RequestBody Equipe e) {
        dao.addEquipe(e);
    }
    @PutMapping (value = "/equipes/{id}")
    public void updateEquipe(@RequestBody Equipe e, @PathVariable String id) {
        dao.updateEquipe(e, id);
    }

    @DeleteMapping(value = "/equipes/{id}")
    public void deleteEquipe(@PathVariable String id) {
        dao.deleteEquipe(id);
    }

}
