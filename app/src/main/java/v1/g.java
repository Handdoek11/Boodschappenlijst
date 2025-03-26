package V1;

import J1.l;
import a2.AbstractC0811c;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import b2.InterfaceC0956b;
import c2.C0978b;
import com.bumptech.glide.k;
import d2.AbstractC5709k;
import d2.AbstractC5710l;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
class g {

    /* renamed from: a, reason: collision with root package name */
    private final I1.a f5528a;

    /* renamed from: b, reason: collision with root package name */
    private final Handler f5529b;

    /* renamed from: c, reason: collision with root package name */
    private final List f5530c;

    /* renamed from: d, reason: collision with root package name */
    final k f5531d;

    /* renamed from: e, reason: collision with root package name */
    private final M1.d f5532e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5533f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f5534g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f5535h;

    /* renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.j f5536i;

    /* renamed from: j, reason: collision with root package name */
    private a f5537j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f5538k;

    /* renamed from: l, reason: collision with root package name */
    private a f5539l;

    /* renamed from: m, reason: collision with root package name */
    private Bitmap f5540m;

    /* renamed from: n, reason: collision with root package name */
    private l f5541n;

    /* renamed from: o, reason: collision with root package name */
    private a f5542o;

    /* renamed from: p, reason: collision with root package name */
    private int f5543p;

    /* renamed from: q, reason: collision with root package name */
    private int f5544q;

    /* renamed from: r, reason: collision with root package name */
    private int f5545r;

    static class a extends AbstractC0811c {

        /* renamed from: u, reason: collision with root package name */
        private final Handler f5546u;

        /* renamed from: v, reason: collision with root package name */
        final int f5547v;

        /* renamed from: w, reason: collision with root package name */
        private final long f5548w;

        /* renamed from: x, reason: collision with root package name */
        private Bitmap f5549x;

        a(Handler handler, int i8, long j8) {
            this.f5546u = handler;
            this.f5547v = i8;
            this.f5548w = j8;
        }

        @Override // a2.h
        public void j(Drawable drawable) {
            this.f5549x = null;
        }

        Bitmap k() {
            return this.f5549x;
        }

        @Override // a2.h
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public void g(Bitmap bitmap, InterfaceC0956b interfaceC0956b) {
            this.f5549x = bitmap;
            this.f5546u.sendMessageAtTime(this.f5546u.obtainMessage(1, this), this.f5548w);
        }
    }

    public interface b {
        void a();
    }

    private class c implements Handler.Callback {
        c() {
        }

        @Override // android.os.Handler.Callback
        public boolean handleMessage(Message message) {
            int i8 = message.what;
            if (i8 == 1) {
                g.this.m((a) message.obj);
                return true;
            }
            if (i8 != 2) {
                return false;
            }
            g.this.f5531d.n((a) message.obj);
            return false;
        }
    }

    g(com.bumptech.glide.b bVar, I1.a aVar, int i8, int i9, l lVar, Bitmap bitmap) {
        this(bVar.f(), com.bumptech.glide.b.t(bVar.h()), aVar, null, i(com.bumptech.glide.b.t(bVar.h()), i8, i9), lVar, bitmap);
    }

    private static J1.e g() {
        return new C0978b(Double.valueOf(Math.random()));
    }

    private static com.bumptech.glide.j i(k kVar, int i8, int i9) {
        return kVar.l().b(((Z1.f) ((Z1.f) Z1.f.q0(L1.a.f3693b).o0(true)).i0(true)).Z(i8, i9));
    }

    private void l() {
        if (!this.f5533f || this.f5534g) {
            return;
        }
        if (this.f5535h) {
            AbstractC5709k.a(this.f5542o == null, "Pending target must be null when starting from the first frame");
            this.f5528a.f();
            this.f5535h = false;
        }
        a aVar = this.f5542o;
        if (aVar != null) {
            this.f5542o = null;
            m(aVar);
            return;
        }
        this.f5534g = true;
        long uptimeMillis = SystemClock.uptimeMillis() + this.f5528a.d();
        this.f5528a.b();
        this.f5539l = new a(this.f5529b, this.f5528a.g(), uptimeMillis);
        this.f5536i.b(Z1.f.r0(g())).E0(this.f5528a).x0(this.f5539l);
    }

    private void n() {
        Bitmap bitmap = this.f5540m;
        if (bitmap != null) {
            this.f5532e.c(bitmap);
            this.f5540m = null;
        }
    }

    private void p() {
        if (this.f5533f) {
            return;
        }
        this.f5533f = true;
        this.f5538k = false;
        l();
    }

    private void q() {
        this.f5533f = false;
    }

    void a() {
        this.f5530c.clear();
        n();
        q();
        a aVar = this.f5537j;
        if (aVar != null) {
            this.f5531d.n(aVar);
            this.f5537j = null;
        }
        a aVar2 = this.f5539l;
        if (aVar2 != null) {
            this.f5531d.n(aVar2);
            this.f5539l = null;
        }
        a aVar3 = this.f5542o;
        if (aVar3 != null) {
            this.f5531d.n(aVar3);
            this.f5542o = null;
        }
        this.f5528a.clear();
        this.f5538k = true;
    }

    ByteBuffer b() {
        return this.f5528a.getData().asReadOnlyBuffer();
    }

    Bitmap c() {
        a aVar = this.f5537j;
        return aVar != null ? aVar.k() : this.f5540m;
    }

    int d() {
        a aVar = this.f5537j;
        if (aVar != null) {
            return aVar.f5547v;
        }
        return -1;
    }

    Bitmap e() {
        return this.f5540m;
    }

    int f() {
        return this.f5528a.c();
    }

    int h() {
        return this.f5545r;
    }

    int j() {
        return this.f5528a.h() + this.f5543p;
    }

    int k() {
        return this.f5544q;
    }

    void m(a aVar) {
        this.f5534g = false;
        if (this.f5538k) {
            this.f5529b.obtainMessage(2, aVar).sendToTarget();
            return;
        }
        if (!this.f5533f) {
            if (this.f5535h) {
                this.f5529b.obtainMessage(2, aVar).sendToTarget();
                return;
            } else {
                this.f5542o = aVar;
                return;
            }
        }
        if (aVar.k() != null) {
            n();
            a aVar2 = this.f5537j;
            this.f5537j = aVar;
            for (int size = this.f5530c.size() - 1; size >= 0; size--) {
                ((b) this.f5530c.get(size)).a();
            }
            if (aVar2 != null) {
                this.f5529b.obtainMessage(2, aVar2).sendToTarget();
            }
        }
        l();
    }

    void o(l lVar, Bitmap bitmap) {
        this.f5541n = (l) AbstractC5709k.d(lVar);
        this.f5540m = (Bitmap) AbstractC5709k.d(bitmap);
        this.f5536i = this.f5536i.b(new Z1.f().j0(lVar));
        this.f5543p = AbstractC5710l.h(bitmap);
        this.f5544q = bitmap.getWidth();
        this.f5545r = bitmap.getHeight();
    }

    void r(b bVar) {
        if (this.f5538k) {
            throw new IllegalStateException("Cannot subscribe to a cleared frame loader");
        }
        if (this.f5530c.contains(bVar)) {
            throw new IllegalStateException("Cannot subscribe twice in a row");
        }
        boolean isEmpty = this.f5530c.isEmpty();
        this.f5530c.add(bVar);
        if (isEmpty) {
            p();
        }
    }

    void s(b bVar) {
        this.f5530c.remove(bVar);
        if (this.f5530c.isEmpty()) {
            q();
        }
    }

    g(M1.d dVar, k kVar, I1.a aVar, Handler handler, com.bumptech.glide.j jVar, l lVar, Bitmap bitmap) {
        this.f5530c = new ArrayList();
        this.f5531d = kVar;
        handler = handler == null ? new Handler(Looper.getMainLooper(), new c()) : handler;
        this.f5532e = dVar;
        this.f5529b = handler;
        this.f5536i = jVar;
        this.f5528a = aVar;
        o(lVar, bitmap);
    }
}
