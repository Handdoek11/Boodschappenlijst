package com.google.android.gms.internal.wearable;

/* loaded from: classes2.dex */
final class T0 implements F0 {

    /* renamed from: a, reason: collision with root package name */
    private final I0 f30094a;

    /* renamed from: b, reason: collision with root package name */
    private final String f30095b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f30096c;

    /* renamed from: d, reason: collision with root package name */
    private final int f30097d;

    T0(I0 i02, String str, Object[] objArr) {
        this.f30094a = i02;
        this.f30095b = str;
        this.f30096c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f30097d = charAt;
            return;
        }
        int i8 = charAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f30097d = i8 | (charAt2 << i10);
                return;
            } else {
                i8 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.wearable.F0
    public final int a() {
        int i8 = this.f30097d;
        if ((i8 & 1) != 0) {
            return 1;
        }
        return (i8 & 4) == 4 ? 3 : 2;
    }

    final String b() {
        return this.f30095b;
    }

    final Object[] c() {
        return this.f30096c;
    }

    @Override // com.google.android.gms.internal.wearable.F0
    public final I0 zza() {
        return this.f30094a;
    }

    @Override // com.google.android.gms.internal.wearable.F0
    public final boolean zzb() {
        return (this.f30097d & 2) == 2;
    }
}
