<<<<<<< HEAD
package practice21_22;
import javax.swing.*;

public class Application extends JFrame{
    private ICreateDocument iCreateDocument;

    public static void main(String[] args){
        new Application(new CreateTextDocument());
    }
    public Application(ICreateDocument iCreateDocument){
        super("Redactor");
        this.iCreateDocument = iCreateDocument;
        setVisible(true);
        setSize(600,600);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(newItem);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(exitItem);
        menuBar.add(menu);

        newItem.addActionListener(e -> iCreateDocument.CreateNew());
        newItem.addActionListener(e -> iCreateDocument.CreateOpen());
        setJMenuBar(menuBar);
    }

}
=======
package practice21_22;
import javax.swing.*;

public class Application extends JFrame{
    private ICreateDocument iCreateDocument;

    public static void main(String[] args){
        new Application(new CreateTextDocument());
    }
    public Application(ICreateDocument iCreateDocument){
        super("Redactor");
        this.iCreateDocument = iCreateDocument;
        setVisible(true);
        setSize(600,600);
        JMenuBar menuBar = new JMenuBar();
        JMenu menu = new JMenu("File");
        JMenuItem newItem = new JMenuItem("New");
        JMenuItem openItem = new JMenuItem("Open");
        JMenuItem saveItem = new JMenuItem("Save");
        JMenuItem exitItem = new JMenuItem("Exit");
        menu.add(newItem);
        menu.add(openItem);
        menu.add(saveItem);
        menu.add(exitItem);
        menuBar.add(menu);

        newItem.addActionListener(e -> iCreateDocument.CreateNew());
        newItem.addActionListener(e -> iCreateDocument.CreateOpen());
        setJMenuBar(menuBar);
    }

}
>>>>>>> origin/master
