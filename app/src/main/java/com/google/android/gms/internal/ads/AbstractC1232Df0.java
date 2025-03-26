package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.Df0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1232Df0 implements InterfaceC1797Tf0 {
    protected AbstractC1232Df0() {
    }

    public static AbstractC1232Df0 c(char c8) {
        return new C1124Af0(c8);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC1797Tf0
    public final /* synthetic */ boolean a(Object obj) {
        return b(((Character) obj).charValue());
    }

    public abstract boolean b(char c8);
}
