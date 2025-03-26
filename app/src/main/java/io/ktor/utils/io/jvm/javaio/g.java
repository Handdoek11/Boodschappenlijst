package io.ktor.utils.io.jvm.javaio;

import J6.r;
import kotlin.KotlinNothingValueException;

/* loaded from: classes2.dex */
final class g implements e {

    /* renamed from: a, reason: collision with root package name */
    public static final g f36946a = new g();

    private g() {
    }

    private final Void c() {
        throw new UnsupportedOperationException("Parking is prohibited on this thread. Most likely you are using blocking operation on the wrong thread/dispatcher that doesn't allow blocking. Consider wrapping you blocking code withContext(Dispatchers.IO) {...}.");
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    public void a(long j8) {
        c();
        throw new KotlinNothingValueException();
    }

    @Override // io.ktor.utils.io.jvm.javaio.e
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public void b(Thread thread) {
        r.e(thread, "token");
        c.f36934a.b(thread);
    }
}
