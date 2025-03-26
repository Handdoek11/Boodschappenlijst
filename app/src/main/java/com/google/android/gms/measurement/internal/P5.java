package com.google.android.gms.measurement.internal;

import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
final class P5 implements InterfaceC5419t2 {

    /* renamed from: a, reason: collision with root package name */
    private final /* synthetic */ String f30655a;

    /* renamed from: b, reason: collision with root package name */
    private final /* synthetic */ List f30656b;

    /* renamed from: c, reason: collision with root package name */
    private final /* synthetic */ H5 f30657c;

    P5(H5 h52, String str, List list) {
        this.f30655a = str;
        this.f30656b = list;
        this.f30657c = h52;
    }

    @Override // com.google.android.gms.measurement.internal.InterfaceC5419t2
    public final void a(String str, int i8, Throwable th, byte[] bArr, Map map) {
        this.f30657c.J(true, i8, th, bArr, this.f30655a, this.f30656b);
    }
}
