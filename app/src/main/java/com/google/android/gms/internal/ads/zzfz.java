package com.google.android.gms.internal.ads;

import java.io.IOException;

/* loaded from: classes.dex */
public class zzfz extends IOException {

    /* renamed from: o, reason: collision with root package name */
    public final int f28763o;

    public zzfz(int i8) {
        this.f28763o = i8;
    }

    public zzfz(String str, int i8) {
        super(str);
        this.f28763o = i8;
    }

    public zzfz(String str, Throwable th, int i8) {
        super(str, th);
        this.f28763o = i8;
    }

    public zzfz(Throwable th, int i8) {
        super(th);
        this.f28763o = i8;
    }
}
