package jason.designpatterns.chainofresponsibility;

/**
 * 过滤器接口
 * 抽象处理者
 *
 * @author Jason Hou
 */
public interface Filter {

    /**
     * 过滤操作
     *
     * @param request  请求
     * @param response 响应
     * @param chain    过滤器链
     */
    void doFilter(Request request, Response response, FilterChain chain);

}
