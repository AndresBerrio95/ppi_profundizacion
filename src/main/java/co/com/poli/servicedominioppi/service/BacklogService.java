package co.com.poli.servicedominioppi.service;

import co.com.poli.servicedominioppi.entities.Backlog;
import java.util.List;

public interface BacklogService {
  List<Backlog> findAll();
  Backlog create(Backlog backlog);
}
