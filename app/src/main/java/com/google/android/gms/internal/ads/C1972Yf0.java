package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Yf0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C1972Yf0 extends AbstractC2753gg0 {

    /* renamed from: w, reason: collision with root package name */
    final /* synthetic */ AbstractC1232Df0 f20298w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C1972Yf0(C2007Zf0 c2007Zf0, C2970ig0 c2970ig0, CharSequence charSequence, AbstractC1232Df0 abstractC1232Df0) {
        super(c2970ig0, charSequence);
        this.f20298w = abstractC1232Df0;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2753gg0
    final int b(int i8) {
        return i8 + 1;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2753gg0
    final int c(int i8) {
        CharSequence charSequence = this.f22417t;
        int length = charSequence.length();
        AbstractC1762Sf0.b(i8, length, "index");
        while (i8 < length) {
            if (this.f20298w.b(charSequence.charAt(i8))) {
                return i8;
            }
            i8++;
        }
        return -1;
    }
}
