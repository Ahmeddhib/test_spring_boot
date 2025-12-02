<<<<<<< HEAD
package com.test_spring_boot.test_spring_boot.Repositories;

import com.test_spring_boot.test_spring_boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
=======
package com.test_spring_boot.test_spring_boot.Repositories;

import com.test_spring_boot.test_spring_boot.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
>>>>>>> 586d52d7054a6bcc5d89fbc67f1e533f79699f65
