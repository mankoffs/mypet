package com.manko.repository;

import com.manko.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by smanko on 5/30/2017.
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
