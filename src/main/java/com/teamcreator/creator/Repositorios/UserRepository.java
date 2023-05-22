package com.teamcreator.creator.Repositorios;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import com.teamcreator.creator.Modelo.User;

public interface UserRepository extends JpaRepository<User, UUID>{
    List<User> findByuserName(String userName);
   
    Optional<User> findByUuid(UUID uuid);

    Optional<User> findById(Long id);
}
