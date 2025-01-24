package com.example.UserBranch.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import java.util.HashSet;
import java.util.Set;

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

    @ManyToMany
    @JoinTable(
            name = "user_branch",
            joinColumns = @JoinColumn(name = "branch_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    @Setter(AccessLevel.NONE)
    private Set<User> owner = new HashSet<>();
}
