package com.carbuddy.repository.entity;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "tbl_rental")
public class Rental {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "rid")
    private Long id;
    @NotBlank
    private Long rentDate;
    @NotBlank
    private Long customerId;
    //Car OneToMany -
    //Customer ManyToOne -
    @NotBlank
    private Long carId;

}
