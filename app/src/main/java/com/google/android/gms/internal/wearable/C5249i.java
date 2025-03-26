package com.google.android.gms.internal.wearable;

import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.i, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5249i extends AbstractC5258m0 implements J0 {
    private static final C5249i zzb;
    private byte zze = 2;
    private InterfaceC5267r0 zzd = AbstractC5258m0.n();

    static {
        C5249i c5249i = new C5249i();
        zzb = c5249i;
        AbstractC5258m0.u(C5249i.class, c5249i);
    }

    private C5249i() {
    }

    public static C1 C() {
        return (C1) zzb.g();
    }

    public static C5249i E(byte[] bArr, C5238d0 c5238d0) {
        return (C5249i) AbstractC5258m0.j(zzb, bArr, c5238d0);
    }

    static /* synthetic */ void G(C5249i c5249i, Iterable iterable) {
        InterfaceC5267r0 interfaceC5267r0 = c5249i.zzd;
        if (!interfaceC5267r0.a()) {
            c5249i.zzd = AbstractC5258m0.o(interfaceC5267r0);
        }
        C.c(iterable, c5249i.zzd);
    }

    public final List F() {
        return this.zzd;
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5258m0
    protected final Object e(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zze);
        }
        if (i9 == 2) {
            return AbstractC5258m0.q(zzb, "\u0001\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0001\u0001Л", new Object[]{"zzd", C5245g.class});
        }
        if (i9 == 3) {
            return new C5249i();
        }
        AbstractC5247h abstractC5247h = null;
        if (i9 == 4) {
            return new C1(abstractC5247h);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zze = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
