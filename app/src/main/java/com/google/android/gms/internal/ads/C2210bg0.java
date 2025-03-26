package com.google.android.gms.internal.ads;

import java.util.Iterator;

/* renamed from: com.google.android.gms.internal.ads.bg0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2210bg0 implements InterfaceC2862hg0 {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ AbstractC1304Ff0 f20909a;

    C2210bg0(AbstractC1304Ff0 abstractC1304Ff0) {
        this.f20909a = abstractC1304Ff0;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2862hg0
    public final /* bridge */ /* synthetic */ Iterator a(C2970ig0 c2970ig0, CharSequence charSequence) {
        return new C2101ag0(this, c2970ig0, charSequence, this.f20909a.a(charSequence));
    }
}
