package org.example.profileservice.dto.request;

import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ProfileCreationRequest {
    private String firstName;
    private String lastName;
    private LocalDate dob;
    private String city;
}
