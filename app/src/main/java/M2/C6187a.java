package m2;

import j$.util.DesugarCollections;
import j2.AbstractC6064m;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m2.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6187a {

    /* renamed from: e, reason: collision with root package name */
    private static final C6187a f38918e = new C0289a().b();

    /* renamed from: a, reason: collision with root package name */
    private final C6192f f38919a;

    /* renamed from: b, reason: collision with root package name */
    private final List f38920b;

    /* renamed from: c, reason: collision with root package name */
    private final C6188b f38921c;

    /* renamed from: d, reason: collision with root package name */
    private final String f38922d;

    /* renamed from: m2.a$a, reason: collision with other inner class name */
    public static final class C0289a {

        /* renamed from: a, reason: collision with root package name */
        private C6192f f38923a = null;

        /* renamed from: b, reason: collision with root package name */
        private List f38924b = new ArrayList();

        /* renamed from: c, reason: collision with root package name */
        private C6188b f38925c = null;

        /* renamed from: d, reason: collision with root package name */
        private String f38926d = "";

        C0289a() {
        }

        public C0289a a(C6190d c6190d) {
            this.f38924b.add(c6190d);
            return this;
        }

        public C6187a b() {
            return new C6187a(this.f38923a, DesugarCollections.unmodifiableList(this.f38924b), this.f38925c, this.f38926d);
        }

        public C0289a c(String str) {
            this.f38926d = str;
            return this;
        }

        public C0289a d(C6188b c6188b) {
            this.f38925c = c6188b;
            return this;
        }

        public C0289a e(C6192f c6192f) {
            this.f38923a = c6192f;
            return this;
        }
    }

    C6187a(C6192f c6192f, List list, C6188b c6188b, String str) {
        this.f38919a = c6192f;
        this.f38920b = list;
        this.f38921c = c6188b;
        this.f38922d = str;
    }

    public static C0289a e() {
        return new C0289a();
    }

    public String a() {
        return this.f38922d;
    }

    public C6188b b() {
        return this.f38921c;
    }

    public List c() {
        return this.f38920b;
    }

    public C6192f d() {
        return this.f38919a;
    }

    public byte[] f() {
        return AbstractC6064m.a(this);
    }
}
