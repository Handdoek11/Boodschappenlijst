package A4;

import j$.util.DesugarCollections;
import java.lang.annotation.Annotation;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes2.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    private final String f233a;

    /* renamed from: b, reason: collision with root package name */
    private final Map f234b;

    /* renamed from: A4.b$b, reason: collision with other inner class name */
    public static final class C0000b {

        /* renamed from: a, reason: collision with root package name */
        private final String f235a;

        /* renamed from: b, reason: collision with root package name */
        private Map f236b = null;

        C0000b(String str) {
            this.f235a = str;
        }

        public b a() {
            return new b(this.f235a, this.f236b == null ? Collections.emptyMap() : DesugarCollections.unmodifiableMap(new HashMap(this.f236b)));
        }

        public C0000b b(Annotation annotation) {
            if (this.f236b == null) {
                this.f236b = new HashMap();
            }
            this.f236b.put(annotation.annotationType(), annotation);
            return this;
        }
    }

    public static C0000b a(String str) {
        return new C0000b(str);
    }

    public static b d(String str) {
        return new b(str, Collections.emptyMap());
    }

    public String b() {
        return this.f233a;
    }

    public Annotation c(Class cls) {
        return (Annotation) this.f234b.get(cls);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return this.f233a.equals(bVar.f233a) && this.f234b.equals(bVar.f234b);
    }

    public int hashCode() {
        return (this.f233a.hashCode() * 31) + this.f234b.hashCode();
    }

    public String toString() {
        return "FieldDescriptor{name=" + this.f233a + ", properties=" + this.f234b.values() + "}";
    }

    private b(String str, Map map) {
        this.f233a = str;
        this.f234b = map;
    }
}
