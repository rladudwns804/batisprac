package com.practice.demo.Repositories;

import com.practice.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

    public User findById(long id);
    public User findByUsername(String username);


}
