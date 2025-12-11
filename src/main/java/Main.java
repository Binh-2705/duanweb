import view.DanhmucView;
import controller.DanhmucController;
import controller.MainController;
import view.MainView;

public class Main {
    public static void main(String[] args) {
        
        javax.swing.SwingUtilities.invokeLater(() -> {
            MainView mv = new MainView();
            mv.setVisible(true);

            new MainController(mv);
        });
    }
}
