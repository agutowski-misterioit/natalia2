package com.example.library.resource;

import com.example.students.data.StudentUnit;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//tworzymy dto z nazwą sugerującą jego zastosowanie (dla zainteresowanych ma to zastosowanie przy
//wykorzystaniu wzorca CommandHandler)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class CreateStudent {

    //korzystamy z gotowego walidatora (dodanego z nowym dependency,
    // żeby sprawdzić czy podana wartość nie jest pusta
    @NotBlank
    private String name;
    private StudentUnit unit;
}
