package androidx.datastore.preferences.protobuf;

import androidx.datastore.preferences.protobuf.o0;

/* loaded from: classes.dex */
public class F {

    /* renamed from: a, reason: collision with root package name */
    private final a f9298a;

    /* renamed from: b, reason: collision with root package name */
    private final Object f9299b;

    /* renamed from: c, reason: collision with root package name */
    private final Object f9300c;

    static class a {

        /* renamed from: a, reason: collision with root package name */
        public final o0.b f9301a;

        /* renamed from: b, reason: collision with root package name */
        public final Object f9302b;

        /* renamed from: c, reason: collision with root package name */
        public final o0.b f9303c;

        /* renamed from: d, reason: collision with root package name */
        public final Object f9304d;

        public a(o0.b bVar, Object obj, o0.b bVar2, Object obj2) {
            this.f9301a = bVar;
            this.f9302b = obj;
            this.f9303c = bVar2;
            this.f9304d = obj2;
        }
    }

    private F(o0.b bVar, Object obj, o0.b bVar2, Object obj2) {
        this.f9298a = new a(bVar, obj, bVar2, obj2);
        this.f9299b = obj;
        this.f9300c = obj2;
    }

    static int b(a aVar, Object obj, Object obj2) {
        return r.b(aVar.f9301a, 1, obj) + r.b(aVar.f9303c, 2, obj2);
    }

    public static F d(o0.b bVar, Object obj, o0.b bVar2, Object obj2) {
        return new F(bVar, obj, bVar2, obj2);
    }

    static void e(CodedOutputStream codedOutputStream, a aVar, Object obj, Object obj2) {
        r.u(codedOutputStream, aVar.f9301a, 1, obj);
        r.u(codedOutputStream, aVar.f9303c, 2, obj2);
    }

    public int a(int i8, Object obj, Object obj2) {
        return CodedOutputStream.P(i8) + CodedOutputStream.y(b(this.f9298a, obj, obj2));
    }

    a c() {
        return this.f9298a;
    }
}
