package com.colin.patterns.behavior_pattern.chain_of_responsibility_filter;


import java.util.ArrayList;
import java.util.List;

// 过滤器链
public class FilterChain {

    // 过滤器集合，执行顺序
    private List<Filter> filters = new ArrayList<>();
    // 过滤器索引——表示当前执行到filters集合中的第几个过滤器
    private int index = 0;

    public void setIndex(int index) {
        this.index = index;
    }

    // 添加过滤器
    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    // 执行所有过滤器
    public void doFilter(LeaveRequest request) {
        if (index == filters.size()) {
            return;
        }
        Filter filter = filters.get(index ++);
        filter.doFilter(request, this);
    }
}
