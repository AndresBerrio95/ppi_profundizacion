package co.com.poli.servicedominioppi.repository;

import co.com.poli.servicedominioppi.entities.ProjectTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProjectTaskRepository extends JpaRepository<ProjectTask, Long> {

}
