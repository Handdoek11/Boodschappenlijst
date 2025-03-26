package l7;

import java.util.List;

/* loaded from: classes2.dex */
public final class c implements g7.b {

    /* renamed from: a, reason: collision with root package name */
    public static final c f38825a = new c();

    /* renamed from: b, reason: collision with root package name */
    private static final i7.f f38826b = a.f38827b;

    private static final class a implements i7.f {

        /* renamed from: b, reason: collision with root package name */
        public static final a f38827b = new a();

        /* renamed from: c, reason: collision with root package name */
        private static final String f38828c = "kotlinx.serialization.json.JsonArray";

        /* renamed from: a, reason: collision with root package name */
        private final /* synthetic */ i7.f f38829a = h7.a.h(j.f38856a).getDescriptor();

        private a() {
        }

        @Override // i7.f
        public String a() {
            return f38828c;
        }

        @Override // i7.f
        public boolean c() {
            return this.f38829a.c();
        }

        @Override // i7.f
        public int d(String str) {
            J6.r.e(str, "name");
            return this.f38829a.d(str);
        }

        @Override // i7.f
        public i7.j e() {
            return this.f38829a.e();
        }

        @Override // i7.f
        public List f() {
            return this.f38829a.f();
        }

        @Override // i7.f
        public int g() {
            return this.f38829a.g();
        }

        @Override // i7.f
        public String h(int i8) {
            return this.f38829a.h(i8);
        }

        @Override // i7.f
        public boolean i() {
            return this.f38829a.i();
        }

        @Override // i7.f
        public List j(int i8) {
            return this.f38829a.j(i8);
        }

        @Override // i7.f
        public i7.f k(int i8) {
            return this.f38829a.k(i8);
        }

        @Override // i7.f
        public boolean l(int i8) {
            return this.f38829a.l(i8);
        }
    }

    private c() {
    }

    @Override // g7.a
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public b deserialize(j7.e eVar) {
        J6.r.e(eVar, "decoder");
        k.g(eVar);
        return new b((List) h7.a.h(j.f38856a).deserialize(eVar));
    }

    @Override // g7.h
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void serialize(j7.f fVar, b bVar) {
        J6.r.e(fVar, "encoder");
        J6.r.e(bVar, "value");
        k.h(fVar);
        h7.a.h(j.f38856a).serialize(fVar, bVar);
    }

    @Override // g7.b, g7.h, g7.a
    public i7.f getDescriptor() {
        return f38826b;
    }
}
