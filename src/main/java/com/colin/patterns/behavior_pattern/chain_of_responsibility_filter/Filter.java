package com.colin.patterns.behavior_pattern.chain_of_responsibility_filter;



// 抽象拦截器——Filter
public interface Filter {

    void doFilter(LeaveRequest request, FilterChain chain);
}
