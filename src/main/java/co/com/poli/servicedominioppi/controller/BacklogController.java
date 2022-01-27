package co.com.poli.servicedominioppi.controller;

import co.com.poli.servicedominioppi.entities.Backlog;
import co.com.poli.servicedominioppi.service.BacklogService;
import java.util.List;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/backlog")
public class BacklogController {
  @Autowired
  private BacklogService backlogService;

  @GetMapping
  public List<Backlog> findAll(){
    return backlogService.findAll();
  }

  @PostMapping
  public Backlog create(@Valid @RequestBody Backlog backlog){
    return backlogService.create(backlog);
  }

}
