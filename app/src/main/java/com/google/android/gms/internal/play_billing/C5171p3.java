package com.google.android.gms.internal.play_billing;

import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* renamed from: com.google.android.gms.internal.play_billing.p3, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5171p3 {

    /* renamed from: c, reason: collision with root package name */
    private static final C5171p3 f29964c = new C5171p3();

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f29965d = 0;

    /* renamed from: b, reason: collision with root package name */
    private final ConcurrentMap f29967b = new ConcurrentHashMap();

    /* renamed from: a, reason: collision with root package name */
    private final InterfaceC5194t3 f29966a = new C5081a3();

    private C5171p3() {
    }

    public static C5171p3 a() {
        return f29964c;
    }

    public final InterfaceC5188s3 b(Class cls) {
        R2.c(cls, "messageType");
        InterfaceC5188s3 interfaceC5188s3 = (InterfaceC5188s3) this.f29967b.get(cls);
        if (interfaceC5188s3 == null) {
            interfaceC5188s3 = this.f29966a.a(cls);
            R2.c(cls, "messageType");
            InterfaceC5188s3 interfaceC5188s32 = (InterfaceC5188s3) this.f29967b.putIfAbsent(cls, interfaceC5188s3);
            if (interfaceC5188s32 != null) {
                return interfaceC5188s32;
            }
        }
        return interfaceC5188s3;
    }
}
