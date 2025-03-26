package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import java.io.IOException;

/* loaded from: classes.dex */
public final class zzib extends zzbd {

    /* renamed from: t, reason: collision with root package name */
    public final int f28767t;

    /* renamed from: u, reason: collision with root package name */
    public final String f28768u;

    /* renamed from: v, reason: collision with root package name */
    public final int f28769v;

    /* renamed from: w, reason: collision with root package name */
    public final D f28770w;

    /* renamed from: x, reason: collision with root package name */
    public final int f28771x;

    /* renamed from: y, reason: collision with root package name */
    public final GG0 f28772y;

    /* renamed from: z, reason: collision with root package name */
    final boolean f28773z;

    static {
        Integer.toString(1001, 36);
        Integer.toString(1002, 36);
        Integer.toString(1003, 36);
        Integer.toString(1004, 36);
        Integer.toString(1005, 36);
        Integer.toString(1006, 36);
    }

    private zzib(int i8, Throwable th, int i9) {
        this(i8, th, null, i9, null, -1, null, 4, false);
    }

    public static zzib b(Throwable th, String str, int i8, D d8, int i9, boolean z7, int i10) {
        return new zzib(1, th, null, i10, str, i8, d8, d8 == null ? 4 : i9, z7);
    }

    public static zzib c(IOException iOException, int i8) {
        return new zzib(0, iOException, i8);
    }

    public static zzib d(RuntimeException runtimeException, int i8) {
        return new zzib(2, runtimeException, i8);
    }

    final zzib a(GG0 gg0) {
        String message = getMessage();
        int i8 = AbstractC2301cW.f21206a;
        return new zzib(message, getCause(), this.f28754o, this.f28767t, this.f28768u, this.f28769v, this.f28770w, this.f28771x, gg0, this.f28755s, this.f28773z);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    private zzib(int i8, Throwable th, String str, int i9, String str2, int i10, D d8, int i11, boolean z7) {
        String str3;
        String str4;
        if (i8 == 0) {
            str3 = "Source error";
        } else if (i8 != 1) {
            str3 = "Unexpected runtime error";
        } else {
            String valueOf = String.valueOf(d8);
            int i12 = AbstractC2301cW.f21206a;
            if (i11 == 0) {
                str4 = "NO";
            } else if (i11 == 1) {
                str4 = "NO_UNSUPPORTED_TYPE";
            } else if (i11 == 2) {
                str4 = "NO_UNSUPPORTED_DRM";
            } else if (i11 == 3) {
                str4 = "NO_EXCEEDS_CAPABILITIES";
            } else {
                if (i11 != 4) {
                    throw new IllegalStateException();
                }
                str4 = "YES";
            }
            str3 = str2 + " error, index=" + i10 + ", format=" + valueOf + ", format_supported=" + str4;
        }
        this(TextUtils.isEmpty(null) ? str3 : str3.concat(": null"), th, i9, i8, str2, i10, d8, i11, null, SystemClock.elapsedRealtime(), z7);
    }

    private zzib(String str, Throwable th, int i8, int i9, String str2, int i10, D d8, int i11, GG0 gg0, long j8, boolean z7) {
        int i12;
        boolean z8;
        super(str, th, i8, Bundle.EMPTY, j8);
        if (z7) {
            i12 = i9;
            if (i12 == 1) {
                i12 = 1;
                z8 = true;
            } else {
                z8 = false;
            }
        } else {
            i12 = i9;
            z8 = true;
        }
        AbstractC3796qC.d(z8);
        AbstractC3796qC.d(th != null);
        this.f28767t = i12;
        this.f28768u = str2;
        this.f28769v = i10;
        this.f28770w = d8;
        this.f28771x = i11;
        this.f28772y = gg0;
        this.f28773z = z7;
    }
}
