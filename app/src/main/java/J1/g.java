package J1;

import d2.AbstractC5709k;
import java.security.MessageDigest;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: e, reason: collision with root package name */
    private static final b f3472e = new a();

    /* renamed from: a, reason: collision with root package name */
    private final Object f3473a;

    /* renamed from: b, reason: collision with root package name */
    private final b f3474b;

    /* renamed from: c, reason: collision with root package name */
    private final String f3475c;

    /* renamed from: d, reason: collision with root package name */
    private volatile byte[] f3476d;

    public interface b {
        void a(byte[] bArr, Object obj, MessageDigest messageDigest);
    }

    private g(String str, Object obj, b bVar) {
        this.f3475c = AbstractC5709k.b(str);
        this.f3473a = obj;
        this.f3474b = (b) AbstractC5709k.d(bVar);
    }

    public static g a(String str, Object obj, b bVar) {
        return new g(str, obj, bVar);
    }

    private static b b() {
        return f3472e;
    }

    private byte[] d() {
        if (this.f3476d == null) {
            this.f3476d = this.f3475c.getBytes(e.f3470a);
        }
        return this.f3476d;
    }

    public static g e(String str) {
        return new g(str, null, b());
    }

    public static g f(String str, Object obj) {
        return new g(str, obj, b());
    }

    public Object c() {
        return this.f3473a;
    }

    public boolean equals(Object obj) {
        if (obj instanceof g) {
            return this.f3475c.equals(((g) obj).f3475c);
        }
        return false;
    }

    public void g(Object obj, MessageDigest messageDigest) {
        this.f3474b.a(d(), obj, messageDigest);
    }

    public int hashCode() {
        return this.f3475c.hashCode();
    }

    public String toString() {
        return "Option{key='" + this.f3475c + "'}";
    }

    class a implements b {
        a() {
        }

        @Override // J1.g.b
        public void a(byte[] bArr, Object obj, MessageDigest messageDigest) {
        }
    }
}
