package io.jpress.model;

import io.jboot.db.annotation.Table;
import io.jpress.model.base.BaseUserPermission;

/**
 * Generated by Jboot.
 */
@Table(tableName = "user_permission", primaryKey = "permission_id,user_id")
public class UserPermission extends BaseUserPermission<UserPermission> {

    public boolean isOwn() {
        return getOwn() != null && getOwn() == true;
    }
}
