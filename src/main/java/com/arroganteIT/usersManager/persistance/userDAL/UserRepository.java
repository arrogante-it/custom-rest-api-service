package com.arroganteIT.usersManager.persistance.userDAL;

import com.arroganteIT.usersManager.persistance.userModel.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface UserRepository extends JpaRepository<User, Long> {
}
