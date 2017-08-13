package feedback.models;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "business")
public class Business {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "person_name")
    private String name;

    @Column(name = "description")
    private String description;


    private Business() {
    }

    public Business(String name, String description) {
        this.name = name;
        this.description = description;
    }
}
