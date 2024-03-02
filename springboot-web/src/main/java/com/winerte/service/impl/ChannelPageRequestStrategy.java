package com.winerte.service.impl;

import com.winerte.service.ILearnWebRequestStrategy;
import com.winerte.util.WebRequestParam;
import org.springframework.stereotype.Service;

/**
 * 栏目请求处理策略
 */
@Service("channelPageRequestStrategy")
public class ChannelPageRequestStrategy implements ILearnWebRequestStrategy {
    @Override
    public String handleRequest(WebRequestParam webRequestParam) {
        return "channel";
    }
}
