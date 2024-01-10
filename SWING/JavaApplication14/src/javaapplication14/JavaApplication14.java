package javaapplication14;
import javax.swing.JFrame;
import javax.swing.JLabel;
public class JavaApplication14 {
//    public static class HelloFrame extends JFrame{
//        public static final int DEFAULT_WIDTH = 500;
//        public static final int DEFAULT_HEIGHT = 300;
//        public HelloFrame(String title){
//            super(title);
//            JLabel label = new JLabel("Hello world");
//            this.getContentPane().add(label);
//            this.setSize(DEFAULT_WIDTH,DEFAULT_HEIGHT);
//        }
//    }
    
    public static void main(String[] args) {
        firstFrame frame = new firstFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
    
}
