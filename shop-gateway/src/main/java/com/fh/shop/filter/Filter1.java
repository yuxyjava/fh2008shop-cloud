package com.fh.shop.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.netflix.zuul.filters.support.FilterConstants;

@Slf4j
public class Filter1 extends ZuulFilter {

    /**
     * pre: 所有的客户端请求在访问 真正的微服务 前 执行
     * route
     * post:在 访问微服务 之后 执行
     * error
     * @return
     */
    @Override
    public String filterType() {
        return FilterConstants.PRE_TYPE;
    }

    /**
     * 顺序，数值越小，优先级越高[在同一类型过滤器中]
     * @return
     */
    @Override
    public int filterOrder() {
        return 8;
    }

    /**
     * 当前的过滤器是否生效
     * true:起作用
     * false:失效
     * @return
     */
    @Override
    public boolean shouldFilter() {
        return true;
    }

    /**
     * 所有的业务逻辑处理
     * 永远要返回null
     * @return
     * @throws ZuulException
     */
    @Override
    public Object run() throws ZuulException {
        log.info("执行=====================filter1");
        return null;
    }
}
