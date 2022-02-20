package Control;

public class Validaciones {

    public static boolean validarStrings(String... valor){
        for (String item: valor){
            if(item == null || item.equals("")){
                return false;
            }
        }
        return true;
    }
}
