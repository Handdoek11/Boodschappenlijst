package com.google.android.gms.internal.ads;

import java.util.concurrent.TimeoutException;

/* renamed from: com.google.android.gms.internal.ads.zk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4829zk0 extends TimeoutException {
    /* synthetic */ C4829zk0(String str, Ak0 ak0) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
