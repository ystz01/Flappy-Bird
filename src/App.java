import javax.swing.*;
public class App {
    public static void main(String[] args) throws Exception {
        int boardWidth=360;
        int boardHeight=640;

        JFrame frame=new JFrame("Flappy Bird");
        //frame.setVisible(true);
        frame.setSize(boardWidth,boardHeight);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        flappyBird FlappyBird=new flappyBird();
        frame.add(FlappyBird);
        frame.pack();//not include title bar
        FlappyBird.requestFocus();
        frame.setVisible(true);
    }
}
