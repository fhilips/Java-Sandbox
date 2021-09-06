package datas;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormat {
    public static void main(String[] args) {
        Date dataAtual = new Date();
        System.out.println(dataAtual.toString());

        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");

        String dataFormatada = formatter.format(dataAtual);

        System.out.println(dataFormatada);
    }
}
