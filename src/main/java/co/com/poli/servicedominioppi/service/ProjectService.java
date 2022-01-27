package co.com.poli.servicedominioppi.service;

import co.com.poli.servicedominioppi.entities.Project;
import co.com.poli.servicedominioppi.entities.ProjectTask;
import java.util.List;

public interface ProjectService {

  List<Project> findAll();
  Project create(Project project);
  List<ProjectTask> findByIdeTasks(Long id);
  double totaldeHoras(Long id);
  double totaldeHorasEstado (Long id,String estado);
  double totaldeHorasSinEstadoDelete (Long id);
  ProjectTask deleteTask(Long idtask,Long id);
}
