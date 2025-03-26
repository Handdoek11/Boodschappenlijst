package com.google.android.gms.internal.play_billing;

/* renamed from: com.google.android.gms.internal.play_billing.r3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5182r3 implements InterfaceC5105e3 {

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5123h3 f29985a;

    /* renamed from: b, reason: collision with root package name */
    private final String f29986b;

    /* renamed from: c, reason: collision with root package name */
    private final Object[] f29987c;

    /* renamed from: d, reason: collision with root package name */
    private final int f29988d;

    C5182r3(InterfaceC5123h3 interfaceC5123h3, String str, Object[] objArr) {
        this.f29985a = interfaceC5123h3;
        this.f29986b = str;
        this.f29987c = objArr;
        char charAt = str.charAt(0);
        if (charAt < 55296) {
            this.f29988d = charAt;
            return;
        }
        int i8 = charAt & 8191;
        int i9 = 1;
        int i10 = 13;
        while (true) {
            int i11 = i9 + 1;
            char charAt2 = str.charAt(i9);
            if (charAt2 < 55296) {
                this.f29988d = i8 | (charAt2 << i10);
                return;
            } else {
                i8 |= (charAt2 & 8191) << i10;
                i10 += 13;
                i9 = i11;
            }
        }
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5105e3
    public final int a() {
        int i8 = this.f29988d;
        if ((i8 & 1) != 0) {
            return 1;
        }
        return (i8 & 4) == 4 ? 3 : 2;
    }

    final String b() {
        return this.f29986b;
    }

    final Object[] c() {
        return this.f29987c;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5105e3
    public final InterfaceC5123h3 zza() {
        return this.f29985a;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceC5105e3
    public final boolean zzb() {
        return (this.f29988d & 2) == 2;
    }
}
