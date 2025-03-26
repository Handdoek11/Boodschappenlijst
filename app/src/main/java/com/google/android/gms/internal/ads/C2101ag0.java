package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.ag0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C2101ag0 extends AbstractC2753gg0 {

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ AbstractC1268Ef0 f20741w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C2101ag0(C2210bg0 c2210bg0, C2970ig0 c2970ig0, CharSequence charSequence, AbstractC1268Ef0 abstractC1268Ef0) {
        super(c2970ig0, charSequence);
        this.f20741w = abstractC1268Ef0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2753gg0
    public final int b(int i8) {
        return ((C1412If0) this.f20741w).f15978a.end();
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2753gg0
    public final int c(int i8) {
        if (((C1412If0) this.f20741w).f15978a.find(i8)) {
            return ((C1412If0) this.f20741w).f15978a.start();
        }
        return -1;
    }
}
