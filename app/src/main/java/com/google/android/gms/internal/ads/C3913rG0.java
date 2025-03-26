package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.ads.rG0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3913rG0 {

    /* renamed from: a, reason: collision with root package name */
    private final Map f26141a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map f26142b = new HashMap();

    /* renamed from: c, reason: collision with root package name */
    private InterfaceC2646fh0 f26143c;

    public C3913rG0(InterfaceC4425w0 interfaceC4425w0, InterfaceC3344m4 interfaceC3344m4) {
    }

    public final void a(InterfaceC2646fh0 interfaceC2646fh0) {
        if (interfaceC2646fh0 != this.f26143c) {
            this.f26143c = interfaceC2646fh0;
            this.f26141a.clear();
            this.f26142b.clear();
        }
    }
}
