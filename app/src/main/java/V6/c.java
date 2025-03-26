package V6;

import A6.g;
import I6.l;
import J6.AbstractC0650j;
import J6.r;
import J6.s;
import P6.m;
import U6.AbstractC0751y0;
import U6.C0706b0;
import U6.InterfaceC0731o;
import U6.W;
import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.CancellationException;
import x6.C6916E;

/* loaded from: classes2.dex */
public final class c extends d implements W {
    private volatile c _immediate;

    /* renamed from: t, reason: collision with root package name */
    private final Handler f5734t;

    /* renamed from: u, reason: collision with root package name */
    private final String f5735u;

    /* renamed from: v, reason: collision with root package name */
    private final boolean f5736v;

    /* renamed from: w, reason: collision with root package name */
    private final c f5737w;

    public static final class a implements Runnable {

        /* renamed from: o, reason: collision with root package name */
        final /* synthetic */ InterfaceC0731o f5738o;

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ c f5739s;

        public a(InterfaceC0731o interfaceC0731o, c cVar) {
            this.f5738o = interfaceC0731o;
            this.f5739s = cVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.f5738o.o(this.f5739s, C6916E.f44463a);
        }
    }

    static final class b extends s implements l {

        /* renamed from: s, reason: collision with root package name */
        final /* synthetic */ Runnable f5741s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(Runnable runnable) {
            super(1);
            this.f5741s = runnable;
        }

        public final void b(Throwable th) {
            c.this.f5734t.removeCallbacks(this.f5741s);
        }

        @Override // I6.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            b((Throwable) obj);
            return C6916E.f44463a;
        }
    }

    private c(Handler handler, String str, boolean z7) {
        super(null);
        this.f5734t = handler;
        this.f5735u = str;
        this.f5736v = z7;
        this._immediate = z7 ? this : null;
        c cVar = this._immediate;
        if (cVar == null) {
            cVar = new c(handler, str, true);
            this._immediate = cVar;
        }
        this.f5737w = cVar;
    }

    private final void D0(g gVar, Runnable runnable) {
        AbstractC0751y0.c(gVar, new CancellationException("The task was rejected, the handler underlying the dispatcher '" + this + "' was closed"));
        C0706b0.b().q0(gVar, runnable);
    }

    @Override // U6.W
    public void E(long j8, InterfaceC0731o interfaceC0731o) {
        a aVar = new a(interfaceC0731o, this);
        if (this.f5734t.postDelayed(aVar, m.f(j8, 4611686018427387903L))) {
            interfaceC0731o.q(new b(aVar));
        } else {
            D0(interfaceC0731o.getContext(), aVar);
        }
    }

    @Override // U6.G0
    /* renamed from: E0, reason: merged with bridge method [inline-methods] */
    public c A0() {
        return this.f5737w;
    }

    public boolean equals(Object obj) {
        return (obj instanceof c) && ((c) obj).f5734t == this.f5734t;
    }

    public int hashCode() {
        return System.identityHashCode(this.f5734t);
    }

    @Override // U6.I
    public void q0(g gVar, Runnable runnable) {
        if (this.f5734t.post(runnable)) {
            return;
        }
        D0(gVar, runnable);
    }

    @Override // U6.I
    public String toString() {
        String B02 = B0();
        if (B02 != null) {
            return B02;
        }
        String str = this.f5735u;
        if (str == null) {
            str = this.f5734t.toString();
        }
        if (!this.f5736v) {
            return str;
        }
        return str + ".immediate";
    }

    @Override // U6.I
    public boolean x0(g gVar) {
        return (this.f5736v && r.a(Looper.myLooper(), this.f5734t.getLooper())) ? false : true;
    }

    public /* synthetic */ c(Handler handler, String str, int i8, AbstractC0650j abstractC0650j) {
        this(handler, (i8 & 2) != 0 ? null : str);
    }

    public c(Handler handler, String str) {
        this(handler, str, false);
    }
}
