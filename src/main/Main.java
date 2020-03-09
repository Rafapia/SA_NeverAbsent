package main;


public class Main {

    public static void main(String[] args) {

        CSVHandler<String> csvHandler = new CSVHandler("src/main/cars93.csv");

        int data = (Integer) (csvHandler.getCell("RPM", 0, new String[][]{{"Manufacturer", "Ford"}, {"Model", "Taurus"}}));

        System.out.println(data);
    }
}
