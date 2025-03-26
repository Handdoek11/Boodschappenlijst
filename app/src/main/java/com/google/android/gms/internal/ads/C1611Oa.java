package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Oa, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1611Oa extends AbstractCallableC2524eb {

    /* renamed from: y, reason: collision with root package name */
    private final C2631fa f17898y;

    public C1611Oa(C3610oa c3610oa, String str, String str2, C2918i8 c2918i8, int i8, int i9, C2631fa c2631fa) {
        super(c3610oa, "nIerOxKbHFkrAwaPfnOcaC2yUxDu3vgr+V6+Lz8BbuDzBx+zj9iucf6iyn5uQniV", "dvq2wU3xdgVVjZT9gC/0PMuBLs8WhmySJmrq8zzkkwM=", c2918i8, i8, 94);
        this.f17898y = c2631fa;
    }

    @Override // com.google.android.gms.internal.ads.AbstractCallableC2524eb
    protected final void a() {
        int intValue = ((Integer) this.f21841v.invoke(null, this.f17898y.a())).intValue();
        synchronized (this.f21840u) {
            this.f21840u.h0(AbstractC4332v8.a(intValue));
        }
    }
}
