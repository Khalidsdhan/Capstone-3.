
package com.example.capstone3.Model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.*;

import java.util.Set;

@Getter
@Setter
@AllArgsConstructor
@Entity
@NoArgsConstructor
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(columnDefinition = "varchar(20) not null")
    @NotEmpty(message = "name must be not empty")
    private String name;

    @Column(columnDefinition = "int not null")
    @Min(18)
    @NotNull(message = "age must be not empty")
    private Integer age;
    

    @Email
    @Column(columnDefinition = "email varchar(55)  unique")
    @NotEmpty(message = "email must be not empty")
    private String email;

    @Column(columnDefinition = "varchar(20) not null")
    @NotEmpty(message = "password must be not empty")
    private String password;

    @ManyToMany
    private Set<Bid> bids;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private Set<Contract> contracts;
}
