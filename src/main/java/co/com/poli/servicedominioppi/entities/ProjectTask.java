package co.com.poli.servicedominioppi.entities;

import com.fasterxml.jackson.annotation.JsonBackReference;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projectTasks")
public class ProjectTask extends EntityBase{

  @Column(name = "name")
  @NotBlank(message = "Nombre no puede estar en blanco")
  private String name;

  @Column(name = "summary")
  @NotBlank(message = "Resumen no debe estar en blanco")
  private String summary;

  @Column(name = "acceptance_criteria")
  private String acceptanceCriteria;

  @Column(name = "status")
  @Enumerated(EnumType.STRING)
  private Status status;

  @Column(name = "priority")
  @Size(min = 1, max = 5, message = "Prioridad debe estar entre 1 a 5 caracteres")
  private Integer priority;

  @Column(name = "hours")
  @Size(min = 1, max = 8, message = "Horas debe estar entre el valor de 1 a 8")
  @Min(value = 0L, message = "El valor debe de ser positivo")
  private Double hours;

  @Column(name = "start_date")
  private Date startDate;

  @Column(name = "end_date")
  private Date endDate;

  @Column(name = "project_identifier", updatable = false)
  private String projectIdentifier;

  @JsonBackReference
  @ManyToOne(fetch = FetchType.EAGER  )
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
