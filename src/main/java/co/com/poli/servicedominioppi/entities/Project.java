package co.com.poli.servicedominioppi.entities;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project extends EntityBase{

  @Column(name = "project_name")
  private String projectName;
  @Column(name = "project_identifier")
  private String projectIdentifier;
  @Column(name = "description")
  private String description;
  @Column(name = "start_date")
  private Date startDate;
  @Column(name = "end_date")
  private Date endDate;
  @OneToOne
  @JoinColumn(name = "backlog_id")
  private Backlog backlog;

  @Override
  public boolean equals(Object o) {
    return super.equals(o);
  }

  @Override
  public int hashCode() {
    return super.hashCode();
  }
}
