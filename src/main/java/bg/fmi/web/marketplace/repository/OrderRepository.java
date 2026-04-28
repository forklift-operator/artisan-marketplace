package bg.fmi.web.marketplace.repository;

import bg.fmi.web.marketplace.model.order.Order;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<Order, Long> {
}
