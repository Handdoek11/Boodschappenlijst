package m2;

import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.List;

/* renamed from: m2.d, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6190d {

    /* renamed from: c, reason: collision with root package name */
    private static final C6190d f38944c = new a().a();

    /* renamed from: a, reason: collision with root package name */
    private final String f38945a;

    /* renamed from: b, reason: collision with root package name */
    private final List f38946b;

    /* renamed from: m2.d$a */
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private String f38947a = "";

        /* renamed from: b, reason: collision with root package name */
        private List f38948b = new ArrayList();

        a() {
        }

        public C6190d a() {
            return new C6190d(this.f38947a, DesugarCollections.unmodifiableList(this.f38948b));
        }

        public a b(List list) {
            this.f38948b = list;
            return this;
        }

        public a c(String str) {
            this.f38947a = str;
            return this;
        }
    }

    C6190d(String str, List list) {
        this.f38945a = str;
        this.f38946b = list;
    }

    public static a c() {
        return new a();
    }

    public List a() {
        return this.f38946b;
    }

    public String b() {
        return this.f38945a;
    }
}
