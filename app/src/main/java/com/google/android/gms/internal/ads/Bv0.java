package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
final class Bv0 implements InterfaceC3544nv0 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC3871qv0 f14040a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14041b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f14042c;

    /* renamed from: d, reason: collision with root package name */
    private final int f14043d;

    Bv0(InterfaceC3871qv0 interfaceC3871qv0, String str, Object[] objArr) {
        this.f14040a = interfaceC3871qv0;
        this.f14041b = str;
        this.f14042c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f14043d = charAt;
            return;
        }
        int i8 = charAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f14043d = i8 | (charAt2 << i10);
                return;
            } else {
                i8 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544nv0
    public final int a() {
        int i8 = this.f14043d;
        if ((i8 & 1) != 0) {
            return 1;
        }
        return (i8 & 4) == 4 ? 3 : 2;
    }

    final String b() {
        return this.f14041b;
    }

    final Object[] c() {
        return this.f14042c;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544nv0
    public final InterfaceC3871qv0 zza() {
        return this.f14040a;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3544nv0
    public final boolean zzb() {
        return (this.f14043d & 2) == 2;
    }
}
