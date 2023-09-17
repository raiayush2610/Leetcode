class Solution {
    public double[] convertTemperature(double celsius) {
        double k= celsius +273.15;
        double f = (celsius *1.80) +32;
        double a[] = new double [2];
        a[0]= k;
        a[1]=f;
        return a;
        
    }
}