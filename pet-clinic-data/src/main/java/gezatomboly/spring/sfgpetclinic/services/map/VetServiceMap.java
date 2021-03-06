package gezatomboly.spring.sfgpetclinic.services.map;

import gezatomboly.spring.sfgpetclinic.model.Vet;
import gezatomboly.spring.sfgpetclinic.services.CRUDService;

import java.util.Set;

public class VetServiceMap extends AbstractMapService<Vet, Long> implements CRUDService<Vet, Long> {
    @Override
    public Set<Vet> findAll() {
        return super.findAll();
    }

    @Override
    public Vet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Vet save(Vet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Vet object) {
        super.delete(object);
    }
}
