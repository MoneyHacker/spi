package com.simple.frame.spi.impl;

import com.simple.frame.spi.Protocol;
import com.simple.frame.spi.Task;

/**
 * Created by 278076999@qq.com 2018/8/15 14:36
 *
 * @author <a href="mailto:278076999@qq.com">simple</a>
 */
public class TaskImplOne implements Task {
    @Override
    public String getName() {
        return "TaskImplOne";
    }

    @Override
    public String getName(Protocol url) {
        return null;
    }
}
