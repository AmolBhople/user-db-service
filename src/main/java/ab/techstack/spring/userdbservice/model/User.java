package ab.techstack.spring.userdbservice.model;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
@Table(name= "USERS")
public class User {

    @Id
    @Column(name="id")
    @GeneratedValue
    private Integer id;
    private String name;
    private String dept;
    private Integer salary;

    @Column(name = "created_time")
    private Date time;

}