package bg.fmi.web.marketplace.repository;

import bg.fmi.web.marketplace.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
