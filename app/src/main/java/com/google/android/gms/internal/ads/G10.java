package com.google.android.gms.internal.ads;

/* loaded from: classes.dex */
public final class G10 implements InterfaceC2907i20 {

    /* renamed from: a, reason: collision with root package name */
    private final String f15238a;

    /* renamed from: b, reason: collision with root package name */
    private final int f15239b;

    public G10(String str, int i8) {
        this.f15238a = str;
        this.f15239b = i8;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void a(Object obj) {
        ((KB) obj).f16552b.putString("request_id", this.f15238a);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC2907i20
    public final /* bridge */ /* synthetic */ void c(Object obj) {
        KB kb = (KB) obj;
        kb.f16551a.putString("request_id", this.f15238a);
        if (this.f15239b == 2) {
            kb.f16551a.putInt("sod", 1);
        }
    }
}
