package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes.dex */
public final class zzgwt extends IOException {
    zzgwt() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgwt(long j8, long j9, int i8, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j8), Long.valueOf(j9), Integer.valueOf(i8))), th);
    }

    zzgwt(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
