package com.google.firebase.installations;

import com.google.firebase.FirebaseException;

/* loaded from: classes2.dex */
public class FirebaseInstallationsException extends FirebaseException {

    /* renamed from: o, reason: collision with root package name */
    private final a f32798o;

    public enum a {
        BAD_CONFIG,
        UNAVAILABLE,
        TOO_MANY_REQUESTS
    }

    public FirebaseInstallationsException(a aVar) {
        this.f32798o = aVar;
    }

    public FirebaseInstallationsException(String str, a aVar) {
        super(str);
        this.f32798o = aVar;
    }
}
