package com.kenton.observe._interface;

import com.kenton.observe.entity.Paper;

/**
 * @author KentonLee
 * @date 2019/2/26
 */
public interface Observe {


    /**
     *  更新本地的消息
     * @param paper paper
     */
    void update(Paper paper);
}
