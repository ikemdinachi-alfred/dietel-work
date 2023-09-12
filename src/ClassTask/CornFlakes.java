package ClassTask;

import java.util.Scanner;

public class CornFlakes {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);

        System.out.print(" Enter Employees Name: ");
        String employee= input.nextLine();
        System.out.print(" Enter Numbers of Hours worked in a week: ");
        double week= input.nextDouble();
        System.out.print(" Enter Hourly pay rate: ");
        double hour= input.nextFloat();



        double grossPay= hour*week;
        double fedWitholdings=0.2*grossPay;
        double stateWithholding= 0.09*grossPay;
        double deduction= fedWitholdings+stateWithholding;
        double netPay= grossPay-deduction;
        System.out.println("""
                
                
                
                """);



        System.out.println("Employee Name: "+ employee);
        System.out.println("Hour Worked: "+ week);
        System.out.println("pay Rate: $"+ hour);
        System.out.println("Gross pay: $" + grossPay);


        System.out.println("Deductions:");
        System.out.println("Federal Withholding (20.0%): $"+ fedWitholdings);
        System.out.println("Sate Withholding (9.0%): $"+ stateWithholding);
        System.out.println("Total Deduction: $" + deduction);
        System.out.println("Net pay: $"+ netPay);




    }

}
