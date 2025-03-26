package U6;

import A6.g;
import J6.AbstractC0650j;
import java.io.Closeable;

/* renamed from: U6.l0, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC0726l0 extends I implements Closeable {

    /* renamed from: t, reason: collision with root package name */
    public static final a f5466t = new a(null);

    /* renamed from: U6.l0$a */
    public static final class a extends A6.b {

        /* renamed from: U6.l0$a$a, reason: collision with other inner class name */
        static final class C0111a extends J6.s implements I6.l {

            /* renamed from: o, reason: collision with root package name */
            public static final C0111a f5467o = new C0111a();

            C0111a() {
                super(1);
            }

            @Override // I6.l
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final AbstractC0726l0 invoke(g.b bVar) {
                if (bVar instanceof AbstractC0726l0) {
                    return (AbstractC0726l0) bVar;
                }
                return null;
            }
        }

        public /* synthetic */ a(AbstractC0650j abstractC0650j) {
            this();
        }

        private a() {
            super(I.f5403s, C0111a.f5467o);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public abstract void close();
}
