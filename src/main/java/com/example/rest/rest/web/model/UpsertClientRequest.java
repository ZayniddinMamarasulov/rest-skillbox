package com.example.rest.rest.web.model;


import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class UpsertClientRequest {

    @NotBlank(message = "name is required")
    @Size(min = 3, max = 30, message = "Min is {min} and max is {max} characters")
    private String name;


}
