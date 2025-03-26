package com.google.android.gms.internal.ads;

import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.ads.lk0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3304lk0 {

    /* renamed from: a, reason: collision with root package name */
    private final C3841qg0 f24380a = new C3841qg0();

    /* renamed from: b, reason: collision with root package name */
    private final String f24381b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Logger f24382c;

    C3304lk0(Class cls) {
        this.f24381b = cls.getName();
    }

    final Logger a() {
        Logger logger = this.f24382c;
        if (logger != null) {
            return logger;
        }
        synchronized (this.f24380a) {
            try {
                Logger logger2 = this.f24382c;
                if (logger2 != null) {
                    return logger2;
                }
                Logger logger3 = Logger.getLogger(this.f24381b);
                this.f24382c = logger3;
                return logger3;
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
