package tp2.restapi.dao;

import tp2.restapi.model.Equipe;

import java.util.List;

public interface IEquipeDAO {
    public List<Equipe> findAll();
    public Equipe findById(String id);
    public void addEquipe(Equipe p);
    public void updateEquipe(Equipe p, String id);
    public void deleteEquipe(String id);
}
