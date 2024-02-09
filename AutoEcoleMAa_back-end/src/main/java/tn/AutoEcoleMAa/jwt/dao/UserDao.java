package tn.AutoEcoleMAa.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.AutoEcoleMAa.jwt.entity.User;

@Repository
public interface UserDao extends CrudRepository<User, String> {
}
