package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public class zzdvy extends Exception {

    /* renamed from: o, reason: collision with root package name */
    private final int f28759o;

    public zzdvy(int i8) {
        this.f28759o = i8;
    }

    public final int a() {
        return this.f28759o;
    }

    public zzdvy(int i8, String str) {
        super(str);
        this.f28759o = i8;
    }

    public zzdvy(int i8, String str, Throwable th) {
        super(str, th);
        this.f28759o = 1;
    }
}
