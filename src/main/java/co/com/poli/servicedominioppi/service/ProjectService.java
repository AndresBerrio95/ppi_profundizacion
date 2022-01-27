package co.com.poli.servicedominioppi.service;

import co.com.poli.servicedominioppi.entities.Project;
import co.com.poli.servicedominioppi.entities.ProjectTask;
import java.util.List;

public interface ProjectService {

  List<Project> findAll();
  Project create(Project project);
  List<ProjectTask> findByIdeTasks(String id);
  double totaldeHoras(String id);
  double totaldeHorasEstado (String id,String estado);
  ProjectTask deleteTask(Long idtask,String id);
}
