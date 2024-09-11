package com.baomidou.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.extension.activerecord.Model;

import java.io.Serializable;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.Accessors;

/**
 * <p>
 *
 * </p>
 *
 * @author qiao
 * @since 2024-09-11 22:45:15
 */
@Getter
@Setter
@Accessors(chain = true)
public class Account extends Model<Account> {

    private static final long serialVersionUID = 1L;

    @TableId(value = "id", type = IdType.ASSIGN_ID)
    private String id;

    private String name;

    private Integer balance;

    @Override
    public Serializable pkVal() {
        return this.id;
    }
}
