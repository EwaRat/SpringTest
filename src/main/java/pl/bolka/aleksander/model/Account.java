package pl.bolka.aleksander.model;

import java.math.BigDecimal;
import java.util.Date;
import javax.persistence.*;

@Entity
public class Account {

  @Id
  @GeneratedValue
  private Long id;

  private BigDecimal amount;

  @OneToOne
  private User user;

  private BigDecimal percent;

  private Date creationTime;

  public BigDecimal getAmount() {
    return amount;
  }

  public void setAmount(BigDecimal amount) {
    this.amount = amount;
  }

  public User getUser() {
    return user;
  }

  public void setUser(User user) {
    this.user = user;
  }

  public BigDecimal getPercent() {
    return percent;
  }

  public void setPercent(BigDecimal percent) {
    this.percent = percent;
  }

  public Date getCreationTime() {
    return creationTime;
  }

  public void setCreationTime(Date creationTime) {
    this.creationTime = creationTime;
  }
}
