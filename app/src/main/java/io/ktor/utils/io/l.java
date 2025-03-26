package io.ktor.utils.io;

import J6.r;
import U6.M;

/* loaded from: classes2.dex */
final class l implements M, q {

    /* renamed from: o, reason: collision with root package name */
    private final c f36968o;

    /* renamed from: s, reason: collision with root package name */
    private final /* synthetic */ M f36969s;

    public l(M m8, c cVar) {
        r.e(m8, "delegate");
        r.e(cVar, "channel");
        this.f36968o = cVar;
        this.f36969s = m8;
    }

    @Override // io.ktor.utils.io.q
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public c g() {
        return this.f36968o;
    }

    @Override // U6.M
    public A6.g getCoroutineContext() {
        return this.f36969s.getCoroutineContext();
    }
}
