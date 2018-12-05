package com.simple.frame.spi.impl;

import com.simple.frame.spi.Protocol;
import com.simple.frame.spi.Task;

/**
 * Created by lvxiang@ganji.com 2018/8/15 14:36
 *
 * @author <a href="mailto:lvxiang@ganji.com">simple</a>
 */
public class TaskImplTwo implements Task {
    @Override
    public String getName() {
        return "TaskImplTwo";
    }

    @Override
    public String getName(Protocol url) {
        return null;
    }
}
