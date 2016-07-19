package com.x.user.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import java.io.Serializable;

/**
 * Created by Administrator on 2016/7/19.
 */
public class UserUsergrpEntityPK implements Serializable {
    private long usrid;
    private long gid;

    @Column(name = "USRID")
    @Id
    public long getUsrid() {
        return usrid;
    }

    public void setUsrid(long usrid) {
        this.usrid = usrid;
    }

    @Column(name = "GID")
    @Id
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

        UserUsergrpEntityPK that = (UserUsergrpEntityPK) o;

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
}
