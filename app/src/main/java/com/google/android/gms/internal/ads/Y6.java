package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class Y6 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f20210a;

    /* renamed from: b, reason: collision with root package name */
    public final G6 f20211b;

    /* renamed from: c, reason: collision with root package name */
    public final zzapv f20212c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f20213d;

    private Y6(zzapv zzapvVar) {
        this.f20213d = false;
        this.f20210a = null;
        this.f20211b = null;
        this.f20212c = zzapvVar;
    }

    public static Y6 a(zzapv zzapvVar) {
        return new Y6(zzapvVar);
    }

    public static Y6 b(Object obj, G6 g62) {
        return new Y6(obj, g62);
    }

    public final boolean c() {
        return this.f20212c == null;
    }

    private Y6(Object obj, G6 g62) {
        this.f20213d = false;
        this.f20210a = obj;
        this.f20211b = g62;
        this.f20212c = null;
    }
}
