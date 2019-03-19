package com.bits.squad.edurate.repository;

import com.bits.squad.edurate.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Long> {

    User findByName(String name);
}
