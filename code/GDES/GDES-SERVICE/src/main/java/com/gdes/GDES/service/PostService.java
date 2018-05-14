package com.gdes.GDES.service;

import com.gdes.GDES.model.Post;

public interface PostService {
    /**
     * 根据id查询记录
     * @param pid
     * @return
     * @throws Exception
     */
    public Post queryById(Integer pid) throws Exception;

    /**
     * 得到岗位的个数
     * @return
     * @throws Exception
     */
    public long getCount() throws Exception;
}
