package jason.designpatterns.chainofresponsibility;

/**
 * 编码过滤器
 * 具体处理者
 *
 * @author Jason Hou
 */
public class EncodingFilter implements Filter {

    @Override
    public void doFilter(Request request, Response response, FilterChain chain) {
        System.out.println("编码过滤器");
        chain.doFilter(request, response);
    }

}
