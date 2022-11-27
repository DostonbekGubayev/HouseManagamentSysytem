package action;

import com.example.housemanagamentsysytem.HelloController;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;

public class MenuBarAction {
    private HelloController controller;

    public MenuBarAction(HelloController controller) {
        this.controller = controller;
    }

    public void menuAction(ActionEvent event){
        if (event.getSource().equals(controller.taomItem)){

            controller.mahsulotQoshishPane.setVisible(true);
            controller.royhatYaratishPane.setVisible(false);
            controller.jadvalPane.setVisible(false);

        }else if (event.getSource().equals(controller.royhatYaratish)){

            controller.royhatYaratishPane.setVisible(true);
            controller.mahsulotQoshishPane.setVisible(false);
            controller.jadvalPane.setVisible(false);
            controller.buyurtmaPane.setVisible(false);
           // controller.sozlamalarPane.setVisible(false);

        }else if (event.getSource().equals(controller.jadvalYaratItem)){

            TableView tableView=new TableView();
            tableView.getColumns().add(new TableColumn<>("Text"));
            controller.JadvalNamunaPane.getChildren().addAll(tableView);

            controller.jadvalPane.setVisible(true);
            controller.royhatYaratishPane.setVisible(false);
            controller.mahsulotQoshishPane.setVisible(false);
            controller.buyurtmaPane.setVisible(false);
            controller.sozlamalarPane.setVisible(false);

        }
    }
}
