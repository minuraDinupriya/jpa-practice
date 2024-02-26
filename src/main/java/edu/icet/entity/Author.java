package edu.icet.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
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

    private Long id;
    private String fName;
    @Column(
            name = "not_email",
            unique = true,
            nullable = false,
            length = 35
    )
    private String email;
}
