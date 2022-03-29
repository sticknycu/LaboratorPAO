package com.example.eap_lab5.repository;

import com.example.eap_lab5.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

}
