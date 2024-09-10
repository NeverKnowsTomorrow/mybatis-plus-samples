package com.baomidou.entity;

import lombok.Data;
import lombok.experimental.Accessors;

@Data
@Accessors(chain = true)
public class Account {
    private Long id;
    private String name;
    private Integer balance;
}
