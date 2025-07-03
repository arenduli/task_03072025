package hr.java.spring.boot.task.repository;

import hr.java.spring.boot.task.domain.Hardware;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface HardwareRepository extends JpaRepository<Hardware, Long> {

    Optional<Hardware> findByCode(String code);
}
