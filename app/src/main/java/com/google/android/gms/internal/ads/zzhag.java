package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzhag extends RuntimeException {
    public zzhag(InterfaceC3871qv0 interfaceC3871qv0) {
        super("Message was missing required fields.  (Lite runtime could not determine which fields were missing).");
    }

    public final zzgyg a() {
        return new zzgyg(getMessage());
    }
}
