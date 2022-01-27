package co.com.poli.servicedominioppi.service;

import co.com.poli.servicedominioppi.entities.Project;
import co.com.poli.servicedominioppi.entities.ProjectTask;
import co.com.poli.servicedominioppi.entities.Status;
import co.com.poli.servicedominioppi.excepcions.RecordNotFoundException;
import co.com.poli.servicedominioppi.repository.ProjectRepository;
import co.com.poli.servicedominioppi.repository.ProjectTaskRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ProjectServiceImp implements ProjectService{

  @Autowired
  private ProjectRepository projectRepository;
  @Autowired
  private ProjectTaskRepository projectTaskRepository;

  @Override
  public List<Project> findAll() {
    return projectRepository.findAll();
  }

  @Override
  public Project create(Project project) {
    return projectRepository.save(project);
  }

  @Override
  public List<ProjectTask> findByIdeTasks(String id) {
    List<Project> p=findAll();
    for (Project project : p) {
      if (project.getProjectIdentifier().equals(id)) {
        return project.getBacklog().getProjectTasks();
      }
    }
    throw new RecordNotFoundException();
  }

  @Override
  public double totaldeHoras(String id) {
    double horas=0;
    List<ProjectTask> p=findByIdeTasks(id);
    for (int i = 0; i < p.size(); i++) {
      if(!p.get(i).getStatus().equals("DELETED")) {
        horas += p.get(i).getHours();
      }

    }
    return horas;
  }

  @Override
  public double totaldeHorasEstado(String id, String estado) {
    double horas=0;
    List<ProjectTask> p=findByIdeTasks(id);
    for (int i = 0; i < p.size(); i++) {
      if(p.get(i).getStatus().toString().equals(estado)) {
        horas += p.get(i).getHours();
      }
    }
    return horas;
  }

  @Override
  public ProjectTask deleteTask(Long idtask, String id) {
    ProjectTaskServiceImp service = new ProjectTaskServiceImp();
    List<ProjectTask> p=findByIdeTasks(id);
    for (int i = 0; i < p.size(); i++) {
      if (p.get(i).getId()==idtask){
        p.get(i).setStatus(Status.DELETED);
        projectTaskRepository.delete(p.get(i));
        return p.get(i);
      }
    }
    throw new  RecordNotFoundException();
  }
}
