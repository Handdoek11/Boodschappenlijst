package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.u90, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4226u90 extends Qu0 implements InterfaceC3979rv0 {
    private static final C4226u90 zza;
    private static volatile InterfaceC4633xv0 zzb;
    private int zzA;
    private int zzE;
    private int zzF;
    private int zzG;
    private long zzH;
    private int zzI;
    private int zzP;
    private int zzQ;
    private int zzS;
    private long zzab;
    private int zzad;
    private int zzae;
    private int zzaf;
    private T90 zzag;
    private int zzah;
    private Q90 zzai;
    private C90 zzaj;
    private J90 zzak;
    private F90 zzal;
    private int zzc;
    private int zzd;
    private int zze;
    private long zzg;
    private long zzh;
    private long zzi;
    private boolean zzk;
    private long zzl;
    private long zzm;
    private long zzn;
    private long zzo;
    private int zzp;
    private String zzf = "";
    private Vu0 zzj = Qu0.r();
    private String zzu = "";
    private String zzv = "";
    private String zzw = "";
    private String zzx = "";
    private String zzy = "";
    private String zzz = "";
    private String zzB = "";
    private String zzC = "";
    private Yu0 zzD = Qu0.t();
    private String zzJ = "";
    private String zzK = "";
    private String zzL = "";
    private String zzM = "";
    private String zzN = "";
    private String zzO = "";
    private String zzR = "";
    private String zzT = "";
    private String zzU = "";
    private String zzV = "";
    private String zzW = "";
    private String zzX = "";
    private String zzY = "";
    private String zzZ = "";
    private String zzaa = "";
    private String zzac = "";

    static {
        C4226u90 c4226u90 = new C4226u90();
        zza = c4226u90;
        Qu0.F(C4226u90.class, c4226u90);
    }

    private C4226u90() {
    }

    public static C3899r90 b0() {
        return (C3899r90) zza.q();
    }

    static /* synthetic */ void d0(C4226u90 c4226u90, Iterable iterable) {
        Yu0 yu0 = c4226u90.zzD;
        if (!yu0.a()) {
            c4226u90.zzD = Qu0.u(yu0);
        }
        Wt0.j(iterable, c4226u90.zzD);
    }

    static /* synthetic */ void e0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzx = str;
    }

    static /* synthetic */ void f0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzJ = str;
    }

    static /* synthetic */ void g0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzaa = str;
    }

    static /* synthetic */ void i0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzK = str;
    }

    static /* synthetic */ void k0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzV = str;
    }

    static /* synthetic */ void n0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzz = str;
    }

    static /* synthetic */ void o0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzX = str;
    }

    static /* synthetic */ void q0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzu = str;
    }

    static /* synthetic */ void r0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzZ = str;
    }

    static /* synthetic */ void v0(C4226u90 c4226u90, String str) {
        str.getClass();
        c4226u90.zzY = str;
    }

    static /* synthetic */ void w0(C4226u90 c4226u90, int i8) {
        if (i8 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c4226u90.zzI = i8 - 2;
    }

    static /* synthetic */ void y0(C4226u90 c4226u90, int i8) {
        if (i8 == 1) {
            throw new IllegalArgumentException("Can't get the number of an unknown enum value.");
        }
        c4226u90.zzE = i8 - 2;
    }

    @Override // com.google.android.gms.internal.ads.Qu0
    protected final Object W(Pu0 pu0, Object obj, Object obj2) {
        int ordinal = pu0.ordinal();
        if (ordinal == 0) {
            return (byte) 1;
        }
        if (ordinal == 2) {
            return Qu0.A(zza, "\u00049\u0000\u0001\u000199\u0000\u0002\u0000\u0001\f\u0002\u0007\u0003\u0002\u0004\f\u0005Ȉ\u0006Ȉ\u0007Ȉ\b\u0004\t\f\n\u0004\u000b\u0002\f\f\rȈ\u000eȈ\u000fȈ\u0010Ȉ\u0011Ȉ\u0012Ȉ\u0013Ȉ\u0014Ȉ\u0015Ȉ\u0016Ȉ\u0017Ȉ\u0018Ȉ\u0019%\u001aȈ\u001bȈ\u001cȈ\u001d\u0002\u001eȈ\u001f\u0002 \u0002!\u0002\"\u0002#\u0002$\u0002%,&\f'\f(\f)ဉ\u0001*ဉ\u0002+\u0004,Ȉ-Ȉ.Ȉ/\f0\u00041\u00042Ȉ3Ȉ4ဉ\u00035\f6ဉ\u00047Ȉ8\u00049ဉ\u0000", new Object[]{"zzc", "zzd", "zzk", "zzl", "zzp", "zzu", "zzx", "zzz", "zzA", "zzE", "zzG", "zzH", "zzI", "zzJ", "zzK", "zzV", "zzW", "zzX", "zzY", "zzZ", "zzaa", "zzv", "zzw", "zzB", "zzC", "zzD", "zzL", "zzM", "zzU", "zzab", "zzf", "zzg", "zzh", "zzi", "zzm", "zzn", "zzo", "zzj", "zzae", "zzaf", "zze", "zzai", "zzaj", "zzP", "zzR", "zzO", "zzN", "zzah", "zzQ", "zzS", "zzT", "zzy", "zzak", "zzF", "zzal", "zzac", "zzad", "zzag"});
        }
        if (ordinal == 3) {
            return new C4226u90();
        }
        AbstractC4117t90 abstractC4117t90 = null;
        if (ordinal == 4) {
            return new C3899r90(abstractC4117t90);
        }
        if (ordinal == 5) {
            return zza;
        }
        if (ordinal != 6) {
            throw null;
        }
        InterfaceC4633xv0 interfaceC4633xv0 = zzb;
        if (interfaceC4633xv0 == null) {
            synchronized (C4226u90.class) {
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
    }
}
