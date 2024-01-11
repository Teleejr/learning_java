package org.perscholas.model;

import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.data.annotation.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import java.io.Serializable;


@Data
@NoArgsConstructor @RequiredArgsConstructor @Entity
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Student implements Serializable {

    //Fields
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @NonNull
    String name;
    @NonNull
    String email;

}
