package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5243f extends AbstractC5258m0 implements J0 {
    private static final C5243f zzb;
    private int zzd;
    private C5240e zzf;
    private byte zzg = 2;
    private int zze = 1;

    static {
        C5243f c5243f = new C5243f();
        zzb = c5243f;
        AbstractC5258m0.u(C5243f.class, c5243f);
    }

    private C5243f() {
    }

    public static E1 C() {
        return (E1) zzb.g();
    }

    public static C5243f F() {
        return zzb;
    }

    static /* synthetic */ void G(C5243f c5243f, C5240e c5240e) {
        c5240e.getClass();
        c5243f.zzf = c5240e;
        c5243f.zzd |= 2;
    }

    static /* synthetic */ void I(C5243f c5243f, int i8) {
        c5243f.zze = i8;
        c5243f.zzd |= 1;
    }

    public final C5240e D() {
        C5240e c5240e = this.zzf;
        return c5240e == null ? C5240e.S() : c5240e;
    }

    public final int H() {
        int a8 = AbstractC5234c.a(this.zze);
        if (a8 == 0) {
            return 1;
        }
        return a8;
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5258m0
    protected final Object e(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzg);
        }
        if (i9 == 2) {
            return AbstractC5258m0.q(zzb, "\u0001\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0002\u0001ᴌ\u0000\u0002ᐉ\u0001", new Object[]{"zzd", "zze", C5231b.f30116a, "zzf"});
        }
        if (i9 == 3) {
            return new C5243f();
        }
        AbstractC5247h abstractC5247h = null;
        if (i9 == 4) {
            return new E1(abstractC5247h);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzg = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
