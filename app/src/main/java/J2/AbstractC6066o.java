package j2;

import h2.AbstractC5830d;
import h2.C5829c;
import h2.InterfaceC5834h;
import j2.C6054c;

/* renamed from: j2.o, reason: case insensitive filesystem */
/* loaded from: classes.dex */
abstract class AbstractC6066o {

    /* renamed from: j2.o$a */
    public static abstract class a {
        public abstract AbstractC6066o a();

        abstract a b(C5829c c5829c);

        abstract a c(AbstractC5830d abstractC5830d);

        abstract a d(InterfaceC5834h interfaceC5834h);

        public abstract a e(AbstractC6067p abstractC6067p);

        public abstract a f(String str);
    }

    AbstractC6066o() {
    }

    public static a a() {
        return new C6054c.b();
    }

    public abstract C5829c b();

    abstract AbstractC5830d c();

    public byte[] d() {
        return (byte[]) e().apply(c().c());
    }

    abstract InterfaceC5834h e();

    public abstract AbstractC6067p f();

    public abstract String g();
}
