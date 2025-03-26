package io.ktor.utils.io.jvm.javaio;

import J6.r;
import java.util.concurrent.locks.LockSupport;

/* loaded from: classes2.dex */
final class c implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final c f36934a = new c();

    private c() {
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long j8) {
        if (j8 < 0) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        LockSupport.parkNanos(j8);
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public void b(Thread thread) {
        r.e(thread, "token");
        LockSupport.unpark(thread);
    }
}
