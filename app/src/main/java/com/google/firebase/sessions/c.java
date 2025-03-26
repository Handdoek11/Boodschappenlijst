package com.google.firebase.sessions;

import J6.AbstractC0650j;
import J6.o;
import J6.r;
import R4.I;
import R4.y;
import S6.h;
import com.google.firebase.m;
import java.util.Locale;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class c {

    /* renamed from: f, reason: collision with root package name */
    public static final b f33050f = new b(null);

    /* renamed from: a, reason: collision with root package name */
    private final I f33051a;

    /* renamed from: b, reason: collision with root package name */
    private final I6.a f33052b;

    /* renamed from: c, reason: collision with root package name */
    private final String f33053c;

    /* renamed from: d, reason: collision with root package name */
    private int f33054d;

    /* renamed from: e, reason: collision with root package name */
    private y f33055e;

    /* synthetic */ class a extends o implements I6.a {

        /* renamed from: A, reason: collision with root package name */
        public static final a f33056A = new a();

        a() {
            super(0, UUID.class, "randomUUID", "randomUUID()Ljava/util/UUID;", 0);
        }

        @Override // I6.a
        /* renamed from: j, reason: merged with bridge method [inline-methods] */
        public final UUID invoke() {
            return UUID.randomUUID();
        }
    }

    public static final class b {
        public /* synthetic */ b(AbstractC0650j abstractC0650j) {
            this();
        }

        public final c a() {
            Object j8 = m.a(com.google.firebase.c.f32721a).j(c.class);
            r.d(j8, "Firebase.app[SessionGenerator::class.java]");
            return (c) j8;
        }

        private b() {
        }
    }

    public c(I i8, I6.a aVar) {
        r.e(i8, "timeProvider");
        r.e(aVar, "uuidGenerator");
        this.f33051a = i8;
        this.f33052b = aVar;
        this.f33053c = b();
        this.f33054d = -1;
    }

    private final String b() {
        String uuid = ((UUID) this.f33052b.invoke()).toString();
        r.d(uuid, "uuidGenerator().toString()");
        String lowerCase = h.x(uuid, "-", "", false, 4, null).toLowerCase(Locale.ROOT);
        r.d(lowerCase, "this as java.lang.String).toLowerCase(Locale.ROOT)");
        return lowerCase;
    }

    public final y a() {
        int i8 = this.f33054d + 1;
        this.f33054d = i8;
        this.f33055e = new y(i8 == 0 ? this.f33053c : b(), this.f33053c, this.f33054d, this.f33051a.a());
        return c();
    }

    public final y c() {
        y yVar = this.f33055e;
        if (yVar != null) {
            return yVar;
        }
        r.p("currentSession");
        return null;
    }

    public /* synthetic */ c(I i8, I6.a aVar, int i9, AbstractC0650j abstractC0650j) {
        this(i8, (i9 & 2) != 0 ? a.f33056A : aVar);
    }
}
