package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class zzgp extends IOException {
    zzgp() {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.");
    }

    zzgp(long j8, long j9, int i8, Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.format(Locale.US, "Pos: %d, limit: %d, len: %d", Long.valueOf(j8), Long.valueOf(j9), Integer.valueOf(i8))), th);
    }

    zzgp(Throwable th) {
        super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
    }
}
