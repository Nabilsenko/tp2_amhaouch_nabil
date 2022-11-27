package tp2.restapi.dao;

import org.springframework.stereotype.Repository;
import tp2.restapi.model.Equipe;

import java.util.List;
import java.util.Vector;

@Repository
public class EquipeDAO implements IEquipeDAO {
    List<Equipe> listEquipes;

    public EquipeDAO() {
        listEquipes = new Vector<Equipe>();
    }

    @Override
    public List<Equipe> findAll() {
        return listEquipes;
    }

    @Override
    public Equipe findById(String id) {
        for (Equipe p : listEquipes ) {
            if (p.getId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    @Override
    public void addEquipe(Equipe p) {
        listEquipes.add(p);
    }

    @Override
    public void updateEquipe(Equipe p, String id) {
        for (int i=0;i< listEquipes.size();i++) {
            if (listEquipes.get(i).getId().equals(id)){
                p.setId(id);
                listEquipes.set(i, p);
            }
        }
    }

    @Override
    public void deleteEquipe(String id) {
        for (int i=0;i< listEquipes.size();i++) {
            if (listEquipes.get(i).getId().equals(id)){
                listEquipes.remove(i);
            }
        }
    }
}
