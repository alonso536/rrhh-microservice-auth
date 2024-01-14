package cl.acl.jdiazl.auth.repositories;

import cl.acl.jdiazl.auth.models.dto.UserDTO;
import cl.acl.jdiazl.auth.models.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity, Long> {

    @Query("SELECT u FROM UserEntity u WHERE u.active = true")
    List<UserEntity> findAllUsers();
}
