package calcproject;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
public class CALCGUIController {
private String crntArth0pt= "Add";
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
    private Label result;

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
    private TextField operand1;
    @FXML
    private TextField operand2;

    @FXML
    void AddNums(ActionEvent event) {
        
crntArth0pt= "ADD";

    }

    @FXML
    void MultiNums(ActionEvent event) {
crntArth0pt= "MULTIPLY";
    }

    @FXML
    void divideNums(ActionEvent event) {
crntArth0pt= "DIVIDE";
    }
    
    @FXML
    void subtractNums(ActionEvent event) {
crntArth0pt= "SUBTRACT";
    }
    
    @FXML
    void prcssNums(ActionEvent event) {
        if ( ((Button)event.getSource() ).getText().equals("1"))
         {
        operand1.setText(operand1.getText() +"1");
        }
        
        if ( ((Button)event.getSource() ).getText().equals("2"))
        {
        operand1.setText(operand1.getText()+"2");
        }
        
        if ( ((Button)event.getSource() ).getText().equals("3"))
        {
        operand1.setText(operand1.getText()+"3");
        }
        if ( ((Button)event.getSource() ).getText().equals("4"))
        {
        operand1.setText(operand1.getText()+"4");
        }
        if ( ((Button)event.getSource() ).getText().equals("5"))
        {
        operand1.setText(operand1.getText()+"5");
        }
        if ( ((Button)event.getSource() ).getText().equals("6"))
        {
        operand1.setText(operand1.getText()+"6");
        }
        if ( ((Button)event.getSource() ).getText().equals("7"))
        {
        operand1.setText(operand1.getText()+"7");
        }
        if ( ((Button)event.getSource() ).getText().equals("8"))
        {
        operand1.setText(operand1.getText()+"8");
        }
        if ( ((Button)event.getSource() ).getText().equals("9"))
        {
        operand1.setText(operand1.getText()+"9");
        }
        if ( ((Button)event.getSource() ).getText().equals("0"))
        {
        operand1.setText(operand1.getText()+"0");
        }
        
        
    }
    
   

    @FXML
    void processOprtn(ActionEvent event) {
        String opd1 = operand1.getText();
        String opd2 = operand2.getText();
        int num1 = Integer.parseInt(opd1);
        int num2 = Integer.parseInt(opd2);    
        if(crntArth0pt.equals("ADD"))
        {
            
                result.setText( "" + (num1+num2));
        }
        else if(crntArth0pt.equals("SUBTRACT"))
        {
            result.setText("" + (num1*num2));
        }
       
        else if(crntArth0pt.equals("MULTIPLY"))
        {
            result.setText("" + (num1*num2));
        }
                
                
         else
         {
          if(num2==0)
          {
           result.setText("DIVISION BY ZERO ERROR");   
          }
          
          else{
             result.setText("" + (num1/num2));      
          }
                  
         }
         }
        }
    

    


