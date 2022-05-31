
import java.util.List ;

public class WarrantyUtils {
    public static void getProductWarrantyIssues(List<Warranty> warrantyList) {
        for (Warranty warranty : warrantyList) {
            System.out.println(warranty.toString());
        }
    }
}
