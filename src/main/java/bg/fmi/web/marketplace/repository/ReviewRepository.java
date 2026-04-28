package bg.fmi.web.marketplace.repository;

import bg.fmi.web.marketplace.model.review.Review;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReviewRepository extends JpaRepository<Review, Long> {
}
