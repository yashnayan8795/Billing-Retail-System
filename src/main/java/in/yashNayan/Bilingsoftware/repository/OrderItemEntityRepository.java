package in.yashNayan.Bilingsoftware.repository;

import in.yashNayan.Bilingsoftware.entity.OrderItemEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderItemEntityRepository extends JpaRepository<OrderItemEntity, Long> {
}
