package java.jcipAnnotations;

import javax.annotation.concurrent.Immutable;

import edu.umd.cs.findbugs.annotations.ExpectWarning;
import edu.umd.cs.findbugs.annotations.NoWarning;

@Immutable
public class TestImmutable2 {
    @NoWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
    final int x = 0;

    @ExpectWarning("JCIP_FIELD_ISNT_FINAL_IN_IMMUTABLE_CLASS")
    int y;
}
