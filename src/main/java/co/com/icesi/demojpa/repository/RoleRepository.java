package co.com.icesi.demojpa.repository;


import co.com.icesi.demojpa.model.IcesiRole;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;
import java.util.UUID;

@Repository
public interface RoleRepository extends JpaRepository<IcesiRole, UUID> {

    Optional<IcesiRole> findByName(String formString);
}
