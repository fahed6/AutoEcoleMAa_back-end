package tn.AutoEcoleMAa.jwt.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import tn.AutoEcoleMAa.jwt.entity.Role;

@Repository
public interface RoleDao extends CrudRepository<Role, String> {

}
