package j2;

import android.util.Base64;
import h2.EnumC5832f;
import j2.C6055d;

/* renamed from: j2.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC6067p {

    /* renamed from: j2.p$a */
    public static abstract class a {
        public abstract AbstractC6067p a();

        public abstract a b(String str);

        public abstract a c(byte[] bArr);

        public abstract a d(EnumC5832f enumC5832f);
    }

    public static a a() {
        return new C6055d.b().d(EnumC5832f.DEFAULT);
    }

    public abstract String b();

    public abstract byte[] c();

    public abstract EnumC5832f d();

    public boolean e() {
        return c() != null;
    }

    public AbstractC6067p f(EnumC5832f enumC5832f) {
        return a().b(b()).d(enumC5832f).c(c()).a();
    }

    public final String toString() {
        return String.format("TransportContext(%s, %s, %s)", b(), d(), c() == null ? "" : Base64.encodeToString(c(), 2));
    }
}
