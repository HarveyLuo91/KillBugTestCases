package java.androidAnnotations;

//import android.support.annotation.Nullable;

import fakeAnnotations.android.support.annotation.Nullable;

public class CheckedNullableReturn {
    @Nullable
    String foo() {
        return null;
    }

    void bar() {
        String foo = foo();
        if (foo != null) {
            System.out.println(foo.hashCode());
        }
    }
}
