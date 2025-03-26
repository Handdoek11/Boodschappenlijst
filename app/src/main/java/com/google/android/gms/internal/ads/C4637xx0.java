package com.google.android.gms.internal.ads;

import java.util.List;

/* renamed from: com.google.android.gms.internal.ads.xx0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4637xx0 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4637xx0 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private C4201tx0 zzC;
    private C4853zw0 zzE;
    private C3981rw0 zzG;
    private Ww0 zzI;
    private int zzJ;
    private long zzM;
    private C4528wx0 zzN;
    private C2244bx0 zzO;
    private int zzc;
    private int zzd;
    private int zze;
    private C4417vw0 zzi;
    private C2896hx0 zzm;
    private boolean zzn;
    private boolean zzu;
    private boolean zzv;
    private C3766px0 zzx;
    private boolean zzy;
    private byte zzQ = 2;
    private String zzf = "";
    private String zzg = "";
    private String zzh = "";
    private Zu0 zzj = Qu0.v();
    private Zu0 zzk = Qu0.v();
    private String zzl = "";
    private Zu0 zzo = Qu0.v();
    private String zzp = "";
    private AbstractC3542nu0 zzw = AbstractC3542nu0.f25048s;
    private String zzz = "";
    private Zu0 zzA = Qu0.v();
    private Zu0 zzB = Qu0.v();
    private Zu0 zzD = Qu0.v();
    private String zzF = "";
    private Zu0 zzH = Qu0.v();
    private Zu0 zzK = Qu0.v();
    private Zu0 zzL = Qu0.v();
    private String zzP = "";

    static {
        C4637xx0 c4637xx0 = new C4637xx0();
        zza = c4637xx0;
        Qu0.F(C4637xx0.class, c4637xx0);
    }

    private C4637xx0() {
    }

    public static C4199tw0 b0() {
        return (C4199tw0) zza.q();
    }

    static /* synthetic */ void g0(C4637xx0 c4637xx0, Iterable iterable) {
        Zu0 zu0 = c4637xx0.zzA;
        if (!zu0.a()) {
            c4637xx0.zzA = Qu0.w(zu0);
        }
        Wt0.j(iterable, c4637xx0.zzA);
    }

    static /* synthetic */ void h0(C4637xx0 c4637xx0, Iterable iterable) {
        Zu0 zu0 = c4637xx0.zzB;
        if (!zu0.a()) {
            c4637xx0.zzB = Qu0.w(zu0);
        }
        Wt0.j(iterable, c4637xx0.zzB);
    }

    static /* synthetic */ void i0(C4637xx0 c4637xx0, C3548nx0 c3548nx0) {
        c3548nx0.getClass();
        Zu0 zu0 = c4637xx0.zzj;
        if (!zu0.a()) {
            c4637xx0.zzj = Qu0.w(zu0);
        }
        c4637xx0.zzj.add(c3548nx0);
    }

    static /* synthetic */ void j0(C4637xx0 c4637xx0) {
        c4637xx0.zzc &= -65;
        c4637xx0.zzl = zza.zzl;
    }

    static /* synthetic */ void k0(C4637xx0 c4637xx0, String str) {
        c4637xx0.zzc |= 64;
        c4637xx0.zzl = str;
    }

    static /* synthetic */ void l0(C4637xx0 c4637xx0, C3766px0 c3766px0) {
        c3766px0.getClass();
        c4637xx0.zzx = c3766px0;
        c4637xx0.zzc |= 8192;
    }

    static /* synthetic */ void m0(C4637xx0 c4637xx0, C4417vw0 c4417vw0) {
        c4417vw0.getClass();
        c4637xx0.zzi = c4417vw0;
        c4637xx0.zzc |= 32;
    }

    static /* synthetic */ void n0(C4637xx0 c4637xx0, String str) {
        str.getClass();
        c4637xx0.zzc |= 8;
        c4637xx0.zzg = str;
    }

    static /* synthetic */ void o0(C4637xx0 c4637xx0, C2896hx0 c2896hx0) {
        c2896hx0.getClass();
        c4637xx0.zzm = c2896hx0;
        c4637xx0.zzc |= 128;
    }

    static /* synthetic */ void p0(C4637xx0 c4637xx0, String str) {
        str.getClass();
        c4637xx0.zzc |= 4;
        c4637xx0.zzf = str;
    }

    static /* synthetic */ void q0(C4637xx0 c4637xx0, int i8) {
        c4637xx0.zzd = i8 - 1;
        c4637xx0.zzc |= 1;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        Ix0 ix0 = null;
        switch (pu0) {
            case GET_MEMOIZED_IS_INITIALIZED:
                return Byte.valueOf(this.zzQ);
            case SET_MEMOIZED_IS_INITIALIZED:
                this.zzQ = obj == null ? (byte) 0 : (byte) 1;
                return null;
            case BUILD_MESSAGE_INFO:
                return Qu0.A(zza, "\u0001#\u0000\u0001\u0001##\u0000\t\u0001\u0001ဈ\u0002\u0002ဈ\u0003\u0003ဈ\u0004\u0004Л\u0005ဇ\b\u0006\u001a\u0007ဈ\t\bဇ\n\tဇ\u000b\n᠌\u0000\u000b᠌\u0001\fဉ\u0005\rဈ\u0006\u000eဉ\u0007\u000fည\f\u0010\u001b\u0011ဉ\r\u0012ဇ\u000e\u0013ဈ\u000f\u0014\u001a\u0015\u001a\u0016ဉ\u0010\u0017\u001b\u0018ဉ\u0011\u0019ဈ\u0012\u001aဉ\u0013\u001b\u001b\u001cဉ\u0014\u001d᠌\u0015\u001e\u001b\u001f\u001b ဂ\u0016!ဉ\u0017\"ဉ\u0018#ဈ\u0019", new Object[]{"zzc", "zzf", "zzg", "zzh", "zzj", C3548nx0.class, "zzn", "zzo", "zzp", "zzu", "zzv", "zzd", C3003ix0.f23105a, "zze", C4090sw0.f26763a, "zzi", "zzl", "zzm", "zzw", "zzk", Bx0.class, "zzx", "zzy", "zzz", "zzA", "zzB", "zzC", "zzD", Hx0.class, "zzE", "zzF", "zzG", "zzH", Dw0.class, "zzI", "zzJ", C3983rx0.f26509a, "zzK", Zw0.class, "zzL", C2569ex0.class, "zzM", "zzN", "zzO", "zzP"});
            case NEW_MUTABLE_INSTANCE:
                return new C4637xx0();
            case NEW_BUILDER:
                return new C4199tw0(ix0);
            case GET_DEFAULT_INSTANCE:
                return zza;
            case GET_PARSER:
                InterfaceC4633xv0 interfaceC4633xv0 = zzb;
                if (interfaceC4633xv0 == null) {
                    synchronized (C4637xx0.class) {
                        try {
                            interfaceC4633xv0 = zzb;
                            if (interfaceC4633xv0 == null) {
                                interfaceC4633xv0 = new Nu0(zza);
                                zzb = interfaceC4633xv0;
                            }
                        } finally {
                        }
                    }
                }
                return interfaceC4633xv0;
            default:
                throw null;
        }
    }

    public final String d0() {
        return this.zzl;
    }

    public final String e0() {
        return this.zzf;
    }

    public final List f0() {
        return this.zzj;
    }
}
