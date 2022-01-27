package co.com.poli.servicedominioppi.controller;

import co.com.poli.servicedominioppi.entities.Project;
import co.com.poli.servicedominioppi.entities.ProjectTask;
import co.com.poli.servicedominioppi.service.ProjectService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/project")
public class ProjectController {
  @Autowired
  private ProjectService projectService;

  @GetMapping
  public List<Project> findAll(){
    return projectService.findAll();
  }

  @GetMapping("/{id}")
  public List<ProjectTask> findByIdeTasks(@PathVariable String id){
    return projectService.findByIdeTasks(id);
  }

  @GetMapping("/hours/{id}")
  public double totaldeHoras(@PathVariable String id){
    return projectService.totaldeHoras(id);
  }

  @GetMapping("/hours/{id}/{status}")
  public double totaldeHorasEstado(@PathVariable String id,@PathVariable String estado){
    return projectService.totaldeHorasEstado(id,estado);
  }

  @DeleteMapping("/{idtask}/{id}")
  public ProjectTask deleteTask(@Valid @PathVariable Long idtask,@PathVariable String id){
    return projectService.deleteTask(idtask,id);
  }

  @PostMapping
  public Project create(@Valid @RequestBody Project project){
    return projectService.create(project);
  }
}
