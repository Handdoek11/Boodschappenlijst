package com.google.firebase;

import Z2.r;

/* loaded from: classes2.dex */
public class FirebaseException extends Exception {
    @Deprecated
    protected FirebaseException() {
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FirebaseException(String str) {
        super(str);
        r.g(str, "Detail message must not be empty");
    }
}
