package cn.sm1234.domain;

public class Role {
    private Integer id; //int(10) NOT NULL,

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public String getRoleDesc() {
        return roleDesc;
    }

    public void setRoleDesc(String roleDesc) {
        this.roleDesc = roleDesc;
    }

    private String roleName; //varchar(50) DEFAULT NULL,
    private String roleDesc; //varchar(50) DEFAULT NULL,
}
