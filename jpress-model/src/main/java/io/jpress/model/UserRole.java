package io.jpress.model;

import io.jboot.db.annotation.Table;
import io.jpress.model.base.BaseUserRole;

/**
 * Generated by Jboot.
 */
@Table(tableName = "user_role", primaryKey = "role_id,user_id")
public class UserRole extends BaseUserRole<UserRole> {

    public boolean isSuperRole() {
        return getRoleId() == 1;
    }
}
