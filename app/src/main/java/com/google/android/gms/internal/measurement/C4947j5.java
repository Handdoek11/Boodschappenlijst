package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.j5, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C4947j5 implements U4 {

    /* renamed from: a, reason: collision with root package name */
    private final W4 f29372a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29373b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f29374c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29375d;

    C4947j5(W4 w42, String str, Object[] objArr) {
        this.f29372a = w42;
        this.f29373b = str;
        this.f29374c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f29375d = charAt;
            return;
        }
        int i8 = charAt & 8191;
        int i9 = 13;
        int i10 = 1;
        while (true) {
            int i11 = i10 + 1;
            char charAt2 = str.charAt(i10);
            if (charAt2 < 55296) {
                this.f29375d = i8 | (charAt2 << i9);
                return;
            } else {
                i8 |= (charAt2 & 8191) << i9;
                i9 += 13;
                i10 = i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.U4
    public final boolean a() {
        return (this.f29375d & 2) == 2;
    }

    final String b() {
        return this.f29373b;
    }

    final Object[] c() {
        return this.f29374c;
    }

    @Override // com.google.android.gms.internal.measurement.U4
    public final W4 zza() {
        return this.f29372a;
    }

    @Override // com.google.android.gms.internal.measurement.U4
    public final EnumC4911f5 zzb() {
        int i8 = this.f29375d;
        return (i8 & 1) != 0 ? EnumC4911f5.PROTO2 : (i8 & 4) == 4 ? EnumC4911f5.EDITIONS : EnumC4911f5.PROTO3;
    }
}
