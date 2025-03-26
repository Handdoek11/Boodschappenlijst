package io.ktor.utils.io.jvm.javaio;

import J6.r;
import U6.I;

/* loaded from: classes2.dex */
final class i extends I {

    /* renamed from: t, reason: collision with root package name */
    public static final i f36957t = new i();

    private i() {
    }

    @Override // U6.I
    public void q0(A6.g gVar, Runnable runnable) {
        r.e(gVar, "context");
        r.e(runnable, "block");
        runnable.run();
    }

    @Override // U6.I
    public boolean x0(A6.g gVar) {
        r.e(gVar, "context");
        return true;
    }
}
