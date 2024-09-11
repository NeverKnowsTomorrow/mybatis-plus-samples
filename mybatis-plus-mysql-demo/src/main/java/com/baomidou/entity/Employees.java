package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;
import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 * 员工记录表
 * </p>
 *
 * @author qiao
 * @since 2024-09-11 22:45:15
 */
@Getter
@Setter
@Accessors(chain = true)
public class Employees extends Model<Employees> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private Integer id;

    /**
     * 姓名
     */
    private String name;

    /**
     * 年龄
     */
    private Integer age;

    /**
     * 职位
     */
    private String position;

    /**
     * 入职时间
     */
    private LocalDateTime hireTime;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
