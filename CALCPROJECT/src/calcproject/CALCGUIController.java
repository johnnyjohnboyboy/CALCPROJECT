package calcproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class CALCGUIController {
private String crntArth0pt= "DEFAULT";
private String opd1="0";
    @FXML
    private Button btn0;

    @FXML
    private Button btn1;

    @FXML
    private Button btn2;

    @FXML
    private Button btn3;

    @FXML
    private Button btn4;

    @FXML
    private Button btn5;

    @FXML
    private Button btn6;

    @FXML
    private Button btn7;

    @FXML
    private Button btn8;

    @FXML
    private Button btn9;

    @FXML
    private Button addition;

    @FXML
    private Button subtract;

    @FXML
    private Button multiply;

    @FXML
    private Button divide;

    @FXML
    private Button equalbtn;
        @FXML
    private TextField txtBox;



    
        @FXML
    void prcssNums(ActionEvent event) {
Button btn = (Button)event.getSource();
        switch(btn.getText()){
         case"0": txtBox.setText(txtBox.getText()+"0");break;
         case"1": txtBox.setText(txtBox.getText()+"1");break;
         case"2": txtBox.setText(txtBox.getText()+"2");break;
         case"3": txtBox.setText(txtBox.getText()+"3");break;
         case"4": txtBox.setText(txtBox.getText()+"4");break;
         case"5": txtBox.setText(txtBox.getText()+"5");break;
         case"6": txtBox.setText(txtBox.getText()+"6");break;
         case"7": txtBox.setText(txtBox.getText()+"7");break;
         case"8": txtBox.setText(txtBox.getText()+"8");break;
         case"9": txtBox.setText(txtBox.getText()+"9");break;
         case".": txtBox.setText(txtBox.getText()+".");break;
    }
    }

    @FXML
      void arthOp(ActionEvent event) { 
          
       if( ((Button)event.getSource()).getText().equals("+"))
       {
          if(crntArth0pt.equals("DEFAULT"))
          {
           opd1=txtBox.getText();
           crntArth0pt="ADD";
           txtBox.clear();
          }
       }
       else if( ((Button)event.getSource()).getText().equals("-")) 
       {
           if(crntArth0pt.equals("DEFAULT"))
          {
           opd1=txtBox.getText();
           crntArth0pt="SUBTRACT";
           txtBox.clear();
          }
       }
        
         else if( ((Button)event.getSource()).getText().equals("*")) 
       {
           if(crntArth0pt.equals("DEFAULT"))
          {
           opd1=txtBox.getText();
           crntArth0pt="MULTIPLY";
           txtBox.clear();
          }
       }
         
        else 
       {
           if(crntArth0pt.equals("DEFAULT"))
          {
           opd1=txtBox.getText();
           crntArth0pt="DIVIDE";
           txtBox.clear();
          }
       }
    }
      
    
    
    
    @FXML
    void processOprtn(ActionEvent event) {
        
        double num1 = Double.parseDouble(opd1);
        double num2 = Double.parseDouble(txtBox.getText());    
        if(crntArth0pt.equals("ADD"))
        {
            
                txtBox.setText( "" + (num1+num2));
        }
        else if(crntArth0pt.equals("SUBTRACT"))
        {
            txtBox.setText("" + (num1*num2));
        }
       
        else if(crntArth0pt.equals("MULTIPLY"))
        {
            txtBox.setText("" + (num1*num2));
        }
                
                
         else
         {
          if(num2==0)
          {
           txtBox.setText("DIVISION BY ZERO ERROR"); 
          
          }
          
          else{
             txtBox.setText("" + (num1/num2));      
          }
                  
         }
         }
        }
    

