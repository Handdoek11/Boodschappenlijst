package com.google.android.gms.internal.ads;

/* renamed from: com.google.android.gms.internal.ads.og0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3623og0 implements InterfaceC3296lg0 {

    /* renamed from: u, reason: collision with root package name */
    private static final InterfaceC3296lg0 f25252u = new InterfaceC3296lg0() { // from class: com.google.android.gms.internal.ads.ng0
        @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: o, reason: collision with root package name */
    private final C3841qg0 f25253o = new C3841qg0();

    /* renamed from: s, reason: collision with root package name */
    private volatile InterfaceC3296lg0 f25254s;

    /* renamed from: t, reason: collision with root package name */
    private Object f25255t;

    C3623og0(InterfaceC3296lg0 interfaceC3296lg0) {
        this.f25254s = interfaceC3296lg0;
    }

    public final String toString() {
        Object obj = this.f25254s;
        if (obj == f25252u) {
            obj = "<supplier that returned " + String.valueOf(this.f25255t) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3296lg0
    public final Object zza() {
        InterfaceC3296lg0 interfaceC3296lg0 = this.f25254s;
        InterfaceC3296lg0 interfaceC3296lg02 = f25252u;
        if (interfaceC3296lg0 != interfaceC3296lg02) {
            synchronized (this.f25253o) {
                try {
                    if (this.f25254s != interfaceC3296lg02) {
                        Object zza = this.f25254s.zza();
                        this.f25255t = zza;
                        this.f25254s = interfaceC3296lg02;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f25255t;
    }
}
