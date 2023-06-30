package rocks.zipcode;

public class PayDay {

    public String pay(String name, double hourlyRate, double hoursWorked, double deductionRate){
        double grossPay;
        double deduction;
        double netPay;
        grossPay = hourlyRate * hoursWorked;
        deduction = grossPay * deductionRate;
        netPay = grossPay - deduction;
        String result = "";
        result = result.format("%s %.2f %.2f %.2f", name, grossPay, deduction, netPay);
        return result;
    }
}
