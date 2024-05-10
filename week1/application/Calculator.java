package week1.application;

import week1.Process.Operations;
import week1.display.LiquidCrystalDisplay;

public class Calculator{
    public static void main(String[] args) {
        Operations o = new Operations();
        int result = o.add(10,15);

        LiquidCrystalDisplay lcd = new LiquidCrystalDisplay();
        lcd.showResult(result);
    }
}
