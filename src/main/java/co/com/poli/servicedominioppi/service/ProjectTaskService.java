package co.com.poli.servicedominioppi.service;


import co.com.poli.servicedominioppi.entities.ProjectTask;
import java.util.List;

public interface ProjectTaskService {

  List<ProjectTask> findAll();
  ProjectTask create(ProjectTask projectTask);

}
