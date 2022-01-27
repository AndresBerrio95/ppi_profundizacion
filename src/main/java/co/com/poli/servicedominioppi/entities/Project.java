package co.com.poli.servicedominioppi.entities;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "projects")
public class Project extends EntityBase{

  @Column(name = "project_name", unique = true)
  @NotBlank(message = "Nombre no puede estar en blanco")
  private String projectName;

  @Column(name = "project_identifier", unique = true, updatable = false)
  @NotBlank(message = "Identificador no puede estar en blanco")
  @Size(min = 5, max = 7, message = "El identificador debe estar entre 5 y 7 caracteres")
  private String projectIdentifier;

  @Column(name = "description")
  @NotBlank(message = "La descripcion no debe estar en blanco")
  private String description;

  @Column(name = "start_date")
  private Date startDate;

  @Column(name = "end_date")
  private Date endDate;

  @JsonManagedReference
  @OneToOne(mappedBy = "project", cascade = CascadeType.ALL)
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
