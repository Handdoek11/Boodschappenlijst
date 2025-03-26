package l7;

import J6.K;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class u implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final u f38878a = new u();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38879b = a.f38880b;

    private static final class a implements i7.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f38880b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f38881c = "kotlinx.serialization.json.JsonObject";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ i7.f f38882a = h7.a.k(h7.a.C(K.f3551a), j.f38856a).getDescriptor();

        private a() {
        }

        @Override // i7.f
        public String a() {
            return f38881c;
        }

        @Override // i7.f
        public boolean c() {
            return this.f38882a.c();
        }

        @Override // i7.f
        public int d(String str) {
            J6.r.e(str, "name");
            return this.f38882a.d(str);
        }

        @Override // i7.f
        public i7.j e() {
            return this.f38882a.e();
        }

        @Override // i7.f
        public List f() {
            return this.f38882a.f();
        }

        @Override // i7.f
        public int g() {
            return this.f38882a.g();
        }

        @Override // i7.f
        public String h(int i8) {
            return this.f38882a.h(i8);
        }

        @Override // i7.f
        public boolean i() {
            return this.f38882a.i();
        }

        @Override // i7.f
        public List j(int i8) {
            return this.f38882a.j(i8);
        }

        @Override // i7.f
        public i7.f k(int i8) {
            return this.f38882a.k(i8);
        }

        @Override // i7.f
        public boolean l(int i8) {
            return this.f38882a.l(i8);
        }
    }

    private u() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public t deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        k.g(eVar);
        return new t((Map) h7.a.k(h7.a.C(K.f3551a), j.f38856a).deserialize(eVar));
    }

    @Override // g7.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, t tVar) {
        J6.r.e(fVar, "encoder");
        J6.r.e(tVar, "value");
        k.h(fVar);
        h7.a.k(h7.a.C(K.f3551a), j.f38856a).serialize(fVar, tVar);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38879b;
    }
}
