package nvc.it.springapi.model;

import java.util.Date;

import javax.persistence.Entity;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Entity
@Getter
@Setter @NoArgsConstructor

public class Event {
    private Integer amount;
    private Date createdAt;
}
