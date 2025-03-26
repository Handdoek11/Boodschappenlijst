package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* loaded from: classes.dex */
public final class B7 extends Ox0 implements Closeable {
    static {
        Vx0.b(B7.class);
    }

    public B7(Px0 px0, A7 a72) {
        h(px0, px0.a(), a72);
    }

    @Override // com.google.android.gms.internal.ads.Ox0, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
    }

    @Override // com.google.android.gms.internal.ads.Ox0
    public final String toString() {
        String obj = this.f18087s.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(obj).length() + 7);
        sb.append("model(");
        sb.append(obj);
        sb.append(")");
        return sb.toString();
    }
}
