package  telran;

import static telran.Calculator.*;
import static telran.Dialog.getParameter;
import static telran.Dialog.operationChoice;

public class Main {
    public static void main(String[] args) {
        double a = getParameter();
        double b = getParameter();

        int operation = operationChoice();

        calculation(a,b,operation);
    }
}