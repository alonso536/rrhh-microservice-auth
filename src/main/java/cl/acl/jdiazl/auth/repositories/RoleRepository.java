package cl.acl.jdiazl.auth.repositories;

import cl.acl.jdiazl.auth.models.entity.Role;
import org.springframework.data.repository.CrudRepository;

public interface RoleRepository extends CrudRepository<Role, Long> {
}
