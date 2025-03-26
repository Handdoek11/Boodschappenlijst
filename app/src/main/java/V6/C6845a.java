package v6;

import X2.D;
import a6.i;
import d6.InterfaceC5732b;
import h6.AbstractC5844b;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import r6.AbstractC6714f;
import r6.C6709a;
import r6.EnumC6715g;
import t6.AbstractC6805a;

/* renamed from: v6.a, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C6845a extends AbstractC6847c {

    /* renamed from: o, reason: collision with root package name */
    final AtomicReference f44140o;

    /* renamed from: s, reason: collision with root package name */
    final AtomicReference f44141s;

    /* renamed from: t, reason: collision with root package name */
    final ReadWriteLock f44142t;

    /* renamed from: u, reason: collision with root package name */
    final Lock f44143u;

    /* renamed from: v, reason: collision with root package name */
    final Lock f44144v;

    /* renamed from: w, reason: collision with root package name */
    final AtomicReference f44145w;

    /* renamed from: x, reason: collision with root package name */
    long f44146x;

    /* renamed from: y, reason: collision with root package name */
    private static final Object[] f44138y = new Object[0];

    /* renamed from: z, reason: collision with root package name */
    static final C0342a[] f44139z = new C0342a[0];

    /* renamed from: A, reason: collision with root package name */
    static final C0342a[] f44137A = new C0342a[0];

    /* renamed from: v6.a$a, reason: collision with other inner class name */
    static final class C0342a implements InterfaceC5732b, C6709a.InterfaceC0326a {

        /* renamed from: o, reason: collision with root package name */
        final i f44147o;

        /* renamed from: s, reason: collision with root package name */
        final C6845a f44148s;

        /* renamed from: t, reason: collision with root package name */
        boolean f44149t;

        /* renamed from: u, reason: collision with root package name */
        boolean f44150u;

        /* renamed from: v, reason: collision with root package name */
        C6709a f44151v;

        /* renamed from: w, reason: collision with root package name */
        boolean f44152w;

        /* renamed from: x, reason: collision with root package name */
        volatile boolean f44153x;

        /* renamed from: y, reason: collision with root package name */
        long f44154y;

        C0342a(i iVar, C6845a c6845a) {
            this.f44147o = iVar;
            this.f44148s = c6845a;
        }

        void a() {
            if (this.f44153x) {
                return;
            }
            synchronized (this) {
                try {
                    if (this.f44153x) {
                        return;
                    }
                    if (this.f44149t) {
                        return;
                    }
                    C6845a c6845a = this.f44148s;
                    Lock lock = c6845a.f44143u;
                    lock.lock();
                    this.f44154y = c6845a.f44146x;
                    Object obj = c6845a.f44140o.get();
                    lock.unlock();
                    this.f44150u = obj != null;
                    this.f44149t = true;
                    if (obj == null || test(obj)) {
                        return;
                    }
                    b();
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        void b() {
            C6709a c6709a;
            while (!this.f44153x) {
                synchronized (this) {
                    try {
                        c6709a = this.f44151v;
                        if (c6709a == null) {
                            this.f44150u = false;
                            return;
                        }
                        this.f44151v = null;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                c6709a.c(this);
            }
        }

        @Override // d6.InterfaceC5732b
        public void c() {
            if (this.f44153x) {
                return;
            }
            this.f44153x = true;
            this.f44148s.R(this);
        }

        void d(Object obj, long j8) {
            if (this.f44153x) {
                return;
            }
            if (!this.f44152w) {
                synchronized (this) {
                    try {
                        if (this.f44153x) {
                            return;
                        }
                        if (this.f44154y == j8) {
                            return;
                        }
                        if (this.f44150u) {
                            C6709a c6709a = this.f44151v;
                            if (c6709a == null) {
                                c6709a = new C6709a(4);
                                this.f44151v = c6709a;
                            }
                            c6709a.b(obj);
                            return;
                        }
                        this.f44149t = true;
                        this.f44152w = true;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            }
            test(obj);
        }

        @Override // r6.C6709a.InterfaceC0326a, f6.i
        public boolean test(Object obj) {
            return this.f44153x || EnumC6715g.a(obj, this.f44147o);
        }
    }

    C6845a() {
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.f44142t = reentrantReadWriteLock;
        this.f44143u = reentrantReadWriteLock.readLock();
        this.f44144v = reentrantReadWriteLock.writeLock();
        this.f44141s = new AtomicReference(f44139z);
        this.f44140o = new AtomicReference();
        this.f44145w = new AtomicReference();
    }

    public static C6845a O() {
        return new C6845a();
    }

    public static C6845a P(Object obj) {
        return new C6845a(obj);
    }

    @Override // a6.AbstractC0829f
    protected void G(i iVar) {
        C0342a c0342a = new C0342a(iVar, this);
        iVar.d(c0342a);
        if (N(c0342a)) {
            if (c0342a.f44153x) {
                R(c0342a);
                return;
            } else {
                c0342a.a();
                return;
            }
        }
        Throwable th = (Throwable) this.f44145w.get();
        if (th == AbstractC6714f.f42619a) {
            iVar.a();
        } else {
            iVar.onError(th);
        }
    }

    boolean N(C0342a c0342a) {
        C0342a[] c0342aArr;
        C0342a[] c0342aArr2;
        do {
            c0342aArr = (C0342a[]) this.f44141s.get();
            if (c0342aArr == f44137A) {
                return false;
            }
            int length = c0342aArr.length;
            c0342aArr2 = new C0342a[length + 1];
            System.arraycopy(c0342aArr, 0, c0342aArr2, 0, length);
            c0342aArr2[length] = c0342a;
        } while (!D.a(this.f44141s, c0342aArr, c0342aArr2));
        return true;
    }

    public Object Q() {
        Object obj = this.f44140o.get();
        if (EnumC6715g.i(obj) || EnumC6715g.k(obj)) {
            return null;
        }
        return EnumC6715g.h(obj);
    }

    void R(C0342a c0342a) {
        C0342a[] c0342aArr;
        C0342a[] c0342aArr2;
        do {
            c0342aArr = (C0342a[]) this.f44141s.get();
            int length = c0342aArr.length;
            if (length == 0) {
                return;
            }
            int i8 = 0;
            while (true) {
                if (i8 >= length) {
                    i8 = -1;
                    break;
                } else if (c0342aArr[i8] == c0342a) {
                    break;
                } else {
                    i8++;
                }
            }
            if (i8 < 0) {
                return;
            }
            if (length == 1) {
                c0342aArr2 = f44139z;
            } else {
                C0342a[] c0342aArr3 = new C0342a[length - 1];
                System.arraycopy(c0342aArr, 0, c0342aArr3, 0, i8);
                System.arraycopy(c0342aArr, i8 + 1, c0342aArr3, i8, (length - i8) - 1);
                c0342aArr2 = c0342aArr3;
            }
        } while (!D.a(this.f44141s, c0342aArr, c0342aArr2));
    }

    void S(Object obj) {
        this.f44144v.lock();
        this.f44146x++;
        this.f44140o.lazySet(obj);
        this.f44144v.unlock();
    }

    C0342a[] T(Object obj) {
        AtomicReference atomicReference = this.f44141s;
        C0342a[] c0342aArr = f44137A;
        C0342a[] c0342aArr2 = (C0342a[]) atomicReference.getAndSet(c0342aArr);
        if (c0342aArr2 != c0342aArr) {
            S(obj);
        }
        return c0342aArr2;
    }

    @Override // a6.i
    public void a() {
        if (D.a(this.f44145w, null, AbstractC6714f.f42619a)) {
            Object f8 = EnumC6715g.f();
            for (C0342a c0342a : T(f8)) {
                c0342a.d(f8, this.f44146x);
            }
        }
    }

    @Override // a6.i
    public void b(Object obj) {
        AbstractC5844b.e(obj, "onNext called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (this.f44145w.get() != null) {
            return;
        }
        Object l8 = EnumC6715g.l(obj);
        S(l8);
        for (C0342a c0342a : (C0342a[]) this.f44141s.get()) {
            c0342a.d(l8, this.f44146x);
        }
    }

    @Override // a6.i
    public void d(InterfaceC5732b interfaceC5732b) {
        if (this.f44145w.get() != null) {
            interfaceC5732b.c();
        }
    }

    @Override // a6.i
    public void onError(Throwable th) {
        AbstractC5844b.e(th, "onError called with null. Null values are generally not allowed in 2.x operators and sources.");
        if (!D.a(this.f44145w, null, th)) {
            AbstractC6805a.m(th);
            return;
        }
        Object g8 = EnumC6715g.g(th);
        for (C0342a c0342a : T(g8)) {
            c0342a.d(g8, this.f44146x);
        }
    }

    C6845a(Object obj) {
        this();
        this.f44140o.lazySet(AbstractC5844b.e(obj, "defaultValue is null"));
    }
}
