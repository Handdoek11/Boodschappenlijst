package com.google.android.gms.internal.play_billing;

import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.y1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5220y1 {

    /* renamed from: a, reason: collision with root package name */
    private final C5213x f30030a = new C5213x();

    /* renamed from: b, reason: collision with root package name */
    private final String f30031b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f30032c;

    C5220y1(Class cls) {
        this.f30031b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f30032c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f30030a) {
            try {
                Logger logger2 = this.f30032c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f30031b);
                this.f30032c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
