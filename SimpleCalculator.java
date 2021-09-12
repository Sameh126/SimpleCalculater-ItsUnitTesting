package tudelft.SimpleCalculator;

import java.util.Scanner;

public class SimpleCalculator
{
    public static int Sum(int OperandOne , int OperandTwo)
    {
        return OperandOne + OperandTwo;
    }

    public static int Sub(int OperandOne , int OperandTwo)
    {
        return OperandOne - OperandTwo;
    }

    public static int Multiple(int OperandOne , int OperandTwo)
    {
        return OperandOne * OperandTwo;
    }

    public static int Divide(int OperandOne , int OperandTwo)
    {
        //Protection
        if (OperandTwo == 0)
        {
            return 0000;
        }
        else
        {
            return OperandOne / OperandTwo;
        }
    }
    public static void main (String[] args)
    {
        int Result ;
        Scanner Input = new Scanner(System.in);

        System.out.println("Please Enter Operation Number: ");
        int OperationNum = Input.nextInt();

        System.out.println("Please Enter Operand One: ");
        int Operand_1 = Input.nextInt();

        System.out.println("Please Enter Operand Two: ");
        int Operand_2 = Input.nextInt();

        switch (OperationNum)
        {
            case 1:
                Result = Sum(Operand_1 , Operand_2);
                System.out.println("Result = " + Result);
                break;

            case 2:
                Result = Sub(Operand_1 , Operand_2);
                System.out.println("Result = " + Result);
                break;

            case 3:
                Result = Multiple(Operand_1 , Operand_2);
                System.out.println("Result = " + Result);
                break;

            case 4:
                Result = Divide(Operand_1 , Operand_2);
                System.out.println("Result = " + Result);
                break;

            default:
                System.out.println("Sorry This Operation is not available in this version, Soon There will be more operations");

        }

    }
}
