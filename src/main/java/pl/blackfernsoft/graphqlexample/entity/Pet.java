package pl.blackfernsoft.graphqlexample.entity;

import lombok.Data;

@Data
public class Pet {

    private Long id;
    private String name;
    private Animal type;
    private Integer age;

}
