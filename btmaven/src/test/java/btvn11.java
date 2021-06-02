import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import org.junit.Test;
import static org.assertj.core.api.Java6Assertions.assertThat;
public class btvn11 {

    @Test
    @DisplayName("email")
    public void email()
    {
        String mail = "kimchuyen@gmial.com";
        assertThat(mail).isNotEmpty()
                .containsOnlyOnce("@").containsOnlyOnce(".")
                .doesNotContain("$").doesNotContain("%").doesNotContain("^").doesNotContain("&").doesNotContain("*")
                .doesNotEndWith(".").doesNotEndWith("@")
                .doesNotStartWith(".").doesNotStartWith("@");
    }
    @Test
    @DisplayName("can nang")
    public void cannang()
    {
        double cn = 12.5;
        assertThat(cn).isNotNull()
                .isGreaterThan(0.0);

    }
}
