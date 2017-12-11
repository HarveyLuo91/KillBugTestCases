package java.androidAnnotations;

//import android.support.annotation.Nullable;

import fakeAnnotations.android.support.annotation.Nullable;

public class UncheckedNullableReturn {
    @Nullable
    String foo() {
        return null;
    }

    void bar() {
        System.out.println(foo().hashCode());
    }
}
