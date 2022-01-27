package co.com.poli.servicedominioppi.service;

import co.com.poli.servicedominioppi.entities.Backlog;
import co.com.poli.servicedominioppi.repository.BacklogRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BacklogServiceImp implements BacklogService{

  @Autowired
  private BacklogRepository backlogRepository;

  @Override
  public List<Backlog> findAll() {
    return backlogRepository.findAll();
  }

  @Override
  public Backlog create(Backlog backlog) {
    return backlogRepository.save(backlog);
  }
}
