package edu.icet.entity;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity(name = "courses_table")
@Table
public class Course {
    @Id
    @GeneratedValue
    private Long id;
    private String name;

}
