//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package action;

import com.example.housemanagamentsysytem.HelloController;
import javafx.event.ActionEvent;

public class actionMenuButtons {
    HelloController controller;

    public actionMenuButtons(HelloController controller) {
        this.controller = controller;
    }

    public void action(ActionEvent event) {

        if (controller.home.isFocused()) {
            controller.homePane.setVisible(true);
            controller.buyurtmaPane.setVisible(false);
            controller.settingsPane.setVisible(false);
        }else
            if (controller.buyurtmalar.isFocused()) {

                controller.buyurtmaPane.setVisible(true);
                controller.settingsPane.setVisible(false);
                controller.homePane.setVisible(false);

            } else if ( controller.sozlamalar.isFocused()) {
                controller.settingsPane.setVisible(true);
                controller.buyurtmaPane.setVisible(false);
                controller.homePane.setVisible(false);
            }


    }
}
