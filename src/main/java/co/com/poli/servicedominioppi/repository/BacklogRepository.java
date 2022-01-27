package co.com.poli.servicedominioppi.repository;

import co.com.poli.servicedominioppi.entities.Backlog;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BacklogRepository extends JpaRepository<Backlog, Long> {

}
