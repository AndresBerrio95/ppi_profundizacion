package co.com.poli.servicedominioppi.controller;

import co.com.poli.servicedominioppi.entities.ProjectTask;
import co.com.poli.servicedominioppi.service.ProjectTaskService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/projecttask")
public class ProjectTaskController {

  @Autowired
  private ProjectTaskService projectTaskService;

  @GetMapping
  public List<ProjectTask> findAll() {
    return projectTaskService.findAll();
  }

  @PostMapping
  public ProjectTask create(@Valid @RequestBody ProjectTask projectTask) {
    return projectTaskService.create(projectTask);
  }
}
