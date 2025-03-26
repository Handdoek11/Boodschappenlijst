package k6;

import a6.AbstractC0825b;
import a6.InterfaceC0826c;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import q6.EnumC6639b;
import r6.AbstractC6711c;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class g extends AbstractC6110a {

    static final class a extends AtomicLong implements InterfaceC0826c, p7.b {

        /* renamed from: o, reason: collision with root package name */
        final p7.a f38573o;

        /* renamed from: s, reason: collision with root package name */
        p7.b f38574s;

        /* renamed from: t, reason: collision with root package name */
        boolean f38575t;

        a(p7.a aVar) {
            this.f38573o = aVar;
        }

        @Override // p7.a
        public void a() {
            if (this.f38575t) {
                return;
            }
            this.f38575t = true;
            this.f38573o.a();
        }

        @Override // p7.a
        public void b(Object obj) {
            if (this.f38575t) {
                return;
            }
            if (get() != 0) {
                this.f38573o.b(obj);
                AbstractC6711c.c(this, 1L);
            } else {
                this.f38574s.cancel();
                onError(new MissingBackpressureException("could not emit value due to lack of requests"));
            }
        }

        @Override // p7.b
        public void cancel() {
            this.f38574s.cancel();
        }

        @Override // p7.a
        public void d(p7.b bVar) {
            if (EnumC6639b.i(this.f38574s, bVar)) {
                this.f38574s = bVar;
                this.f38573o.d(this);
                bVar.h(Long.MAX_VALUE);
            }
        }

        @Override // p7.b
        public void h(long j8) {
            if (EnumC6639b.g(j8)) {
                AbstractC6711c.a(this, j8);
            }
        }

        @Override // p7.a
        public void onError(Throwable th) {
            if (this.f38575t) {
                AbstractC6805a.m(th);
            } else {
                this.f38575t = true;
                this.f38573o.onError(th);
            }
        }
    }

    public g(AbstractC0825b abstractC0825b) {
        super(abstractC0825b);
    }

    @Override // a6.AbstractC0825b
    protected void j(p7.a aVar) {
        this.f38531s.i(new a(aVar));
    }
}
