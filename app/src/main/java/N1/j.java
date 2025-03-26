package N1;

import d2.AbstractC5709k;
import d2.AbstractC5710l;
import d2.C5706h;
import e2.AbstractC5742a;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* loaded from: classes.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private final C5706h f4086a = new C5706h(1000);

    /* renamed from: b, reason: collision with root package name */
    private final y0.f f4087b = AbstractC5742a.d(10, new a());

    class a implements AbstractC5742a.d {
        a() {
        }

        @Override // e2.AbstractC5742a.d
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public b a() {
            try {
                return new b(MessageDigest.getInstance("SHA-256"));
            } catch (NoSuchAlgorithmException e8) {
                throw new RuntimeException(e8);
            }
        }
    }

    private static final class b implements AbstractC5742a.f {

        /* renamed from: o, reason: collision with root package name */
        final MessageDigest f4089o;

        /* renamed from: s, reason: collision with root package name */
        private final e2.c f4090s = e2.c.a();

        b(MessageDigest messageDigest) {
            this.f4089o = messageDigest;
        }

        @Override // e2.AbstractC5742a.f
        public e2.c h() {
            return this.f4090s;
        }
    }

    private String a(J1.e eVar) {
        b bVar = (b) AbstractC5709k.d(this.f4087b.b());
        try {
            eVar.b(bVar.f4089o);
            return AbstractC5710l.x(bVar.f4089o.digest());
        } finally {
            this.f4087b.a(bVar);
        }
    }

    public String b(J1.e eVar) {
        String str;
        synchronized (this.f4086a) {
            str = (String) this.f4086a.g(eVar);
        }
        if (str == null) {
            str = a(eVar);
        }
        synchronized (this.f4086a) {
            this.f4086a.k(eVar, str);
        }
        return str;
    }
}
