
public class Calculator {
    /*
    AddOperation addoper=new AddOperation();
    SubstractOperation suboper=new SubstractOperation();
    MultiplyOperation multioper=new MultiplyOperation();
    DivideOperation divideoper=new DivideOperation();
     */

    AbstractOperation add=new AddOperation();
    AbstractOperation subs=new SubstractOperation();
    AbstractOperation multiple=new MultiplyOperation();
    AbstractOperation divide=new DivideOperation();

        double calculate(int firstNumber, String operator, int secondNumber) {
            double result = 0;
            if (operator.equals("+")) {
                /*
                result=firstNumber+secondNumber;
                System.out.println(firstNumber+"+"+secondNumber+"="+result);
                 */
                /*
                System.out.println(addoper.plus(firstNumber, secondNumber));
                 */
                System.out.println(add.operate(firstNumber, secondNumber));

            }
            else if (operator.equals("-")) {
                /*
                result=firstNumber-secondNumber;
                System.out.println(firstNumber+"-"+secondNumber+"="+result);

                 */
                /*
                System.out.println(suboper.minus(firstNumber, secondNumber));
                 */
                System.out.println(subs.operate(firstNumber, secondNumber));
            }
            else if (operator.equals("*")) {
                /*
                result=firstNumber*secondNumber;
                System.out.println(firstNumber+"*"+secondNumber+"="+result);

                 */
                /*
                System.out.println(multioper.multiple(firstNumber, secondNumber));
                 */
                System.out.println(multiple.operate(firstNumber, secondNumber));
            }
            else if (operator.equals("/")) {
                /*
                result=firstNumber/secondNumber;
                System.out.println(firstNumber+"/"+secondNumber+"="+result);

                 */
                /*
                System.out.println(divideoper.divide(firstNumber, secondNumber));
                 */
                System.out.println(divide.operate(firstNumber, secondNumber));
            }
            else if (operator.equals("%")) {
                result=firstNumber%secondNumber;
                System.out.println(firstNumber+"%"+secondNumber+"="+result);
            }
            else{
                System.out.println("Invalid operator");
            }
            return result;

        }
}


