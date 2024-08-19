package server.heyblossom.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import server.heyblossom.entity.User;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
