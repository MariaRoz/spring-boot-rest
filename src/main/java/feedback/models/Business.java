package feedback.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
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
    private String businessname;

    @JsonIgnore
    @Column(name = "password")
    private String password;

    @Column(name = "description")
    private String description;


//    @ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
//    @JoinTable(name = "user_authority",
//            joinColumns = @JoinColumn(name = "business_id", referencedColumnName = "id"),
//            inverseJoinColumns = @JoinColumn(name = "authority_id", referencedColumnName = "id"))
//    private List<Authority> authorities;

//    public void setAuthorities(List<Authority> authorities) {
//        this.authorities = authorities;
//    }

}
