package co.com.poli.servicedominioppi.service;

import co.com.poli.servicedominioppi.entities.ProjectTask;
import co.com.poli.servicedominioppi.repository.ProjectTaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectTaskServiceImp implements ProjectTaskService{

  @Autowired
  private ProjectTaskRepository projectTaskRepository;


  @Override
  public List<ProjectTask> findAll() {
    return projectTaskRepository.findAll();
  }

  @Override
  public ProjectTask create(ProjectTask projectTask) {
    return projectTaskRepository.save(projectTask);
  }
}
