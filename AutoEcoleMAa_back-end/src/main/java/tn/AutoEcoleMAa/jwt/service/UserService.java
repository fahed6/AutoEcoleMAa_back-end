package tn.AutoEcoleMAa.jwt.service;

import tn.AutoEcoleMAa.jwt.dao.RoleDao;
import tn.AutoEcoleMAa.jwt.dao.UserDao;
import tn.AutoEcoleMAa.jwt.entity.Role;
import tn.AutoEcoleMAa.jwt.entity.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
public class UserService {

    @Autowired
	protected UserDao userDao;

    @Autowired
    private RoleDao roleDao;

    @Autowired
    private PasswordEncoder passwordEncoder;

    public void initRoleAndUser() {

        Role adminRole = new Role();
        adminRole.setRoleName("Admin");
        adminRole.setRoleDescription("Admin role");
        roleDao.save(adminRole);

        Role userRole = new Role();
        userRole.setRoleName("User");
        userRole.setRoleDescription("Default role for newly created record");
        roleDao.save(userRole);

        User adminUser = new User();
        adminUser.setUserName("admin123");
        adminUser.setUserPassword(getEncodedPassword("admin@pass"));
        adminUser.setUserFirstName("admin");
        adminUser.setUserLastName("admin");
        Set<Role> adminRoles = new HashSet<>();
        adminRoles.add(adminRole);
        adminUser.setRole(adminRoles);
        userDao.save(adminUser);

       User user = new User();
       user.setUserName("fahed123");
       user.setUserPassword(getEncodedPassword("fahed@123"));
       user.setUserFirstName("fahed");
       user.setUserLastName("mannoubi");
       Set<Role> userRoles = new HashSet<>();
       userRoles.add(userRole);
       user.setRole(userRoles);
       userDao.save(user);
    }

    public User registerNewUser(User user) {
        Role role = roleDao.findById("User").get();
        Set<Role> userRoles = new HashSet<>();
        userRoles.add(role);
        user.setRole(userRoles);
        user.setUserPassword(getEncodedPassword(user.getUserPassword()));

        return userDao.save(user);
    }

    public String getEncodedPassword(String password) {
        return passwordEncoder.encode(password);
    }
    

    public void deleteUser(String UserName) {
    	userDao.deleteById(UserName);
    }
    
}
