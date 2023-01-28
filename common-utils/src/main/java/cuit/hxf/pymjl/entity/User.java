package cuit.hxf.pymjl.entity;

import com.baomidou.mybatisplus.annotation.*;
import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;
import java.time.LocalDateTime;

/**
 * @author Pymjl
 * @version 1.0
 * @date 2022/8/27 0:35
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@TableName("t_user")
@Table(name = "t_user")
public class User implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * 自增id
     */
    @TableId(value="u_id",type = IdType.AUTO)
    @Column(name = "u_id", type = MySqlTypeConstant.INT, isNull = false,
            isKey = true, isAutoIncrement = true, comment = "自增id")
    private Long id;
    @Column(name = "username", type = MySqlTypeConstant.VARCHAR, isNull = false, length = 20, comment = "名字")
    private String username;
    @Column(name = "password", type = MySqlTypeConstant.VARCHAR, isNull = false, length = 20, comment = "角色名字")
    private String password;
    @Column(name = "email", type = MySqlTypeConstant.VARCHAR, isNull = false, length = 20, comment = "角色名字")
    private String email;
    @Column(name = "phone", type = MySqlTypeConstant.VARCHAR, isNull = false, length = 20, comment = "角色名字")
    private String phone;
    @Column(name = "phone2", type = MySqlTypeConstant.VARCHAR, isNull = false, length = 20, comment = "角色名字")
    private String phone2;

    @TableField(fill = FieldFill.INSERT)
    private LocalDateTime createTime;
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private LocalDateTime updateTime;
}
