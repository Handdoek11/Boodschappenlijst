package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
public final class zzeo extends RuntimeException {
    public zzeo(I0 i02) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzcx a() {
        return new zzcx(getMessage());
    }
}
