package com.google.mlkit.common;

import Z2.r;

/* loaded from: classes2.dex */
public class MlKitException extends Exception {

    /* renamed from: o, reason: collision with root package name */
    private final int f33057o;

    public MlKitException(String str, int i8) {
        super(r.g(str, "Provided message must not be empty."));
        this.f33057o = i8;
    }

    public int a() {
        return this.f33057o;
    }

    public MlKitException(String str, int i8, Throwable th) {
        super(r.g(str, "Provided message must not be empty."), th);
        this.f33057o = i8;
    }
}
