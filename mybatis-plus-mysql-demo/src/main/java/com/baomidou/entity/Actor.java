package com.baomidou.entity;

import java.io.Serializable;
import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;

/**
 * <p>
 * 
 * </p>
 *
 * @author qiao
 * @since 2024-09-10 23:23:45
 */
@Getter
@Setter
public class Actor implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private String name;

    private LocalDateTime updateTime;
}
