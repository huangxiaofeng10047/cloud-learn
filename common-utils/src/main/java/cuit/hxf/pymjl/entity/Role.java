package cuit.hxf.pymjl.entity;

import com.gitee.sunchenbin.mybatis.actable.annotation.Column;
import com.gitee.sunchenbin.mybatis.actable.annotation.Table;
import com.gitee.sunchenbin.mybatis.actable.constants.MySqlTypeConstant;

/**
 * @author hxf
 * @date 2023年01月28日 2:54 PM
 */
@Table(name = "role")
public class Role {
    /**
     * 自增id
     */
    @Column(name = "role_id", type = MySqlTypeConstant.INT, isNull = false,
            isKey = true, isAutoIncrement = true, comment = "自增id")
    private Long roleId;
    /**
     * 角色名字
     */
    @Column(name = "name", type = MySqlTypeConstant.VARCHAR, isNull = false, length = 20, comment = "角色名字")
    private String name;
    /**
     * 角色的中文名字
     */
    @Column(name = "name_zh", type = MySqlTypeConstant.VARCHAR, isNull = true, length = 20, comment = "角色的中文名字")
    private String nameZh;
}

