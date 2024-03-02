package com.winerte.service;


import com.winerte.util.WebRequestParam;

/**
 * 前端请求处理策略
 */
public interface ILearnWebRequestStrategy {
    String handleRequest(WebRequestParam webRequestParam);

}
