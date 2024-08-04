package com.udacity.vehicles.domain.manufacturer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

/**
 * Declares class to hold car manufacturer information.
 */

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Manufacturer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer code;
    private String name;
}

//@Entity
//public class Manufacturer {
//
//    @Id
//    private Integer code;
//    private String name;
//
//    public Manufacturer() { }
//
//    public Manufacturer(Integer code, String name) {
//        this.code = code;
//        this.name = name;
//    }
//
//    public Integer getCode() {
//        return code;
//    }
//
//    public String getName() {
//        return name;
//    }
//}
