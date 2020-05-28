package jason.designpatterns.composite;

import org.junit.Test;

/**
 * @author Jason Hou
 */
public class CompositeTest {

    @Test
    public void testComposite() {
        Folder directory = new Folder("组合模式");
        for (int i = 0; i < 2; i++) {
            Folder folder = new Folder(String.format("第%d章", i + 1));
            for (int j = 0; j < 2; j++) {
                folder.add(new File(String.format("第%d节", j + 1)));
            }
            directory.add(folder);
        }

        traversal(directory, 0);
    }

    private void traversal(AbstractDirectory directory, int depth) {
        String result = directory.show();
        System.out.println(new String(new char[depth << 1]) + result);

        for (int i = 0; i < directory.size(); i++) {
            AbstractDirectory child = directory.getChild(i);
            traversal(child, ++depth);
        }
    }

}
