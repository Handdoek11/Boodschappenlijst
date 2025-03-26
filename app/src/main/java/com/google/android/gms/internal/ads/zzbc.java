package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzbc extends IOException {

    /* renamed from: o, reason: collision with root package name */
    public final boolean f28752o;

    /* renamed from: s, reason: collision with root package name */
    public final int f28753s;

    protected zzbc(String str, Throwable th, boolean z7, int i8) {
        super(str, th);
        this.f28752o = z7;
        this.f28753s = i8;
    }

    public static zzbc a(String str, Throwable th) {
        return new zzbc(str, th, true, 1);
    }

    public static zzbc b(String str, Throwable th) {
        return new zzbc(str, th, true, 0);
    }

    public static zzbc c(String str) {
        return new zzbc(str, null, false, 1);
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return super.getMessage() + " {contentIsMalformed=" + this.f28752o + ", dataType=" + this.f28753s + "}";
    }
}
