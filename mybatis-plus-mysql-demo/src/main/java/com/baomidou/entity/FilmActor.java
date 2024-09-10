package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
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
@TableName("film_actor")
public class FilmActor implements Serializable {

    private static final long serialVersionUID = 1L;

      private Integer id;

    private Integer filmId;

    private Integer actorId;

    private String remark;
}
