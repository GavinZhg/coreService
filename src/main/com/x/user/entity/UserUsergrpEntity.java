package com.x.user.entity;

import javax.persistence.*;
import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/19.
 */
@Entity
@Table(name = "user_usergrp", schema = "research", catalog = "")
@IdClass(UserUsergrpEntityPK.class)
public class UserUsergrpEntity implements Serializable {
    private long usrid;
    private long gid;
    private UserEntity userByUsrid;
    private UserGroupEntity userGroupByGid;

    @Id
    @Column(name = "USRID")
    public long getUsrid() {
        return usrid;
    }

    public void setUsrid(long usrid) {
        this.usrid = usrid;
    }

    @Id
    @Column(name = "GID")
    public long getGid() {
        return gid;
    }

    public void setGid(long gid) {
        this.gid = gid;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        UserUsergrpEntity that = (UserUsergrpEntity) o;

        if (usrid != that.usrid) return false;
        if (gid != that.gid) return false;

        return true;
    }

    @Override
    public int hashCode() {
        int result = (int) (usrid ^ (usrid >>> 32));
        result = 31 * result + (int) (gid ^ (gid >>> 32));
        return result;
    }

    @ManyToOne
    @JoinColumn(name = "USRID", referencedColumnName = "ID", nullable = false)
    public UserEntity getUserByUsrid() {
        return userByUsrid;
    }

    public void setUserByUsrid(UserEntity userByUsrid) {
        this.userByUsrid = userByUsrid;
    }

    @ManyToOne
    @JoinColumn(name = "GID", referencedColumnName = "ID", nullable = false)
    public UserGroupEntity getUserGroupByGid() {
        return userGroupByGid;
    }

    public void setUserGroupByGid(UserGroupEntity userGroupByGid) {
        this.userGroupByGid = userGroupByGid;
    }
}
