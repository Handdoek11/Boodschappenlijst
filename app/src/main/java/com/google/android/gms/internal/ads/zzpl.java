package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class zzpl extends Exception {

    /* renamed from: o, reason: collision with root package name */
    public final int f28777o;

    /* renamed from: s, reason: collision with root package name */
    public final boolean f28778s;

    /* renamed from: t, reason: collision with root package name */
    public final D f28779t;

    public zzpl(int i8, D d8, boolean z7) {
        super("AudioTrack write failed: " + i8);
        this.f28778s = z7;
        this.f28777o = i8;
        this.f28779t = d8;
    }
}
