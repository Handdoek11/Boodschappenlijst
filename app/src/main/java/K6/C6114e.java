package k6;

import a6.AbstractC0825b;
import a6.InterfaceC0826c;
import e6.AbstractC5751a;
import f6.InterfaceC5793a;
import i6.InterfaceC5879d;
import io.reactivex.exceptions.MissingBackpressureException;
import java.util.concurrent.atomic.AtomicLong;
import n6.C6275a;
import n6.C6276b;
import q6.AbstractC6638a;
import q6.EnumC6639b;
import r6.AbstractC6711c;

/* renamed from: k6.e, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6114e extends AbstractC6110a {

    /* renamed from: t, reason: collision with root package name */
    final int f38554t;

    /* renamed from: u, reason: collision with root package name */
    final boolean f38555u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f38556v;

    /* renamed from: w, reason: collision with root package name */
    final InterfaceC5793a f38557w;

    /* renamed from: k6.e$a */
    static final class a extends AbstractC6638a implements InterfaceC0826c {

        /* renamed from: A, reason: collision with root package name */
        boolean f38558A;

        /* renamed from: o, reason: collision with root package name */
        final p7.a f38559o;

        /* renamed from: s, reason: collision with root package name */
        final InterfaceC5879d f38560s;

        /* renamed from: t, reason: collision with root package name */
        final boolean f38561t;

        /* renamed from: u, reason: collision with root package name */
        final InterfaceC5793a f38562u;

        /* renamed from: v, reason: collision with root package name */
        p7.b f38563v;

        /* renamed from: w, reason: collision with root package name */
        volatile boolean f38564w;

        /* renamed from: x, reason: collision with root package name */
        volatile boolean f38565x;

        /* renamed from: y, reason: collision with root package name */
        Throwable f38566y;

        /* renamed from: z, reason: collision with root package name */
        final AtomicLong f38567z = new AtomicLong();

        a(p7.a aVar, int i8, boolean z7, boolean z8, InterfaceC5793a interfaceC5793a) {
            this.f38559o = aVar;
            this.f38562u = interfaceC5793a;
            this.f38561t = z8;
            this.f38560s = z7 ? new C6276b(i8) : new C6275a(i8);
        }

        @Override // p7.a
        public void a() {
            this.f38565x = true;
            if (this.f38558A) {
                this.f38559o.a();
            } else {
                e();
            }
        }

        @Override // p7.a
        public void b(Object obj) {
            if (this.f38560s.g(obj)) {
                if (this.f38558A) {
                    this.f38559o.b(null);
                    return;
                } else {
                    e();
                    return;
                }
            }
            this.f38563v.cancel();
            MissingBackpressureException missingBackpressureException = new MissingBackpressureException("Buffer is full");
            try {
                this.f38562u.run();
            } catch (Throwable th) {
                AbstractC5751a.b(th);
                missingBackpressureException.initCause(th);
            }
            onError(missingBackpressureException);
        }

        boolean c(boolean z7, boolean z8, p7.a aVar) {
            if (this.f38564w) {
                this.f38560s.clear();
                return true;
            }
            if (!z7) {
                return false;
            }
            if (this.f38561t) {
                if (!z8) {
                    return false;
                }
                Throwable th = this.f38566y;
                if (th != null) {
                    aVar.onError(th);
                } else {
                    aVar.a();
                }
                return true;
            }
            Throwable th2 = this.f38566y;
            if (th2 != null) {
                this.f38560s.clear();
                aVar.onError(th2);
                return true;
            }
            if (!z8) {
                return false;
            }
            aVar.a();
            return true;
        }

        @Override // p7.b
        public void cancel() {
            if (this.f38564w) {
                return;
            }
            this.f38564w = true;
            this.f38563v.cancel();
            if (this.f38558A || getAndIncrement() != 0) {
                return;
            }
            this.f38560s.clear();
        }

        @Override // i6.InterfaceC5880e
        public void clear() {
            this.f38560s.clear();
        }

        @Override // p7.a
        public void d(p7.b bVar) {
            if (EnumC6639b.i(this.f38563v, bVar)) {
                this.f38563v = bVar;
                this.f38559o.d(this);
                bVar.h(Long.MAX_VALUE);
            }
        }

        void e() {
            if (getAndIncrement() == 0) {
                InterfaceC5879d interfaceC5879d = this.f38560s;
                p7.a aVar = this.f38559o;
                int i8 = 1;
                while (!c(this.f38565x, interfaceC5879d.isEmpty(), aVar)) {
                    long j8 = this.f38567z.get();
                    long j9 = 0;
                    while (j9 != j8) {
                        boolean z7 = this.f38565x;
                        Object f8 = interfaceC5879d.f();
                        boolean z8 = f8 == null;
                        if (c(z7, z8, aVar)) {
                            return;
                        }
                        if (z8) {
                            break;
                        }
                        aVar.b(f8);
                        j9++;
                    }
                    if (j9 == j8 && c(this.f38565x, interfaceC5879d.isEmpty(), aVar)) {
                        return;
                    }
                    if (j9 != 0 && j8 != Long.MAX_VALUE) {
                        this.f38567z.addAndGet(-j9);
                    }
                    i8 = addAndGet(-i8);
                    if (i8 == 0) {
                        return;
                    }
                }
            }
        }

        @Override // i6.InterfaceC5880e
        public Object f() {
            return this.f38560s.f();
        }

        @Override // p7.b
        public void h(long j8) {
            if (this.f38558A || !EnumC6639b.g(j8)) {
                return;
            }
            AbstractC6711c.a(this.f38567z, j8);
            e();
        }

        @Override // i6.InterfaceC5877b
        public int i(int i8) {
            if ((i8 & 2) == 0) {
                return 0;
            }
            this.f38558A = true;
            return 2;
        }

        @Override // i6.InterfaceC5880e
        public boolean isEmpty() {
            return this.f38560s.isEmpty();
        }

        @Override // p7.a
        public void onError(Throwable th) {
            this.f38566y = th;
            this.f38565x = true;
            if (this.f38558A) {
                this.f38559o.onError(th);
            } else {
                e();
            }
        }
    }

    public C6114e(AbstractC0825b abstractC0825b, int i8, boolean z7, boolean z8, InterfaceC5793a interfaceC5793a) {
        super(abstractC0825b);
        this.f38554t = i8;
        this.f38555u = z7;
        this.f38556v = z8;
        this.f38557w = interfaceC5793a;
    }

    @Override // a6.AbstractC0825b
    protected void j(p7.a aVar) {
        this.f38531s.i(new a(aVar, this.f38554t, this.f38555u, this.f38556v, this.f38557w));
    }
}
