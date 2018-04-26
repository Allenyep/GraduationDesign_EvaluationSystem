package com.gdes.GDES.dao.base;

import java.util.List;

/**
 * Created by Allen on 2018/4/26.
 */
public interface BaseDao<T> {
    public Boolean insert(T var);
    public Boolean delete(T var);
    public Boolean update(T var);
    public List<T> select(T var);
}
