package com.google.android.gms.internal.play_billing;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.play_billing.j2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5134j2 extends AbstractC5140k2 {

    /* renamed from: o, reason: collision with root package name */
    private int f29922o = 0;

    /* renamed from: s, reason: collision with root package name */
    private final int f29923s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ AbstractC5176q2 f29924t;

    C5134j2(AbstractC5176q2 abstractC5176q2) {
        this.f29924t = abstractC5176q2;
        this.f29923s = abstractC5176q2.d();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f29922o < this.f29923s;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5152m2
    public final byte zza() {
        int i8 = this.f29922o;
        if (i8 >= this.f29923s) {
            throw new NoSuchElementException();
        }
        this.f29922o = i8 + 1;
        return this.f29924t.c(i8);
    }
}
