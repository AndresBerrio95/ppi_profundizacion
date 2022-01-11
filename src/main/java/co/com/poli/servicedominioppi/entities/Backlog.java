package co.com.poli.servicedominioppi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "backlogs")
public class Backlog extends EntityBase{

  @Column(name = "project_identifier")
  private String projectIdentifier;
  @JsonBackReference
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "project_id")
  private Project project;
  @OneToMany
  @JoinColumn(name = "project_task_id")
  private List<ProjectTask> projectTasks;

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
