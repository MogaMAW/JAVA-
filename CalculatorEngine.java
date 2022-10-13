package ClassLecture;

public class CalculatorEngine {
    int value;
    int keep;
    char toDo;
    void add(){
        binaryOperation('+');
    }
    void subtract(){
        binaryOperation('-');
    }
    void multiply(){
        binaryOperation('*');
    }
    void divide(){
        binaryOperation('/');
    }
    void compute(){
        if (toDo == '+'){
            value = keep + value;
        }
        else if (toDo == '-'){
            value = keep - value;
        }
        else if (toDo == '*'){
            value = keep * value;
        }
        else if (toDo == '/'){
            value = keep / value;
        }
        keep = 0;
    }
    void clear(){
        value = 0;
        keep = 0;
    }
    void digit(int x){
       value = value * 10 + x;
    }
    int display(){
        return (value);
    }
    void binaryOperation(char op){
        keep = value;// keeps first operand
        value = 0;//intialise and gets ready for second operand 
        toDo = op;
    }
    CalculatorEngine () {
        clear();
    }
    public static void main(String[] args) {
        CalculatorEngine c;
        c = new CalculatorEngine();
        c.digit(1);
        c.digit(3);
        c.add();
        c.digit(1);
        c.digit(1);
        c.compute();
        System.out.println("The result is : " + c.display());
        c.clear();
        System.out.println("The result is : " + c.display());
    }

}
