/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI.Controller;

import com.jfoenix.controls.JFXButton;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.GridPane;
import BLL.move.IMove;
import BLL.move.MyMove;
import GUI.Model.GameModel;
import java.util.ArrayList;

/**
 * FXML Controller class
 *
 * @author Kent Juul
 */
public class GameWindowController implements Initializable
{
    @FXML
    private GridPane rootPane;
    @FXML
    private JFXButton A1_1;
    @FXML
    private JFXButton A2_1;
    @FXML
    private JFXButton A3_1;
    @FXML
    private JFXButton A1_2;
    @FXML
    private JFXButton A2_2;
    @FXML
    private JFXButton A3_2;
    @FXML
    private JFXButton A1_3;
    @FXML
    private JFXButton A2_3;
    @FXML
    private JFXButton A3_3;
    @FXML
    private JFXButton A4_1;
    @FXML
    private JFXButton A5_1;
    @FXML
    private JFXButton A6_1;
    @FXML
    private JFXButton A4_2;
    @FXML
    private JFXButton A5_2;
    @FXML
    private JFXButton A6_2;
    @FXML
    private JFXButton A4_3;
    @FXML
    private JFXButton A5_3;
    @FXML
    private JFXButton A6_3;
    @FXML
    private JFXButton A7_1;
    @FXML
    private JFXButton A8_1;
    @FXML
    private JFXButton A7_2;
    @FXML
    private JFXButton A8_2;
    @FXML
    private JFXButton A7_3;
    @FXML
    private JFXButton A8_3;
    @FXML
    private JFXButton A1_4;
    @FXML
    private JFXButton A2_4;
    @FXML
    private JFXButton A3_4;
    @FXML
    private JFXButton A1_5;
    @FXML
    private JFXButton A2_5;
    @FXML
    private JFXButton A3_5;
    @FXML
    private JFXButton A1_6;
    @FXML
    private JFXButton A2_6;
    @FXML
    private JFXButton A3_6;
    @FXML
    private JFXButton A4_4;
    @FXML
    private JFXButton A5_4;
    @FXML
    private JFXButton A6_4;
    @FXML
    private JFXButton A4_5;
    @FXML
    private JFXButton A5_5;
    @FXML
    private JFXButton A6_5;
    @FXML
    private JFXButton A4_6;
    @FXML
    private JFXButton A5_6;
    @FXML
    private JFXButton A6_6;
    @FXML
    private JFXButton A7_4;
    @FXML
    private JFXButton A8_4;
    @FXML
    private JFXButton A7_5;
    @FXML
    private JFXButton A7_6;
    @FXML
    private JFXButton A8_6;
    @FXML
    private JFXButton A1_7;
    @FXML
    private JFXButton A2_7;
    @FXML
    private JFXButton A3_7;
    @FXML
    private JFXButton A1_8;
    @FXML
    private JFXButton A2_8;
    @FXML
    private JFXButton A3_8;
    @FXML
    private JFXButton A4_7;
    @FXML
    private JFXButton A5_7;
    @FXML
    private JFXButton A6_7;
    @FXML
    private JFXButton A4_8;
    @FXML
    private JFXButton A5_8;
    @FXML
    private JFXButton A6_8;
    @FXML
    private JFXButton A7_7;
    @FXML
    private JFXButton A8_7;
    @FXML
    private JFXButton A7_8;
    @FXML
    private JFXButton A8_8;
    @FXML
    private JFXButton A0_0;
    @FXML
    private JFXButton A1_0;
    @FXML
    private JFXButton A2_0;
    @FXML
    private JFXButton A0_1;
    @FXML
    private JFXButton A0_2;
    @FXML
    private JFXButton A3_0;
    @FXML
    private JFXButton A4_0;
    @FXML
    private JFXButton A5_0;
    @FXML
    private JFXButton A6_0;
    @FXML
    private JFXButton A7_0;
    @FXML
    private JFXButton A8_0;
    @FXML
    private JFXButton A0_3;
    @FXML
    private JFXButton A0_4;
    @FXML
    private JFXButton A0_5;
    @FXML
    private JFXButton A8_5;
    @FXML
    private JFXButton A0_6;
    @FXML
    private JFXButton A0_7;
    @FXML
    private JFXButton A0_8;

    
    @FXML
    private GridPane B0_0;
    @FXML
    private GridPane B1_0;
    @FXML
    private GridPane B2_0;
    @FXML
    private GridPane B0_1;
    @FXML
    private GridPane B1_1;
    @FXML
    private GridPane B2_1;
    @FXML
    private GridPane B0_2;
    @FXML
    private GridPane B1_2;
    @FXML
    private GridPane B2_2;
    
    private GameModel model = new GameModel();
    private ArrayList<GridPane> gridList = new ArrayList<>();
    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb)
    {
        gridList.add(B0_0);
        gridList.add(B1_0);
        gridList.add(B2_0);
        gridList.add(B0_1);
        gridList.add(B1_1);
        gridList.add(B2_1);
        gridList.add(B0_2);
        gridList.add(B1_2);
        gridList.add(B2_2);
    }    

    @FXML
    private void registerMoveEvent(ActionEvent event)
    {
        Button selectedBtn = (Button) event.getSource();
        String location = selectedBtn.getId().toString();
        
        location = location.replaceAll("A", "");
        String[] xy = location.split("_");
        
        int x = Integer.parseInt(xy[0]);
        int y = Integer.parseInt(xy[1]);
        
        IMove move = new MyMove(x, y);
        
        if(model.makeMove(move))
        {
           markField(selectedBtn);
           
           highlightActiveField();
           
           markMacroField();
           
        }
        
        
        

        
    }

    private void markField(Button selectedBtn) 
    {
        if(model.retrieveCurrentPlayer() == 0)
        {
            selectedBtn.setText("O");
        }
        if(model.retrieveCurrentPlayer() == 1)
        {
            selectedBtn.setText("X");
        }        
    }

    private void markMacroField() 
    {
        //tjek macro field for player wins og markere playerwin i feltet
    }

    private void highlightActiveField() 
    {
        
        for (GridPane gridPane : gridList) 
        {
            String gridLocation = gridPane.getId().toString();
            gridLocation = gridLocation.replaceAll("B", "");
            String[] xy = gridLocation.split("_");
        
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            
            if(model.getActiveField(x, y))
            {
                gridPane.setStyle("-fx-background-color: Yellow;");
            }
            else
            {
                gridPane.setStyle(null);
            }
            
            
        }
        
        
    }

    

    
}
