package com.google.android.gms.internal.wearable;

/* renamed from: com.google.android.gms.internal.wearable.s, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5268s implements InterfaceC5265q {

    /* renamed from: d, reason: collision with root package name */
    private static final InterfaceC5265q f30208d = new InterfaceC5265q() { // from class: com.google.android.gms.internal.wearable.r
        @Override // com.google.android.gms.internal.wearable.InterfaceC5265q
        public final Object zza() {
            throw new IllegalStateException();
        }
    };

    /* renamed from: a, reason: collision with root package name */
    private final C5272u f30209a = new C5272u();

    /* renamed from: b, reason: collision with root package name */
    private volatile InterfaceC5265q f30210b;

    /* renamed from: c, reason: collision with root package name */
    private Object f30211c;

    C5268s(InterfaceC5265q interfaceC5265q) {
        this.f30210b = interfaceC5265q;
    }

    public final String toString() {
        Object obj = this.f30210b;
        if (obj == f30208d) {
            obj = "<supplier that returned " + String.valueOf(this.f30211c) + ">";
        }
        return "Suppliers.memoize(" + String.valueOf(obj) + ")";
    }

    @Override // com.google.android.gms.internal.wearable.InterfaceC5265q
    public final Object zza() {
        InterfaceC5265q interfaceC5265q = this.f30210b;
        InterfaceC5265q interfaceC5265q2 = f30208d;
        if (interfaceC5265q != interfaceC5265q2) {
            synchronized (this.f30209a) {
                try {
                    if (this.f30210b != interfaceC5265q2) {
                        Object zza = this.f30210b.zza();
                        this.f30211c = zza;
                        this.f30210b = interfaceC5265q2;
                        return zza;
                    }
                } finally {
                }
            }
        }
        return this.f30211c;
    }
}
