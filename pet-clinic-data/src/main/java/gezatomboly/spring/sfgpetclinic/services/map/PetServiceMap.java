package gezatomboly.spring.sfgpetclinic.services.map;

import gezatomboly.spring.sfgpetclinic.model.Pet;
import gezatomboly.spring.sfgpetclinic.services.CRUDService;

import java.util.Set;

public class PetServiceMap extends AbstractMapService<Pet, Long> implements CRUDService<Pet, Long> {
    @Override
    public Set<Pet> findAll() {
        return super.findAll();
    }

    @Override
    public Pet findById(Long id) {
        return super.findById(id);
    }

    @Override
    public Pet save(Pet object) {
        return super.save(object.getId(), object);
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Pet object) {
        super.delete(object);
    }
}
