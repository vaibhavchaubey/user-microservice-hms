package com.hms.user.dto;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RegisterationCountsDTO {
    private List<MonthlyRoleCountDTO> doctorCounts;
    private List<MonthlyRoleCountDTO> patientCounts;
}
