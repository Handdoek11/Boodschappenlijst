package g4;

import j$.util.DesugarCollections;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* renamed from: g4.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5807c {

    /* renamed from: a, reason: collision with root package name */
    private final String f36026a;

    /* renamed from: b, reason: collision with root package name */
    private final Set f36027b;

    /* renamed from: c, reason: collision with root package name */
    private final Set f36028c;

    /* renamed from: d, reason: collision with root package name */
    private final int f36029d;

    /* renamed from: e, reason: collision with root package name */
    private final int f36030e;

    /* renamed from: f, reason: collision with root package name */
    private final h f36031f;

    /* renamed from: g, reason: collision with root package name */
    private final Set f36032g;

    public static b c(B b8) {
        return new b(b8, new B[0]);
    }

    public static b d(B b8, B... bArr) {
        return new b(b8, bArr);
    }

    public static b e(Class cls) {
        return new b(cls, new Class[0]);
    }

    public static b f(Class cls, Class... clsArr) {
        return new b(cls, clsArr);
    }

    public static C5807c l(final Object obj, Class cls) {
        return m(cls).f(new h() { // from class: g4.a
            @Override // g4.h
            public final Object a(e eVar) {
                return C5807c.q(obj, eVar);
            }
        }).d();
    }

    public static b m(Class cls) {
        return e(cls).g();
    }

    public static C5807c s(final Object obj, Class cls, Class... clsArr) {
        return f(cls, clsArr).f(new h() { // from class: g4.b
            @Override // g4.h
            public final Object a(e eVar) {
                return C5807c.r(obj, eVar);
            }
        }).d();
    }

    public Set g() {
        return this.f36028c;
    }

    public h h() {
        return this.f36031f;
    }

    public String i() {
        return this.f36026a;
    }

    public Set j() {
        return this.f36027b;
    }

    public Set k() {
        return this.f36032g;
    }

    public boolean n() {
        return this.f36029d == 1;
    }

    public boolean o() {
        return this.f36029d == 2;
    }

    public boolean p() {
        return this.f36030e == 0;
    }

    public C5807c t(h hVar) {
        return new C5807c(this.f36026a, this.f36027b, this.f36028c, this.f36029d, this.f36030e, hVar, this.f36032g);
    }

    public String toString() {
        return "Component<" + Arrays.toString(this.f36027b.toArray()) + ">{" + this.f36029d + ", type=" + this.f36030e + ", deps=" + Arrays.toString(this.f36028c.toArray()) + "}";
    }

    /* renamed from: g4.c$b */
    public static class b {

        /* renamed from: a, reason: collision with root package name */
        private String f36033a;

        /* renamed from: b, reason: collision with root package name */
        private final Set f36034b;

        /* renamed from: c, reason: collision with root package name */
        private final Set f36035c;

        /* renamed from: d, reason: collision with root package name */
        private int f36036d;

        /* renamed from: e, reason: collision with root package name */
        private int f36037e;

        /* renamed from: f, reason: collision with root package name */
        private h f36038f;

        /* renamed from: g, reason: collision with root package name */
        private final Set f36039g;

        /* JADX INFO: Access modifiers changed from: private */
        public b g() {
            this.f36037e = 1;
            return this;
        }

        private b i(int i8) {
            AbstractC5804A.d(this.f36036d == 0, "Instantiation type has already been set.");
            this.f36036d = i8;
            return this;
        }

        private void j(B b8) {
            AbstractC5804A.a(!this.f36034b.contains(b8), "Components are not allowed to depend on interfaces they themselves provide.");
        }

        public b b(r rVar) {
            AbstractC5804A.c(rVar, "Null dependency");
            j(rVar.c());
            this.f36035c.add(rVar);
            return this;
        }

        public b c() {
            return i(1);
        }

        public C5807c d() {
            AbstractC5804A.d(this.f36038f != null, "Missing required property: factory.");
            return new C5807c(this.f36033a, new HashSet(this.f36034b), new HashSet(this.f36035c), this.f36036d, this.f36037e, this.f36038f, this.f36039g);
        }

        public b e() {
            return i(2);
        }

        public b f(h hVar) {
            this.f36038f = (h) AbstractC5804A.c(hVar, "Null factory");
            return this;
        }

        public b h(String str) {
            this.f36033a = str;
            return this;
        }

        private b(Class cls, Class... clsArr) {
            this.f36033a = null;
            HashSet hashSet = new HashSet();
            this.f36034b = hashSet;
            this.f36035c = new HashSet();
            this.f36036d = 0;
            this.f36037e = 0;
            this.f36039g = new HashSet();
            AbstractC5804A.c(cls, "Null interface");
            hashSet.add(B.b(cls));
            for (Class cls2 : clsArr) {
                AbstractC5804A.c(cls2, "Null interface");
                this.f36034b.add(B.b(cls2));
            }
        }

        private b(B b8, B... bArr) {
            this.f36033a = null;
            HashSet hashSet = new HashSet();
            this.f36034b = hashSet;
            this.f36035c = new HashSet();
            this.f36036d = 0;
            this.f36037e = 0;
            this.f36039g = new HashSet();
            AbstractC5804A.c(b8, "Null interface");
            hashSet.add(b8);
            for (B b9 : bArr) {
                AbstractC5804A.c(b9, "Null interface");
            }
            Collections.addAll(this.f36034b, bArr);
        }
    }

    private C5807c(String str, Set set, Set set2, int i8, int i9, h hVar, Set set3) {
        this.f36026a = str;
        this.f36027b = DesugarCollections.unmodifiableSet(set);
        this.f36028c = DesugarCollections.unmodifiableSet(set2);
        this.f36029d = i8;
        this.f36030e = i9;
        this.f36031f = hVar;
        this.f36032g = DesugarCollections.unmodifiableSet(set3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object q(Object obj, e eVar) {
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ Object r(Object obj, e eVar) {
        return obj;
    }
}
