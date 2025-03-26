package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
final class F2 extends Throwable {
    F2(String str) {
        super("Failure occurred while trying to finish a future.");
    }

    @Override // java.lang.Throwable
    public final synchronized Throwable fillInStackTrace() {
        return this;
    }
}
