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
            controller.sozlamalarPane.setVisible(false);
            controller.jadvalPane.setVisible(false);

        }else if (controller.mahsulotlar.isFocused()){

        }else if (controller.stollar.isFocused()){

        }else if (controller.hodimlar.isFocused()){

        }else if (controller.sozlamalar.isFocused()){

            controller.sozlamalarPane.setVisible(true);
            controller.buyurtmaPane.setVisible(false);
            controller.jadvalPane.setVisible(false);

        }
    }
}
