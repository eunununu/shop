package com.example.shoppro.entity;

<<<<<<< HEAD

=======
>>>>>>> ed2b8e65912c81fd6596945bde5e9b8c04f050d7
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Getter
@Setter
<<<<<<< HEAD
@NoArgsConstructor
@ToString
public class Category {


    @Id
    @Column(name = "category_id")       //테이블에서 매핑될 컬럼
=======
@ToString
@NoArgsConstructor
public class Category {

    @Id
    @Column(name = "category_id")
>>>>>>> ed2b8e65912c81fd6596945bde5e9b8c04f050d7
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String caname;
<<<<<<< HEAD

=======
>>>>>>> ed2b8e65912c81fd6596945bde5e9b8c04f050d7
}
