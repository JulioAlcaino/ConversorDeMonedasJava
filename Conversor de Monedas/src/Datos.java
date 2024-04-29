public class Datos {

    String base_code;
    String target_code;
    Double conversion_result;


    public Datos(String base_code, String target_code, Double conversion_result) {
        this.base_code = base_code;
        this.target_code = target_code;
        this.conversion_result = conversion_result;
    }

    @Override
    public String toString() {
        return "Resultado : \n" +
                "Moneda Inicial = " + base_code + " \n" +
                "Moneda final = " + target_code  + " \n" +
                "Resultado = " + conversion_result + " " +
                target_code;
    }
}
