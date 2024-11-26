import java.awt.*;
import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.io.File;

class Question_12 extends JFrame {
    Question_12() {
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root Directory");
        File[] drives = File.listRoots();
        for (File drive : drives) {
            DefaultMutableTreeNode driveNode = new DefaultMutableTreeNode(drive.getPath());
            root.add(driveNode);
            File[] files = drive.listFiles();
            if (files != null) {
                for (File file : files) {
                    if (file.isDirectory()) {
                        driveNode.add(new DefaultMutableTreeNode(file.getName()));
                    }
                }
            }
        }
        JTree tree = new JTree(root);
        add(new JScrollPane(tree));
        setSize(500, 500);
        setVisible(true);
    }

    public static void main(String[] args) {
        new Question_12();
    }
}
