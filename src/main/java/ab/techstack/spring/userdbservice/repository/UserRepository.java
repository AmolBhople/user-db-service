package ab.techstack.spring.userdbservice.repository;

import ab.techstack.spring.userdbservice.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
}
