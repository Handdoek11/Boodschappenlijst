package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

/* renamed from: com.google.android.gms.internal.ads.fu0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2672fu0 extends AbstractC2781gu0 {

    /* renamed from: o, reason: collision with root package name */
    private int f22158o = 0;

    /* renamed from: s, reason: collision with root package name */
    private final int f22159s;

    /* renamed from: t, reason: collision with root package name */
    final /* synthetic */ AbstractC3542nu0 f22160t;

    C2672fu0(AbstractC3542nu0 abstractC3542nu0) {
        this.f22160t = abstractC3542nu0;
        this.f22159s = abstractC3542nu0.j();
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f22158o < this.f22159s;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2997iu0
    public final byte zza() {
        int i8 = this.f22158o;
        if (i8 >= this.f22159s) {
            throw new NoSuchElementException();
        }
        this.f22158o = i8 + 1;
        return this.f22160t.d(i8);
    }
}
