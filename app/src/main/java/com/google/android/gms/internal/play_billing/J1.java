package com.google.android.gms.internal.play_billing;

import java.util.concurrent.TimeoutException;

/* loaded from: classes2.dex */
final class J1 extends TimeoutException {
    /* synthetic */ J1(String str, K1 k12) {
        super(str);
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }
}
