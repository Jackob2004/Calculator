package main;

public class Calculator {
    private MyFrame frame;

    private Integer a=null,b=null,x =0;
    String number = "";

    String calculations = "";

    char operation = ' ';
    public Calculator(MyFrame frame){
        this.frame = frame;
    }

    public void getNumber(String input){
        number += input;
        frame.getLabel().setText(number);

        if(a != null && operation == ' ') a = null;
    }

    public void getOperation(char operation){ // write it again
        this.operation = operation;

        if(number.isEmpty() || a != null) return;

        a = Integer.parseInt(number);
        number = "";

    }

    public void result(){
        if(number.isEmpty() || a == null) return;
        b = Integer.parseInt(number);
        number = "";
        switch (operation){
            case '+':
                 x = a+b;
                 calculate();
                break;
            case '-':
                x = a-b;
                calculate();
                break;
            case 'x':
                x = a*b;
                calculate();
                break;
            case '/':
                if (b==0) {
                    frame.getLabel().setText("cannot divide by 0");
                    return;
                }
                x = a/b;
                calculate();
                break;
        }
        frame.getLabel().setText(calculations);
        operation = ' ';
    }

    public void reset(){
        a = null;
        b = null;
        x = 0;
        frame.getLabel().setText(String.valueOf(x));
    }

    public void calculate( ){
        calculations = String.valueOf(a + " " + operation + " " + b + " = " + x);
        a=x;
        b=null;
        frame.getLabel().setText(String.valueOf(x));
    }
}
