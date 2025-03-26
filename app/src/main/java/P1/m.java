package P1;

import d2.AbstractC5710l;
import d2.C5706h;
import java.util.Queue;

/* loaded from: classes.dex */
public class m {

    /* renamed from: a, reason: collision with root package name */
    private final C5706h f4345a;

    class a extends C5706h {
        a(long j8) {
            super(j8);
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // d2.C5706h
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public void j(b bVar, Object obj) {
            bVar.c();
        }
    }

    static final class b {

        /* renamed from: d, reason: collision with root package name */
        private static final Queue f4347d = AbstractC5710l.f(0);

        /* renamed from: a, reason: collision with root package name */
        private int f4348a;

        /* renamed from: b, reason: collision with root package name */
        private int f4349b;

        /* renamed from: c, reason: collision with root package name */
        private Object f4350c;

        private b() {
        }

        static b a(Object obj, int i8, int i9) {
            b bVar;
            Queue queue = f4347d;
            synchronized (queue) {
                bVar = (b) queue.poll();
            }
            if (bVar == null) {
                bVar = new b();
            }
            bVar.b(obj, i8, i9);
            return bVar;
        }

        private void b(Object obj, int i8, int i9) {
            this.f4350c = obj;
            this.f4349b = i8;
            this.f4348a = i9;
        }

        public void c() {
            Queue queue = f4347d;
            synchronized (queue) {
                queue.offer(this);
            }
        }

        public boolean equals(Object obj) {
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f4349b == bVar.f4349b && this.f4348a == bVar.f4348a && this.f4350c.equals(bVar.f4350c);
        }

        public int hashCode() {
            return (((this.f4348a * 31) + this.f4349b) * 31) + this.f4350c.hashCode();
        }
    }

    public m(long j8) {
        this.f4345a = new a(j8);
    }

    public Object a(Object obj, int i8, int i9) {
        b a8 = b.a(obj, i8, i9);
        Object g8 = this.f4345a.g(a8);
        a8.c();
        return g8;
    }

    public void b(Object obj, int i8, int i9, Object obj2) {
        this.f4345a.k(b.a(obj, i8, i9), obj2);
    }
}
