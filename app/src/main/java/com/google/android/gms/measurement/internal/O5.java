package com.google.android.gms.measurement.internal;

import java.util.Map;

/* loaded from: classes2.dex */
final class O5 implements InterfaceC5419t2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f30637a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ V5 f30638b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f30639c;

    O5(H5 h52, String str, V5 v52) {
        this.f30637a = str;
        this.f30638b = v52;
        this.f30639c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5419t2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f30639c.z(this.f30637a, i8, th, bArr, this.f30638b);
    }
}
