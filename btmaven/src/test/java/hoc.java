import static org.assertj.core.api.Java6Assertions.withinPercentage;
import static org.junit.jupiter.api.Assertions.*;
import static org.assertj.core.api.Assertions.withPrecision;
import org.assertj.core.api.AbstractDoubleAssert;
import org.assertj.core.data.Offset;
import org.junit.jupiter.api.*;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
public class hoc {
    @Test
    @DisplayName("hoc 1")
    public void case1()
    {
        String str[] = new String[]{"a","b"};
        assertThat(str).isNotEmpty().contains("b");
        assertThat(str).startsWith("a").hasSize(2);
    }
    @Test
    @DisplayName("HOC 2")
    public void case2()
    {
        String cau = "hôm nay e đi học sớm";
        String cau2= cau;
        assertThat(cau).contains("nay").isNotEmpty()
                .startsWith("hôm nay")
                .endsWith("sớm");
    }
    @Test
    @DisplayName("mang 2")
    public void mang()
    {
        double a = 12.0;
       assertThat(a).isEqualTo(12.2, withPrecision(1d));
       assertThat(a).isCloseTo(12.0, Offset.offset(5d));
       assertThat(a).isBetween(11.5, 12.9);// bằng
       assertThat(a).isStrictlyBetween(12.5,15.5);// không lấy bằng

    }
    @Test
    @DisplayName("kiem tra sdt")
    public void phone()
    {
        String num = "0988789000" ;
        assertThat(num).isNotEmpty().containsOnlyDigits().hasSize(10);
    }
}
