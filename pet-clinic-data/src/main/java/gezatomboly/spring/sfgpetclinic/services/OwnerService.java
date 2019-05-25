package gezatomboly.spring.sfgpetclinic.services;

import gezatomboly.spring.sfgpetclinic.model.Owner;

public interface OwnerService extends CRUDService<Owner, Long> {

    Owner findByLastName(String lastName);
}
