package com.google.firebase.messaging;

/* renamed from: com.google.firebase.messaging.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5475a implements B4.a {

    /* renamed from: a, reason: collision with root package name */
    public static final B4.a f32910a = new C5475a();

    /* renamed from: com.google.firebase.messaging.a$a, reason: collision with other inner class name */
    private static final class C0240a implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final C0240a f32911a = new C0240a();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f32912b = A4.b.a("projectNumber").b(D4.a.b().c(1).a()).a();

        /* renamed from: c, reason: collision with root package name */
        private static final A4.b f32913c = A4.b.a("messageId").b(D4.a.b().c(2).a()).a();

        /* renamed from: d, reason: collision with root package name */
        private static final A4.b f32914d = A4.b.a("instanceId").b(D4.a.b().c(3).a()).a();

        /* renamed from: e, reason: collision with root package name */
        private static final A4.b f32915e = A4.b.a("messageType").b(D4.a.b().c(4).a()).a();

        /* renamed from: f, reason: collision with root package name */
        private static final A4.b f32916f = A4.b.a("sdkPlatform").b(D4.a.b().c(5).a()).a();

        /* renamed from: g, reason: collision with root package name */
        private static final A4.b f32917g = A4.b.a("packageName").b(D4.a.b().c(6).a()).a();

        /* renamed from: h, reason: collision with root package name */
        private static final A4.b f32918h = A4.b.a("collapseKey").b(D4.a.b().c(7).a()).a();

        /* renamed from: i, reason: collision with root package name */
        private static final A4.b f32919i = A4.b.a("priority").b(D4.a.b().c(8).a()).a();

        /* renamed from: j, reason: collision with root package name */
        private static final A4.b f32920j = A4.b.a("ttl").b(D4.a.b().c(9).a()).a();

        /* renamed from: k, reason: collision with root package name */
        private static final A4.b f32921k = A4.b.a("topic").b(D4.a.b().c(10).a()).a();

        /* renamed from: l, reason: collision with root package name */
        private static final A4.b f32922l = A4.b.a("bulkId").b(D4.a.b().c(11).a()).a();

        /* renamed from: m, reason: collision with root package name */
        private static final A4.b f32923m = A4.b.a("event").b(D4.a.b().c(12).a()).a();

        /* renamed from: n, reason: collision with root package name */
        private static final A4.b f32924n = A4.b.a("analyticsLabel").b(D4.a.b().c(13).a()).a();

        /* renamed from: o, reason: collision with root package name */
        private static final A4.b f32925o = A4.b.a("campaignId").b(D4.a.b().c(14).a()).a();

        /* renamed from: p, reason: collision with root package name */
        private static final A4.b f32926p = A4.b.a("composerLabel").b(D4.a.b().c(15).a()).a();

        private C0240a() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(N4.a aVar, A4.d dVar) {
            dVar.f(f32912b, aVar.l());
            dVar.a(f32913c, aVar.h());
            dVar.a(f32914d, aVar.g());
            dVar.a(f32915e, aVar.i());
            dVar.a(f32916f, aVar.m());
            dVar.a(f32917g, aVar.j());
            dVar.a(f32918h, aVar.d());
            dVar.e(f32919i, aVar.k());
            dVar.e(f32920j, aVar.o());
            dVar.a(f32921k, aVar.n());
            dVar.f(f32922l, aVar.b());
            dVar.a(f32923m, aVar.f());
            dVar.a(f32924n, aVar.a());
            dVar.f(f32925o, aVar.c());
            dVar.a(f32926p, aVar.e());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$b */
    private static final class b implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final b f32927a = new b();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f32928b = A4.b.a("messagingClientEvent").b(D4.a.b().c(1).a()).a();

        private b() {
        }

        @Override // A4.c
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void a(N4.b bVar, A4.d dVar) {
            dVar.a(f32928b, bVar.a());
        }
    }

    /* renamed from: com.google.firebase.messaging.a$c */
    private static final class c implements A4.c {

        /* renamed from: a, reason: collision with root package name */
        static final c f32929a = new c();

        /* renamed from: b, reason: collision with root package name */
        private static final A4.b f32930b = A4.b.d("messagingClientEventExtension");

        private c() {
        }

        @Override // A4.c
        public /* bridge */ /* synthetic */ void a(Object obj, Object obj2) {
            androidx.appcompat.app.E.a(obj);
            b(null, (A4.d) obj2);
        }

        public void b(K k8, A4.d dVar) {
            throw null;
        }
    }

    private C5475a() {
    }

    @Override // B4.a
    public void a(B4.b bVar) {
        bVar.a(K.class, c.f32929a);
        bVar.a(N4.b.class, b.f32927a);
        bVar.a(N4.a.class, C0240a.f32911a);
    }
}
