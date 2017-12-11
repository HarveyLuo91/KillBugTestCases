package java.androidAnnotations;

//import android.support.annotation.NonNull;

import fakeAnnotations.android.support.annotation.NonNull;

public class NullForNonNullParam {
    static void foo(@NonNull Object o) {
    }

    static void bar() {
        foo(null);
    }
}
