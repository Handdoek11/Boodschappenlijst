package com.google.android.gms.internal.play_billing;

/* loaded from: classes2.dex */
public final class zzji extends RuntimeException {
    public zzji(InterfaceC5123h3 interfaceC5123h3) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzhr a() {
        return new zzhr(getMessage());
    }
}
