package edu.icet.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Author {
    @Id
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "author_id_incrementor"
    )
    private Long authorId;
    private String fName;
    @Column(
            name = "not_email",
            unique = true,
            nullable = false,
            length = 35
    )
    private String email;
    @ManyToMany(mappedBy = "authors")
    private List<Course> courses;
}
