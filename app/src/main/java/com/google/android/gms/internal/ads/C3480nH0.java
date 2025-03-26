package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.nH0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3480nH0 implements FG0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC2646fh0 f24914a;

    /* renamed from: b, reason: collision with root package name */
    private int f24915b;

    /* renamed from: c, reason: collision with root package name */
    private final C3371mH0 f24916c;

    /* renamed from: d, reason: collision with root package name */
    private final VI0 f24917d;

    public C3480nH0(InterfaceC2646fh0 interfaceC2646fh0, C3371mH0 c3371mH0) {
        VI0 vi0 = new VI0(-1);
        this.f24914a = interfaceC2646fh0;
        this.f24916c = c3371mH0;
        this.f24917d = vi0;
        this.f24915b = 1048576;
    }

    public final C3480nH0 a(int i8) {
        this.f24915b = i8;
        return this;
    }

    public final C3698pH0 b(E7 e72) {
        e72.f14645b.getClass();
        return new C3698pH0(e72, this.f24914a, this.f24916c, RE0.f18624a, this.f24917d, this.f24915b, false, null, null);
    }
}
