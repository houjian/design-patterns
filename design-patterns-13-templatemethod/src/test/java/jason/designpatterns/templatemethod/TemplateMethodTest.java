package jason.designpatterns.templatemethod;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class TemplateMethodTest {

    @Test
    public void testTemplateMethod() {
        AbstractStudyAbroad study = new StudyInAmerica();
        study.templateMethod();
    }

}
