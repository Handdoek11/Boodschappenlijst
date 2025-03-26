package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes2.dex */
final class R5 implements InterfaceC5419t2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f30672a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ V5 f30673b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f30674c;

    R5(H5 h52, String str, V5 v52) {
        this.f30672a = str;
        this.f30673b = v52;
        this.f30674c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5419t2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f30674c.z(this.f30672a, i8, th, bArr, this.f30673b);
    }
}
