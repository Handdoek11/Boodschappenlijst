package c3;

import Z2.r;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: c3.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0984f {

    /* renamed from: a, reason: collision with root package name */
    private final List f12114a;

    /* renamed from: b, reason: collision with root package name */
    private final InterfaceC0979a f12115b;

    /* renamed from: c, reason: collision with root package name */
    private final Executor f12116c;

    /* renamed from: c3.f$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private final List f12117a = new ArrayList();

        /* renamed from: b, reason: collision with root package name */
        private InterfaceC0979a f12118b;

        /* renamed from: c, reason: collision with root package name */
        private Executor f12119c;

        public a a(W2.c cVar) {
            this.f12117a.add(cVar);
            return this;
        }

        public C0984f b() {
            return new C0984f(this.f12117a, this.f12118b, this.f12119c, true, null);
        }

        public a c(InterfaceC0979a interfaceC0979a) {
            return d(interfaceC0979a, null);
        }

        public a d(InterfaceC0979a interfaceC0979a, Executor executor) {
            this.f12118b = interfaceC0979a;
            this.f12119c = executor;
            return this;
        }
    }

    /* synthetic */ C0984f(List list, InterfaceC0979a interfaceC0979a, Executor executor, boolean z7, AbstractC0989k abstractC0989k) {
        r.m(list, "APIs must not be null.");
        r.b(!list.isEmpty(), "APIs must not be empty.");
        if (executor != null) {
            r.m(interfaceC0979a, "Listener must not be null when listener executor is set.");
        }
        this.f12114a = list;
        this.f12115b = interfaceC0979a;
        this.f12116c = executor;
    }

    public static a d() {
        return new a();
    }

    public List a() {
        return this.f12114a;
    }

    public InterfaceC0979a b() {
        return this.f12115b;
    }

    public Executor c() {
        return this.f12116c;
    }
}
