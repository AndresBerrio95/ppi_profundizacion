package co.com.poli.servicedominioppi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "project_tasks")
public class ProjectTask {

  @Column(name = "name")
  private String name;
  @Column(name = "summary")
  private String summary;
  @Column(name = "acceptance_criteria")
  private String acceptanceCriteria;
  @Column(name = "status")
  private String status;
  @Column(name = "priority")
  private Integer priority;
  @Column(name = "hours")
  private Double hours;
  @Column(name = "start_date")
  private Date startDate;
  @Column(name = "end_date")
  private Date endDate;
  @Column(name = "project_identifier")
  private String projectIdentifier;
  @JsonBackReference
  @ManyToOne
  @JoinColumn(name = "backlog_id")
  private Backlog backlog;

  @Override
  public int hashCode() {
    return super.hashCode();
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }
}
