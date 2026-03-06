package com.Practo.Tool.controller;

import com.Practo.Tool.model.Appointment;
import com.Practo.Tool.repository.AppointmentRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

@RestController
public class AppointmentController {

    private final AppointmentRepository appointmentRepository;

    public AppointmentController(AppointmentRepository appointmentRepository) {
        this.appointmentRepository = appointmentRepository;
    }

    @PostMapping("/appointment")
    public ResponseEntity<String> createAppointment(@RequestBody Appointment appointment) {
        Appointment appointment1 = Appointment.builder()
                .patientName(appointment.getPatientName())
                .age(appointment.getAge())
//                .symptoms(appointment.getSymptoms())
                .createdAt(LocalDateTime.now(ZoneId.of("Asia/Kolkata")))
                .build();
        appointmentRepository.save(appointment1);
        return new ResponseEntity<>("Appointment Created Successfully", HttpStatus.CREATED);
    }

    @GetMapping("/appointments")
    public List<Appointment> getAllAppointments(){
        return appointmentRepository.findAll();
    }
}
