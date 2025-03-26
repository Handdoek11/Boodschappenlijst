package m6;

import a6.AbstractC0829f;
import a6.InterfaceC0830g;
import d6.InterfaceC5732b;
import e6.AbstractC5751a;
import g6.EnumC5814b;
import g6.EnumC5815c;
import h6.AbstractC5844b;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import n6.C6276b;
import r6.C6710b;

/* loaded from: classes2.dex */
public final class b extends AbstractC0829f {

    /* renamed from: o, reason: collision with root package name */
    final InterfaceC0830g[] f39240o;

    /* renamed from: s, reason: collision with root package name */
    final Iterable f39241s;

    /* renamed from: t, reason: collision with root package name */
    final f6.g f39242t;

    /* renamed from: u, reason: collision with root package name */
    final int f39243u;

    /* renamed from: v, reason: collision with root package name */
    final boolean f39244v;

    static final class a extends AtomicReference implements a6.i {

        /* renamed from: o, reason: collision with root package name */
        final C0292b f39245o;

        /* renamed from: s, reason: collision with root package name */
        final int f39246s;

        a(C0292b c0292b, int i8) {
            this.f39245o = c0292b;
            this.f39246s = i8;
        }

        @Override // a6.i
        public void a() {
            this.f39245o.e(this.f39246s);
        }

        @Override // a6.i
        public void b(Object obj) {
            this.f39245o.g(this.f39246s, obj);
        }

        public void c() {
            EnumC5814b.a(this);
        }

        @Override // a6.i
        public void d(InterfaceC5732b interfaceC5732b) {
            EnumC5814b.i(this, interfaceC5732b);
        }

        @Override // a6.i
        public void onError(Throwable th) {
            this.f39245o.f(this.f39246s, th);
        }
    }

    /* renamed from: m6.b$b, reason: collision with other inner class name */
    static final class C0292b extends AtomicInteger implements InterfaceC5732b {

        /* renamed from: A, reason: collision with root package name */
        int f39247A;

        /* renamed from: B, reason: collision with root package name */
        int f39248B;

        /* renamed from: o, reason: collision with root package name */
        final a6.i f39249o;

        /* renamed from: s, reason: collision with root package name */
        final f6.g f39250s;

        /* renamed from: t, reason: collision with root package name */
        final a[] f39251t;

        /* renamed from: u, reason: collision with root package name */
        Object[] f39252u;

        /* renamed from: v, reason: collision with root package name */
        final C6276b f39253v;

        /* renamed from: w, reason: collision with root package name */
        final boolean f39254w;

        /* renamed from: x, reason: collision with root package name */
        volatile boolean f39255x;

        /* renamed from: y, reason: collision with root package name */
        volatile boolean f39256y;

        /* renamed from: z, reason: collision with root package name */
        final C6710b f39257z = new C6710b();

        C0292b(a6.i iVar, f6.g gVar, int i8, int i9, boolean z7) {
            this.f39249o = iVar;
            this.f39250s = gVar;
            this.f39254w = z7;
            this.f39252u = new Object[i8];
            a[] aVarArr = new a[i8];
            for (int i10 = 0; i10 < i8; i10++) {
                aVarArr[i10] = new a(this, i10);
            }
            this.f39251t = aVarArr;
            this.f39253v = new C6276b(i9);
        }

        void a() {
            for (a aVar : this.f39251t) {
                aVar.c();
            }
        }

        void b(C6276b c6276b) {
            synchronized (this) {
                this.f39252u = null;
            }
            c6276b.clear();
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            if (this.f39255x) {
                return;
            }
            this.f39255x = true;
            a();
            if (getAndIncrement() == 0) {
                b(this.f39253v);
            }
        }

        void d() {
            if (getAndIncrement() != 0) {
                return;
            }
            C6276b c6276b = this.f39253v;
            a6.i iVar = this.f39249o;
            boolean z7 = this.f39254w;
            int i8 = 1;
            while (!this.f39255x) {
                if (!z7 && this.f39257z.get() != null) {
                    a();
                    b(c6276b);
                    iVar.onError(this.f39257z.b());
                    return;
                }
                boolean z8 = this.f39256y;
                Object[] objArr = (Object[]) c6276b.f();
                boolean z9 = objArr == null;
                if (z8 && z9) {
                    b(c6276b);
                    Throwable b8 = this.f39257z.b();
                    if (b8 == null) {
                        iVar.a();
                        return;
                    } else {
                        iVar.onError(b8);
                        return;
                    }
                }
                if (z9) {
                    i8 = addAndGet(-i8);
                    if (i8 == 0) {
                        return;
                    }
                } else {
                    try {
                        iVar.b(AbstractC5844b.e(this.f39250s.apply(objArr), "The combiner returned a null value"));
                    } catch (Throwable th) {
                        AbstractC5751a.b(th);
                        this.f39257z.a(th);
                        a();
                        b(c6276b);
                        iVar.onError(this.f39257z.b());
                        return;
                    }
                }
            }
            b(c6276b);
        }

        /* JADX WARN: Removed duplicated region for block: B:16:0x001b A[Catch: all -> 0x0007, TryCatch #0 {all -> 0x0007, blocks: (B:3:0x0001, B:5:0x0005, B:9:0x0009, B:14:0x0013, B:17:0x001d, B:16:0x001b), top: B:24:0x0001 }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void e(int r4) {
            /*
                r3 = this;
                monitor-enter(r3)
                java.lang.Object[] r0 = r3.f39252u     // Catch: java.lang.Throwable -> L7
                if (r0 != 0) goto L9
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                return
            L7:
                r4 = move-exception
                goto L27
            L9:
                r4 = r0[r4]     // Catch: java.lang.Throwable -> L7
                r1 = 1
                if (r4 != 0) goto L10
                r4 = r1
                goto L11
            L10:
                r4 = 0
            L11:
                if (r4 != 0) goto L1b
                int r2 = r3.f39248B     // Catch: java.lang.Throwable -> L7
                int r2 = r2 + r1
                r3.f39248B = r2     // Catch: java.lang.Throwable -> L7
                int r0 = r0.length     // Catch: java.lang.Throwable -> L7
                if (r2 != r0) goto L1d
            L1b:
                r3.f39256y = r1     // Catch: java.lang.Throwable -> L7
            L1d:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                if (r4 == 0) goto L23
                r3.a()
            L23:
                r3.d()
                return
            L27:
                monitor-exit(r3)     // Catch: java.lang.Throwable -> L7
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: m6.b.C0292b.e(int):void");
        }

        /* JADX WARN: Removed duplicated region for block: B:20:0x0027 A[Catch: all -> 0x0014, TryCatch #0 {all -> 0x0014, blocks: (B:7:0x000e, B:9:0x0012, B:13:0x0016, B:18:0x001f, B:21:0x0029, B:20:0x0027), top: B:30:0x000e }] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        void f(int r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                r6.b r0 = r2.f39257z
                boolean r0 = r0.a(r4)
                if (r0 == 0) goto L37
                boolean r4 = r2.f39254w
                r0 = 1
                if (r4 == 0) goto L2e
                monitor-enter(r2)
                java.lang.Object[] r4 = r2.f39252u     // Catch: java.lang.Throwable -> L14
                if (r4 != 0) goto L16
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                return
            L14:
                r3 = move-exception
                goto L2c
            L16:
                r3 = r4[r3]     // Catch: java.lang.Throwable -> L14
                if (r3 != 0) goto L1c
                r3 = r0
                goto L1d
            L1c:
                r3 = 0
            L1d:
                if (r3 != 0) goto L27
                int r1 = r2.f39248B     // Catch: java.lang.Throwable -> L14
                int r1 = r1 + r0
                r2.f39248B = r1     // Catch: java.lang.Throwable -> L14
                int r4 = r4.length     // Catch: java.lang.Throwable -> L14
                if (r1 != r4) goto L29
            L27:
                r2.f39256y = r0     // Catch: java.lang.Throwable -> L14
            L29:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                r0 = r3
                goto L2e
            L2c:
                monitor-exit(r2)     // Catch: java.lang.Throwable -> L14
                throw r3
            L2e:
                if (r0 == 0) goto L33
                r2.a()
            L33:
                r2.d()
                goto L3a
            L37:
                t6.AbstractC6805a.m(r4)
            L3a:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: m6.b.C0292b.f(int, java.lang.Throwable):void");
        }

        void g(int i8, Object obj) {
            boolean z7;
            synchronized (this) {
                try {
                    Object[] objArr = this.f39252u;
                    if (objArr == null) {
                        return;
                    }
                    Object obj2 = objArr[i8];
                    int i9 = this.f39247A;
                    if (obj2 == null) {
                        i9++;
                        this.f39247A = i9;
                    }
                    objArr[i8] = obj;
                    if (i9 == objArr.length) {
                        this.f39253v.g(objArr.clone());
                        z7 = true;
                    } else {
                        z7 = false;
                    }
                    if (z7) {
                        d();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        public void h(InterfaceC0830g[] interfaceC0830gArr) {
            a[] aVarArr = this.f39251t;
            int length = aVarArr.length;
            this.f39249o.d(this);
            for (int i8 = 0; i8 < length && !this.f39256y && !this.f39255x; i8++) {
                interfaceC0830gArr[i8].c(aVarArr[i8]);
            }
        }
    }

    public b(InterfaceC0830g[] interfaceC0830gArr, Iterable iterable, f6.g gVar, int i8, boolean z7) {
        this.f39240o = interfaceC0830gArr;
        this.f39241s = iterable;
        this.f39242t = gVar;
        this.f39243u = i8;
        this.f39244v = z7;
    }

    @Override // a6.AbstractC0829f
    public void G(a6.i iVar) {
        int length;
        InterfaceC0830g[] interfaceC0830gArr = this.f39240o;
        if (interfaceC0830gArr == null) {
            interfaceC0830gArr = new InterfaceC0830g[8];
            length = 0;
            for (InterfaceC0830g interfaceC0830g : this.f39241s) {
                if (length == interfaceC0830gArr.length) {
                    InterfaceC0830g[] interfaceC0830gArr2 = new InterfaceC0830g[(length >> 2) + length];
                    System.arraycopy(interfaceC0830gArr, 0, interfaceC0830gArr2, 0, length);
                    interfaceC0830gArr = interfaceC0830gArr2;
                }
                interfaceC0830gArr[length] = interfaceC0830g;
                length++;
            }
        } else {
            length = interfaceC0830gArr.length;
        }
        int i8 = length;
        if (i8 == 0) {
            EnumC5815c.a(iVar);
        } else {
            new C0292b(iVar, this.f39242t, i8, this.f39243u, this.f39244v).h(interfaceC0830gArr);
        }
    }
}
