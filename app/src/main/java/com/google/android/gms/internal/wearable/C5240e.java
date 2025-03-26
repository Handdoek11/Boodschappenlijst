package com.google.android.gms.internal.wearable;

import java.util.List;

/* renamed from: com.google.android.gms.internal.wearable.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5240e extends AbstractC5258m0 implements J0 {
    private static final C5240e zzb;
    private int zzd;
    private double zzg;
    private float zzh;
    private long zzi;
    private int zzj;
    private int zzk;
    private boolean zzl;
    private long zzr;
    private byte zzs = 2;
    private Q zze = Q.f30081s;
    private String zzf = "";
    private InterfaceC5267r0 zzm = AbstractC5258m0.n();
    private InterfaceC5267r0 zzn = AbstractC5258m0.n();
    private InterfaceC5267r0 zzo = AbstractC5258m0.n();
    private InterfaceC5266q0 zzp = AbstractC5258m0.l();
    private InterfaceC5264p0 zzq = AbstractC5258m0.k();

    static {
        C5240e c5240e = new C5240e();
        zzb = c5240e;
        AbstractC5258m0.u(C5240e.class, c5240e);
    }

    private C5240e() {
    }

    static /* synthetic */ void C(C5240e c5240e, double d8) {
        c5240e.zzd |= 4;
        c5240e.zzg = d8;
    }

    static /* synthetic */ void D(C5240e c5240e, float f8) {
        c5240e.zzd |= 8;
        c5240e.zzh = f8;
    }

    static /* synthetic */ void E(C5240e c5240e, int i8) {
        c5240e.zzd |= 32;
        c5240e.zzj = i8;
    }

    static /* synthetic */ void F(C5240e c5240e, long j8) {
        c5240e.zzd |= 16;
        c5240e.zzi = j8;
    }

    static /* synthetic */ void G(C5240e c5240e, String str) {
        c5240e.zzd |= 2;
        c5240e.zzf = str;
    }

    public static C5237d Q() {
        return (C5237d) zzb.g();
    }

    public static C5240e S() {
        return zzb;
    }

    static /* synthetic */ void a0(C5240e c5240e, Iterable iterable) {
        InterfaceC5267r0 interfaceC5267r0 = c5240e.zzm;
        if (!interfaceC5267r0.a()) {
            c5240e.zzm = AbstractC5258m0.o(interfaceC5267r0);
        }
        C.c(iterable, c5240e.zzm);
    }

    static /* synthetic */ void b0(C5240e c5240e, Iterable iterable) {
        InterfaceC5264p0 interfaceC5264p0 = c5240e.zzq;
        if (!interfaceC5264p0.a()) {
            int size = interfaceC5264p0.size();
            c5240e.zzq = interfaceC5264p0.f(size + size);
        }
        C.c(iterable, c5240e.zzq);
    }

    static /* synthetic */ void c0(C5240e c5240e, Iterable iterable) {
        InterfaceC5266q0 interfaceC5266q0 = c5240e.zzp;
        if (!interfaceC5266q0.a()) {
            int size = interfaceC5266q0.size();
            c5240e.zzp = interfaceC5266q0.f(size + size);
        }
        C.c(iterable, c5240e.zzp);
    }

    static /* synthetic */ void d0(C5240e c5240e, Iterable iterable) {
        InterfaceC5267r0 interfaceC5267r0 = c5240e.zzo;
        if (!interfaceC5267r0.a()) {
            c5240e.zzo = AbstractC5258m0.o(interfaceC5267r0);
        }
        C.c(iterable, c5240e.zzo);
    }

    static /* synthetic */ void e0(C5240e c5240e, C5243f c5243f) {
        c5243f.getClass();
        InterfaceC5267r0 interfaceC5267r0 = c5240e.zzn;
        if (!interfaceC5267r0.a()) {
            c5240e.zzn = AbstractC5258m0.o(interfaceC5267r0);
        }
        c5240e.zzn.add(c5243f);
    }

    static /* synthetic */ void f0(C5240e c5240e, long j8) {
        c5240e.zzd |= 256;
        c5240e.zzr = j8;
    }

    static /* synthetic */ void g0(C5240e c5240e, boolean z7) {
        c5240e.zzd |= 128;
        c5240e.zzl = z7;
    }

    static /* synthetic */ void h0(C5240e c5240e, int i8) {
        c5240e.zzd |= 64;
        c5240e.zzk = i8;
    }

    static /* synthetic */ void i0(C5240e c5240e, Q q8) {
        c5240e.zzd |= 1;
        c5240e.zze = q8;
    }

    public final boolean H() {
        return this.zzl;
    }

    public final double I() {
        return this.zzg;
    }

    public final float K() {
        return this.zzh;
    }

    public final int L() {
        return this.zzn.size();
    }

    public final int M() {
        return this.zzk;
    }

    public final int N() {
        return this.zzj;
    }

    public final long O() {
        return this.zzr;
    }

    public final long P() {
        return this.zzi;
    }

    public final Q T() {
        return this.zze;
    }

    public final String U() {
        return this.zzf;
    }

    public final List V() {
        return this.zzn;
    }

    public final List W() {
        return this.zzm;
    }

    public final List X() {
        return this.zzq;
    }

    public final List Y() {
        return this.zzp;
    }

    public final List Z() {
        return this.zzo;
    }

    @Override // com.google.android.gms.internal.wearable.AbstractC5258m0
    protected final Object e(int i8, Object obj, Object obj2) {
        int i9 = i8 - 1;
        if (i9 == 0) {
            return Byte.valueOf(this.zzs);
        }
        if (i9 == 2) {
            return AbstractC5258m0.q(zzb, "\u0001\u000e\u0000\u0001\u0001\u000e\u000e\u0000\u0005\u0002\u0001ည\u0000\u0002ဈ\u0001\u0003က\u0002\u0004ခ\u0003\u0005ဂ\u0004\u0006င\u0005\u0007ဏ\u0006\bဇ\u0007\tЛ\nЛ\u000b\u001a\f\u0014\rဂ\b\u000e\u0013", new Object[]{"zzd", "zze", "zzf", "zzg", "zzh", "zzi", "zzj", "zzk", "zzl", "zzm", C5245g.class, "zzn", C5243f.class, "zzo", "zzp", "zzr", "zzq"});
        }
        if (i9 == 3) {
            return new C5240e();
        }
        AbstractC5247h abstractC5247h = null;
        if (i9 == 4) {
            return new C5237d(abstractC5247h);
        }
        if (i9 == 5) {
            return zzb;
        }
        this.zzs = obj == null ? (byte) 0 : (byte) 1;
        return null;
    }
}
