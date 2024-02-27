package edu.icet.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "courses_table")
@Table
public class Course {
    @Id
    @GeneratedValue
    private Long courseId;
    private String name;
    @ManyToMany//
    @JoinTable(
            name = "author_course",
            joinColumns = {
                    @JoinColumn(name="course_id")
            },
            inverseJoinColumns = {
                    @JoinColumn(name = "author_id")
            }
    )
    private List<Author> authors;
}
