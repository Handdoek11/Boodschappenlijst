package m6;

import a6.InterfaceC0830g;
import a6.j;
import d6.InterfaceC5732b;
import g6.EnumC5814b;
import i6.InterfaceC5876a;
import i6.InterfaceC5880e;
import j6.AbstractC6082b;
import n6.C6276b;
import t6.AbstractC6805a;

/* loaded from: classes2.dex */
public final class o extends AbstractC6226a {

    /* renamed from: s, reason: collision with root package name */
    final a6.j f39342s;

    /* renamed from: t, reason: collision with root package name */
    final boolean f39343t;

    /* renamed from: u, reason: collision with root package name */
    final int f39344u;

    static final class a extends AbstractC6082b implements a6.i, Runnable {

        /* renamed from: A, reason: collision with root package name */
        int f39345A;

        /* renamed from: B, reason: collision with root package name */
        boolean f39346B;

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39347o;

        /* renamed from: s, reason: collision with root package name */
        final j.c f39348s;

        /* renamed from: t, reason: collision with root package name */
        final boolean f39349t;

        /* renamed from: u, reason: collision with root package name */
        final int f39350u;

        /* renamed from: v, reason: collision with root package name */
        InterfaceC5880e f39351v;

        /* renamed from: w, reason: collision with root package name */
        InterfaceC5732b f39352w;

        /* renamed from: x, reason: collision with root package name */
        Throwable f39353x;

        /* renamed from: y, reason: collision with root package name */
        volatile boolean f39354y;

        /* renamed from: z, reason: collision with root package name */
        volatile boolean f39355z;

        a(a6.i iVar, j.c cVar, boolean z7, int i8) {
            this.f39347o = iVar;
            this.f39348s = cVar;
            this.f39349t = z7;
            this.f39350u = i8;
        }

        @Override // a6.i
        public void a() {
            if (this.f39354y) {
                return;
            }
            this.f39354y = true;
            k();
        }

        @Override // a6.i
        public void b(Object obj) {
            if (this.f39354y) {
                return;
            }
            if (this.f39345A != 2) {
                this.f39351v.g(obj);
            }
            k();
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            if (this.f39355z) {
                return;
            }
            this.f39355z = true;
            this.f39352w.c();
            this.f39348s.c();
            if (this.f39346B || getAndIncrement() != 0) {
                return;
            }
            this.f39351v.clear();
        }

        @Override // i6.InterfaceC5880e
        public void clear() {
            this.f39351v.clear();
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            if (EnumC5814b.l(this.f39352w, interfaceC5732b)) {
                this.f39352w = interfaceC5732b;
                if (interfaceC5732b instanceof InterfaceC5876a) {
                    InterfaceC5876a interfaceC5876a = (InterfaceC5876a) interfaceC5732b;
                    int i8 = interfaceC5876a.i(7);
                    if (i8 == 1) {
                        this.f39345A = i8;
                        this.f39351v = interfaceC5876a;
                        this.f39354y = true;
                        this.f39347o.d(this);
                        k();
                        return;
                    }
                    if (i8 == 2) {
                        this.f39345A = i8;
                        this.f39351v = interfaceC5876a;
                        this.f39347o.d(this);
                        return;
                    }
                }
                this.f39351v = new C6276b(this.f39350u);
                this.f39347o.d(this);
            }
        }

        boolean e(boolean z7, boolean z8, a6.i iVar) {
            if (this.f39355z) {
                this.f39351v.clear();
                return true;
            }
            if (!z7) {
                return false;
            }
            Throwable th = this.f39353x;
            if (this.f39349t) {
                if (!z8) {
                    return false;
                }
                this.f39355z = true;
                if (th != null) {
                    iVar.onError(th);
                } else {
                    iVar.a();
                }
                this.f39348s.c();
                return true;
            }
            if (th != null) {
                this.f39355z = true;
                this.f39351v.clear();
                iVar.onError(th);
                this.f39348s.c();
                return true;
            }
            if (!z8) {
                return false;
            }
            this.f39355z = true;
            iVar.a();
            this.f39348s.c();
            return true;
        }

        @Override // i6.InterfaceC5880e
        public Object f() {
            return this.f39351v.f();
        }

        void h() {
            int i8 = 1;
            while (!this.f39355z) {
                boolean z7 = this.f39354y;
                Throwable th = this.f39353x;
                if (!this.f39349t && z7 && th != null) {
                    this.f39355z = true;
                    this.f39347o.onError(this.f39353x);
                    this.f39348s.c();
                    return;
                }
                this.f39347o.b(null);
                if (z7) {
                    this.f39355z = true;
                    Throwable th2 = this.f39353x;
                    if (th2 != null) {
                        this.f39347o.onError(th2);
                    } else {
                        this.f39347o.a();
                    }
                    this.f39348s.c();
                    return;
                }
                i8 = addAndGet(-i8);
                if (i8 == 0) {
                    return;
                }
            }
        }

        @Override // i6.InterfaceC5877b
        public int i(int i8) {
            if ((i8 & 2) == 0) {
                return 0;
            }
            this.f39346B = true;
            return 2;
        }

        @Override // i6.InterfaceC5880e
        public boolean isEmpty() {
            return this.f39351v.isEmpty();
        }

        /* JADX WARN: Code restructure failed: missing block: B:15:0x0027, code lost:
        
            r3 = addAndGet(-r3);
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x002c, code lost:
        
            if (r3 != 0) goto L27;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x002e, code lost:
        
            return;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void j() {
            /*
                r7 = this;
                i6.e r0 = r7.f39351v
                a6.i r1 = r7.f39347o
                r2 = 1
                r3 = r2
            L6:
                boolean r4 = r7.f39354y
                boolean r5 = r0.isEmpty()
                boolean r4 = r7.e(r4, r5, r1)
                if (r4 == 0) goto L13
                return
            L13:
                boolean r4 = r7.f39354y
                java.lang.Object r5 = r0.f()     // Catch: java.lang.Throwable -> L33
                if (r5 != 0) goto L1d
                r6 = r2
                goto L1e
            L1d:
                r6 = 0
            L1e:
                boolean r4 = r7.e(r4, r6, r1)
                if (r4 == 0) goto L25
                return
            L25:
                if (r6 == 0) goto L2f
                int r3 = -r3
                int r3 = r7.addAndGet(r3)
                if (r3 != 0) goto L6
                return
            L2f:
                r1.b(r5)
                goto L13
            L33:
                r3 = move-exception
                e6.AbstractC5751a.b(r3)
                r7.f39355z = r2
                d6.b r2 = r7.f39352w
                r2.c()
                r0.clear()
                r1.onError(r3)
                a6.j$c r0 = r7.f39348s
                r0.c()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m6.o.a.j():void");
        }

        void k() {
            if (getAndIncrement() == 0) {
                this.f39348s.b(this);
            }
        }

        @Override // a6.i
        public void onError(Throwable th) {
            if (this.f39354y) {
                AbstractC6805a.m(th);
                return;
            }
            this.f39353x = th;
            this.f39354y = true;
            k();
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f39346B) {
                h();
            } else {
                j();
            }
        }
    }

    public o(InterfaceC0830g interfaceC0830g, a6.j jVar, boolean z7, int i8) {
        super(interfaceC0830g);
        this.f39342s = jVar;
        this.f39343t = z7;
        this.f39344u = i8;
    }

    @Override // a6.AbstractC0829f
    protected void G(a6.i iVar) {
        a6.j jVar = this.f39342s;
        if (jVar instanceof o6.m) {
            this.f39239o.c(iVar);
        } else {
            this.f39239o.c(new a(iVar, jVar.b(), this.f39343t, this.f39344u));
        }
    }
}
