package jason.designpatterns.chainofresponsibility;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jason Hou
 */
public class FilterChain {

    private final List<Filter> filterList;
    private int index;

    public FilterChain() {
        filterList = new ArrayList<>();
    }

    public void addFilter(Filter filter) {
        filterList.add(filter);
    }

    public void doFilter(Request request, Response response) {
        if (filterList.size() > index) {
            filterList.get(index++).doFilter(request, response, this);
        }
    }

}
