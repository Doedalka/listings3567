import java.io.PrintStream;
public class ShowBits {
    private  int numbits;
    public  ShowBits(int numbits) {
        this.numbits = numbits;
    }
    public  String getBinaruForm(long val) {
        long mask = 1;
        String form = "";
        mask <<= numbits - 1;
        int spacer = 0;
        for (; mask != 0; mask >>>= 1) {
            if ((val & mask) != 0) {
                form += "1";
            } else {
                form += "0";
            }
            spacer++;
            if ((spacer % 8) == 0) {
                form += " ";
                spacer = 0;
            }
        } // for
        return form;
    }
    public  void show(long  val, PrintStream out) {
        String binaryForm = getBinaruForm(val);
        out.println(binaryForm);
    }
}
