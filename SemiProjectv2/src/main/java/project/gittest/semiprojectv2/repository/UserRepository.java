package project.gittest.semiprojectv2.repository;

import project.gittest.semiprojectv2.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByUserid(String userid);
    boolean existsByEmail(String email);
    User findByUserid(String userid);
}