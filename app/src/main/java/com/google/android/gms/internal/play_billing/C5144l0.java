package com.google.android.gms.internal.play_billing;

import java.io.Serializable;
import java.util.Set;

/* renamed from: com.google.android.gms.internal.play_billing.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5144l0 extends AbstractC5223z implements Serializable {

    /* renamed from: s, reason: collision with root package name */
    private static final C5144l0 f29940s;

    /* renamed from: t, reason: collision with root package name */
    private static final C5144l0 f29941t;

    /* renamed from: o, reason: collision with root package name */
    private final transient AbstractC5114g0 f29942o;

    static {
        int i8 = AbstractC5114g0.f29907t;
        f29940s = new C5144l0(D0.f29684w);
        f29941t = new C5144l0(AbstractC5114g0.t(A0.a()));
    }

    C5144l0(AbstractC5114g0 abstractC5114g0) {
        this.f29942o = abstractC5114g0;
    }

    static C5144l0 b() {
        return f29941t;
    }

    public static C5144l0 c() {
        return f29940s;
    }

    @Override // com.google.android.gms.internal.play_billing.C0
    public final /* bridge */ /* synthetic */ Set a() {
        return this.f29942o.isEmpty() ? J0.f29771z : new K0(this.f29942o, C5224z0.f30039o);
    }
}
