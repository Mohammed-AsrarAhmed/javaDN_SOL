class FinancialForecasting {

    public static double forecast(double amnt, double rate, int years) {
        if (years == 0) {
            return amnt; 
        }
        return forecast(amnt * (rate+1), rate, years - 1);  
    }

    public static void main(String[] args) {
        double currentValue = 5000;  
        double growthRate = 0.10;     
        int years = 4;                

        double result = forecast(currentValue, growthRate, years);
        System.out.println("Future value after " + years + " years: " + result);
    }
}