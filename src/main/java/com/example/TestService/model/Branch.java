package com.example.TestService.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@Table(name = "branch")
public class Branch {
    @Id
    @Column(name = "branchId")
    private String branchId;

    @Column(name = "name")
    private String name;

    @Column(name = "timeZone")
    private String timeZone;
}