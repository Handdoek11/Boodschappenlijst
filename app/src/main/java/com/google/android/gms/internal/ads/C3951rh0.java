package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.rh0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3951rh0 extends AbstractC3949rg0 {

    /* renamed from: t, reason: collision with root package name */
    private final AbstractC4169th0 f26213t;

    C3951rh0(AbstractC4169th0 abstractC4169th0, int i8) {
        super(abstractC4169th0.size(), i8);
        this.f26213t = abstractC4169th0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC3949rg0
    protected final Object a(int i8) {
        return this.f26213t.get(i8);
    }
}
