package com.wildcodeschool.challenge.springHibernateChallenge.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.wildcodeschool.challenge.springHibernateChallenge.entities.User;

@Repository
public interface UserDao extends JpaRepository<User, Long> {
}
