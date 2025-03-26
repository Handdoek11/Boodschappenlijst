package k6;

import a6.AbstractC0825b;
import a6.InterfaceC0826c;
import e6.AbstractC5751a;
import java.util.concurrent.atomic.AtomicLong;
import q6.EnumC6639b;
import r6.AbstractC6711c;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class f extends AbstractC6110a implements f6.d {

    /* renamed from: t, reason: collision with root package name */
    final f6.d f38568t;

    static final class a extends AtomicLong implements InterfaceC0826c, p7.b {

        /* renamed from: o, reason: collision with root package name */
        final p7.a f38569o;

        /* renamed from: s, reason: collision with root package name */
        final f6.d f38570s;

        /* renamed from: t, reason: collision with root package name */
        p7.b f38571t;

        /* renamed from: u, reason: collision with root package name */
        boolean f38572u;

        a(p7.a aVar, f6.d dVar) {
            this.f38569o = aVar;
            this.f38570s = dVar;
        }

        @Override // p7.a
        public void a() {
            if (this.f38572u) {
                return;
            }
            this.f38572u = true;
            this.f38569o.a();
        }

        @Override // p7.a
        public void b(Object obj) {
            if (this.f38572u) {
                return;
            }
            if (get() != 0) {
                this.f38569o.b(obj);
                AbstractC6711c.c(this, 1L);
                return;
            }
            try {
                this.f38570s.accept(obj);
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                cancel();
                onError(th);
            }
        }

        @Override // p7.b
        public void cancel() {
            this.f38571t.cancel();
        }

        @Override // p7.a
        public void d(p7.b bVar) {
            if (EnumC6639b.i(this.f38571t, bVar)) {
                this.f38571t = bVar;
                this.f38569o.d(this);
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
            if (this.f38572u) {
                AbstractC6805a.m(th);
            } else {
                this.f38572u = true;
                this.f38569o.onError(th);
            }
        }
    }

    public f(AbstractC0825b abstractC0825b) {
        super(abstractC0825b);
        this.f38568t = this;
    }

    @Override // a6.AbstractC0825b
    protected void j(p7.a aVar) {
        this.f38531s.i(new a(aVar, this.f38568t));
    }

    @Override // f6.d
    public void accept(Object obj) {
    }
}
