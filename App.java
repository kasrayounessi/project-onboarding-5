import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class App {

    public static String actualMemorySize(String memory){
        Pattern pattern = Pattern.compile("\\D");
        Matcher matcher = pattern.matcher(memory);
        Double storage =  0.0;
        String unit = "";
        String result = "";
        if(matcher.find()){
            storage = Double.parseDouble(memory.substring(0, matcher.start()));
            unit = memory.substring(matcher.start(), matcher.end()+1);
        }
        storage = storage * 0.93;
        if(storage < 1 && unit.equals("GB")){
            storage *= 1000;
            unit = "MB";
        }
        result = storage + unit;

        if(unit.equals("MB") && storage % 1 != 0){
            result = Math.round(storage) + unit;
        }
        return result;
    }

    public static void main(String[] args) {

        System.out.println(App.actualMemorySize("32GB"));
        System.out.println(App.actualMemorySize("2GB"));
        System.out.println(App.actualMemorySize("512MB"));

    }
}
