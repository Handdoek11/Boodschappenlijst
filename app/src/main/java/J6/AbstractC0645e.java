package J6;

import java.io.Serializable;

/* renamed from: J6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0645e implements Q6.a, Serializable {

    /* renamed from: x, reason: collision with root package name */
    public static final Object f3562x = a.f3569o;

    /* renamed from: o, reason: collision with root package name */
    private transient Q6.a f3563o;

    /* renamed from: s, reason: collision with root package name */
    protected final Object f3564s;

    /* renamed from: t, reason: collision with root package name */
    private final Class f3565t;

    /* renamed from: u, reason: collision with root package name */
    private final String f3566u;

    /* renamed from: v, reason: collision with root package name */
    private final String f3567v;

    /* renamed from: w, reason: collision with root package name */
    private final boolean f3568w;

    /* renamed from: J6.e$a */
    private static class a implements Serializable {

        /* renamed from: o, reason: collision with root package name */
        private static final a f3569o = new a();

        private a() {
        }
    }

    protected AbstractC0645e(Object obj, Class cls, String str, String str2, boolean z7) {
        this.f3564s = obj;
        this.f3565t = cls;
        this.f3566u = str;
        this.f3567v = str2;
        this.f3568w = z7;
    }

    public Q6.a b() {
        Q6.a aVar = this.f3563o;
        if (aVar != null) {
            return aVar;
        }
        Q6.a c8 = c();
        this.f3563o = c8;
        return c8;
    }

    protected abstract Q6.a c();

    public Object f() {
        return this.f3564s;
    }

    public Q6.d g() {
        Class cls = this.f3565t;
        if (cls == null) {
            return null;
        }
        return this.f3568w ? H.c(cls) : H.b(cls);
    }

    @Override // Q6.a
    public String getName() {
        return this.f3566u;
    }

    protected Q6.a h() {
        Q6.a b8 = b();
        if (b8 != this) {
            return b8;
        }
        throw new H6.b();
    }

    public String i() {
        return this.f3567v;
    }
}
