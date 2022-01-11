package co.com.poli.servicedominioppi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.List;
import javax.persistence.CascadeType;
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
  @OneToOne(fetch = FetchType.EAGER)
  @JoinColumn(name = "project_id")
  private Project project;
  @JsonManagedReference
  @OneToMany(mappedBy = "project_task", cascade = CascadeType.PERSIST)
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
