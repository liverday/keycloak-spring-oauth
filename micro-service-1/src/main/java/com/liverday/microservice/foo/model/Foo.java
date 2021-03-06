package com.liverday.microservice.foo.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Foo {
    private String userId;
    private String id;
    private String name;
    private String bar;
}
