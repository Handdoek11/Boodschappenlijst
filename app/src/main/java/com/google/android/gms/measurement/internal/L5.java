package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class L5 implements InterfaceC5419t2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f30583a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f30584b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f30585c;

    L5(H5 h52, String str, List list) {
        this.f30583a = str;
        this.f30584b = list;
        this.f30585c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5419t2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f30585c.J(true, i8, th, bArr, this.f30583a, this.f30584b);
    }
}
