package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.uD0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4234uD0 {

    /* renamed from: d, reason: collision with root package name */
    public static final C4234uD0 f27009d = new C4016sD0().d();

    /* renamed from: a, reason: collision with root package name */
    public final boolean f27010a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f27011b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f27012c;

    /* synthetic */ C4234uD0(C4016sD0 c4016sD0, AbstractC4125tD0 abstractC4125tD0) {
        this.f27010a = c4016sD0.f26607a;
        this.f27011b = c4016sD0.f26608b;
        this.f27012c = c4016sD0.f26609c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C4234uD0.class == obj.getClass()) {
            C4234uD0 c4234uD0 = (C4234uD0) obj;
            if (this.f27010a == c4234uD0.f27010a && this.f27011b == c4234uD0.f27011b && this.f27012c == c4234uD0.f27012c) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        boolean z7 = this.f27010a;
        boolean z8 = this.f27011b;
        return ((z7 ? 1 : 0) << 2) + (z8 ? 1 : 0) + (z8 ? 1 : 0) + (this.f27012c ? 1 : 0);
    }
}
