import java.io.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class PreciosFactura {

    private DatosFactura datosFactura;

    private List<Linea> processInputFile(String inputFilePath) {
        List<Linea> inputList = new ArrayList<Linea>();
        String anterior="";
        try{
            File inputF = new File(inputFilePath);
            InputStream inputFS = new FileInputStream(inputF);
            BufferedReader br = new BufferedReader(new InputStreamReader(inputFS));
            // skip the header of the csv
            br.lines().skip(1).map(mapToItem);

            br.close();
        } catch (IOException e) {
              e.printStackTrace();
        }
        return inputList ;
    }

    private Function<String, Linea> mapToItem = (line) -> {
        String[] p = line.split(",");// a CSV has comma separated lines
        Linea item=new Linea();
        if (p[0] != null && p[0].trim().length() > 0 && p[0].indexOf("C")!=-1) {
            item.setNroInvoice(p[0]);
        }
        if (p[3] != null && p[3].trim().length() > 0 ) {
            item.setCantidad(new Integer(p[3]));
        }
        if (p[4] != null && p[4].trim().length() > 0 ) {
            item.setHora(p[4]);
        }
        if (p[5] != null && p[5].trim().length() > 0 ) {
            item.setPrecio(new BigDecimal(p[5]));
        }
        //more initialization goes here
        return procesa(item);
    };


    private Linea procesa(Linea valor){

        return null;
    }

    public static void main(String[] args) {

        System.out.println("Hello World!");
    }
}
