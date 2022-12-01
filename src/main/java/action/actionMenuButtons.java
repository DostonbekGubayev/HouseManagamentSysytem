package action;

import com.example.housemanagamentsysytem.HelloController;
import javafx.event.ActionEvent;

public class actionMenuButtons {
    HelloController controller;


    public actionMenuButtons(HelloController controller){
        this.controller=controller;
    }

    public void action(ActionEvent event){
        if (controller.home.isFocused()){

        }else if (controller.buyurtmalar.isFocused()){

            controller.buyurtmaPane.setVisible(true);
            controller.settingsPane.setVisible(false);
//            controller.jadvalPane.setVisible(false);
//            controller.jadvalPane.setVisible(false);
//            controller.royhatYaratishPane.setVisible(false);
//            controller.mahsulotQoshishPane.setVisible(false);
//            controller.buyurtmaPane.setVisible(false);
          //  controller.sozlamalarPane.setVisible(false);

        }else if (controller.mahsulotlar.isFocused()){

        }else if (controller.stollar.isFocused()){

        }else if (controller.hodimlar.isFocused()){

        }else if (controller.sozlamalar.isFocused()){

            controller.settingsPane.setVisible(true);
            controller.buyurtmaPane.setVisible(false);

        }
    }
}
