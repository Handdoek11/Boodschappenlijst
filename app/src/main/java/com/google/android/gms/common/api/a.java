package com.google.android.gms.common.api;

import X2.InterfaceC0756d;
import X2.InterfaceC0761i;
import Z2.AbstractC0765d;
import Z2.C0766e;
import Z2.InterfaceC0772k;
import Z2.r;
import android.content.Context;
import android.os.Looper;
import com.google.android.gms.common.C1105d;
import com.google.android.gms.common.api.c;
import java.util.Set;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC0225a f13228a;

    /* renamed from: b, reason: collision with root package name */
    private final g f13229b;

    /* renamed from: c, reason: collision with root package name */
    private final String f13230c;

    /* renamed from: com.google.android.gms.common.api.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC0225a extends e {
        public f a(Context context, Looper looper, C0766e c0766e, Object obj, InterfaceC0756d interfaceC0756d, InterfaceC0761i interfaceC0761i) {
            throw new UnsupportedOperationException("buildClient must be implemented");
        }

        public f b(Context context, Looper looper, C0766e c0766e, Object obj, c.a aVar, c.b bVar) {
            return a(context, looper, c0766e, obj, aVar, bVar);
        }
    }

    public interface b {
    }

    public static class c {
    }

    public interface d {

        /* renamed from: a, reason: collision with root package name */
        public static final C0226a f13231a = new C0226a(null);

        /* renamed from: com.google.android.gms.common.api.a$d$a, reason: collision with other inner class name */
        public static final class C0226a implements d {
            /* synthetic */ C0226a(W2.g gVar) {
            }
        }
    }

    public static abstract class e {
    }

    public interface f extends b {
        Set b();

        void c(String str);

        void d(AbstractC0765d.e eVar);

        boolean e();

        String f();

        void g();

        boolean h();

        boolean i();

        int j();

        C1105d[] k();

        void l(AbstractC0765d.c cVar);

        String m();

        void n(InterfaceC0772k interfaceC0772k, Set set);

        boolean o();
    }

    public static final class g extends c {
    }

    public a(String str, AbstractC0225a abstractC0225a, g gVar) {
        r.m(abstractC0225a, "Cannot construct an Api with a null ClientBuilder");
        r.m(gVar, "Cannot construct an Api with a null ClientKey");
        this.f13230c = str;
        this.f13228a = abstractC0225a;
        this.f13229b = gVar;
    }

    public final AbstractC0225a a() {
        return this.f13228a;
    }

    public final c b() {
        return this.f13229b;
    }

    public final String c() {
        return this.f13230c;
    }
}
