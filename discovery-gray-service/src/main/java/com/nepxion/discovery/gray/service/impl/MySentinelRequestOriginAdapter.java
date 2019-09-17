package com.nepxion.discovery.gray.service.impl;

/**
 * <p>Title: Nepxion Discovery</p>
 * <p>Description: Nepxion Discovery</p>
 * <p>Copyright: Copyright (c) 2017-2050</p>
 * <p>Company: Nepxion</p>
 * @author Haojun Ren
 * @version 1.0
 */

import javax.servlet.http.HttpServletRequest;

import com.nepxion.discovery.common.constant.DiscoveryConstant;
import com.nepxion.discovery.plugin.strategy.service.sentinel.adapter.AbstractSentinelRequestOriginAdapter;

// 版本+用户名，实现联合熔断
public class MySentinelRequestOriginAdapter extends AbstractSentinelRequestOriginAdapter {
    @Override
    public String parseOrigin(HttpServletRequest request) {
        String version = request.getHeader(DiscoveryConstant.N_D_VERSION);
        String user = request.getHeader("user");

        return version + "&" + user;
    }
}