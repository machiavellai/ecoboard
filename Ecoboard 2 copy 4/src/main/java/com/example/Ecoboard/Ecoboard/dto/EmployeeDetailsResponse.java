package com.example.Ecoboard.Ecoboard.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Builder;
import lombok.Data;

import java.util.Date;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class EmployeeDetailsResponse {
    private String message;
//    private String familyName;
//
//    private String fullName;
//
//    private String placeOfBirth;
//
//    private String phoneNumber;
//
//    private String gender;
//
//    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "dd-MM-yyyy")
//    private Date dateOfBirth;
//
//    private String sex;
//
//    private String height;
//
//    private String weight;
//
//    private String status;
//
//    private String disabilityCheck;

}
