package jason.designpatterns.chainofresponsibility;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class FilterChainTest {

    @Test
    public void testFilter() {
        FilterChain chain = new FilterChain();
        chain.addFilter(new EncodingFilter());
        chain.addFilter(new SensitiveFilter());
        chain.doFilter(new Request(), new Response());
    }

}
