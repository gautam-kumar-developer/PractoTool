package com.Practo.Tool.model;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Appointment {
    @Id
    private String id;
    private String patientName;
    private String age;
//    private String symptoms;
    private LocalDateTime createdAt;
}
