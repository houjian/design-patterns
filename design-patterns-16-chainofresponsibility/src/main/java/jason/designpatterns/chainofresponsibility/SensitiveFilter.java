package jason.designpatterns.chainofresponsibility;

/**
 * 敏感词过滤器
 * 具体处理者
 *
 * @author Jason Hou
 */
public class SensitiveFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("敏感词过滤器");
        chain.doFilter(request, response);
    }

}
