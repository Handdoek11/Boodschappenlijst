package com.google.android.gms.internal.play_billing;

import j$.util.Objects;
import java.util.Locale;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import java.util.logging.Level;
import java.util.logging.Logger;

/* renamed from: com.google.android.gms.internal.play_billing.c1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC5091c1 extends O1 implements InterfaceFutureC5225z1 {

    /* renamed from: u, reason: collision with root package name */
    static final boolean f29879u;

    /* renamed from: v, reason: collision with root package name */
    static final C5220y1 f29880v;

    /* renamed from: w, reason: collision with root package name */
    private static final R0 f29881w;

    /* renamed from: x, reason: collision with root package name */
    private static final Object f29882x;

    /* renamed from: o, reason: collision with root package name */
    private volatile Object f29883o;

    /* renamed from: s, reason: collision with root package name */
    private volatile U0 f29884s;

    /* renamed from: t, reason: collision with root package name */
    private volatile C5085b1 f29885t;

    static {
        boolean z7;
        Throwable th;
        Throwable th2;
        R0 x02;
        try {
            z7 = Boolean.parseBoolean(System.getProperty("guava.concurrent.generate_cancellation_cause", "false"));
        } catch (SecurityException unused) {
            z7 = false;
        }
        f29879u = z7;
        f29880v = new C5220y1(AbstractC5091c1.class);
        AbstractC5115g1 abstractC5115g1 = null;
        try {
            x02 = new C5079a1(abstractC5115g1);
            th2 = null;
            th = null;
        } catch (Error | Exception e8) {
            try {
                th = null;
                th2 = e8;
                x02 = new V0(AtomicReferenceFieldUpdater.newUpdater(C5085b1.class, Thread.class, "a"), AtomicReferenceFieldUpdater.newUpdater(C5085b1.class, C5085b1.class, "b"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5091c1.class, C5085b1.class, "t"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5091c1.class, U0.class, "s"), AtomicReferenceFieldUpdater.newUpdater(AbstractC5091c1.class, Object.class, "o"));
            } catch (Error | Exception e9) {
                th = e9;
                th2 = e8;
                x02 = new X0(abstractC5115g1);
            }
        }
        f29881w = x02;
        if (th != null) {
            C5220y1 c5220y1 = f29880v;
            Logger a8 = c5220y1.a();
            Level level = Level.SEVERE;
            a8.logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "UnsafeAtomicHelper is broken!", th2);
            c5220y1.a().logp(level, "com.google.common.util.concurrent.AbstractFuture", "<clinit>", "SafeAtomicHelper is broken!", th);
        }
        f29882x = new Object();
    }

    protected AbstractC5091c1() {
    }

    private static final Object A(Object obj) {
        if (obj instanceof S0) {
            Throwable th = ((S0) obj).f29815b;
            CancellationException cancellationException = new CancellationException("Task was cancelled.");
            cancellationException.initCause(th);
            throw cancellationException;
        }
        if (obj instanceof T0) {
            throw new ExecutionException(((T0) obj).f29834a);
        }
        if (obj == f29882x) {
            return null;
        }
        return obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static Object s(InterfaceFutureC5225z1 interfaceFutureC5225z1) {
        Throwable a8;
        if (interfaceFutureC5225z1 instanceof Y0) {
            Object obj = ((AbstractC5091c1) interfaceFutureC5225z1).f29883o;
            if (obj instanceof S0) {
                S0 s02 = (S0) obj;
                if (s02.f29814a) {
                    Throwable th = s02.f29815b;
                    obj = th != null ? new S0(false, th) : S0.f29813d;
                }
            }
            Objects.requireNonNull(obj);
            return obj;
        }
        if ((interfaceFutureC5225z1 instanceof O1) && (a8 = ((O1) interfaceFutureC5225z1).a()) != null) {
            return new T0(a8);
        }
        boolean isCancelled = interfaceFutureC5225z1.isCancelled();
        if ((!f29879u) && isCancelled) {
            S0 s03 = S0.f29813d;
            Objects.requireNonNull(s03);
            return s03;
        }
        try {
            Object t7 = t(interfaceFutureC5225z1);
            if (!isCancelled) {
                return t7 == null ? f29882x : t7;
            }
            return new S0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: " + String.valueOf(interfaceFutureC5225z1)));
        } catch (Error e8) {
            e = e8;
            return new T0(e);
        } catch (CancellationException e9) {
            return !isCancelled ? new T0(new IllegalArgumentException("get() threw CancellationException, despite reporting isCancelled() == false: ".concat(String.valueOf(interfaceFutureC5225z1)), e9)) : new S0(false, e9);
        } catch (ExecutionException e10) {
            return isCancelled ? new S0(false, new IllegalArgumentException("get() did not throw CancellationException, despite reporting isCancelled() == true: ".concat(String.valueOf(interfaceFutureC5225z1)), e10)) : new T0(e10.getCause());
        } catch (Exception e11) {
            e = e11;
            return new T0(e);
        }
    }

    private static Object t(Future future) {
        Object obj;
        boolean z7 = false;
        while (true) {
            try {
                obj = future.get();
                break;
            } catch (InterruptedException unused) {
                z7 = true;
            } catch (Throwable th) {
                if (z7) {
                    Thread.currentThread().interrupt();
                }
                throw th;
            }
        }
        if (z7) {
            Thread.currentThread().interrupt();
        }
        return obj;
    }

    private final void u(StringBuilder sb) {
        try {
            Object t7 = t(this);
            sb.append("SUCCESS, result=[");
            if (t7 == null) {
                sb.append("null");
            } else if (t7 == this) {
                sb.append("this future");
            } else {
                sb.append(t7.getClass().getName());
                sb.append("@");
                sb.append(Integer.toHexString(System.identityHashCode(t7)));
            }
            sb.append("]");
        } catch (CancellationException unused) {
            sb.append("CANCELLED");
        } catch (ExecutionException e8) {
            sb.append("FAILURE, cause=[");
            sb.append(e8.getCause());
            sb.append("]");
        } catch (Exception e9) {
            sb.append("UNKNOWN, cause=[");
            sb.append(e9.getClass());
            sb.append(" thrown from get()]");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void v(java.lang.StringBuilder r6) {
        /*
            r5 = this;
            int r0 = r6.length()
            java.lang.String r1 = "PENDING"
            r6.append(r1)
            java.lang.Object r1 = r5.f29883o
            boolean r2 = r1 instanceof com.google.android.gms.internal.play_billing.W0
            java.lang.String r3 = "]"
            if (r2 == 0) goto L21
            java.lang.String r2 = ", setFuture=["
            r6.append(r2)
            com.google.android.gms.internal.play_billing.W0 r1 = (com.google.android.gms.internal.play_billing.W0) r1
            com.google.android.gms.internal.play_billing.z1 r1 = r1.f29851s
            r5.w(r6, r1)
            r6.append(r3)
            goto L4e
        L21:
            java.lang.String r1 = r5.i()     // Catch: java.lang.StackOverflowError -> L30 java.lang.Exception -> L32
            r2 = 0
            if (r1 == 0) goto L2e
            boolean r4 = r1.isEmpty()     // Catch: java.lang.StackOverflowError -> L30 java.lang.Exception -> L32
            if (r4 == 0) goto L41
        L2e:
            r1 = r2
            goto L41
        L30:
            r1 = move-exception
            goto L33
        L32:
            r1 = move-exception
        L33:
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = java.lang.String.valueOf(r1)
            java.lang.String r2 = "Exception thrown from implementation: "
            java.lang.String r1 = r2.concat(r1)
        L41:
            if (r1 == 0) goto L4e
            java.lang.String r2 = ", info=["
            r6.append(r2)
            r6.append(r1)
            r6.append(r3)
        L4e:
            boolean r1 = r5.isDone()
            if (r1 == 0) goto L5e
            int r1 = r6.length()
            r6.delete(r0, r1)
            r5.u(r6)
        L5e:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.play_billing.AbstractC5091c1.v(java.lang.StringBuilder):void");
    }

    private final void w(StringBuilder sb, Object obj) {
        try {
            if (obj == this) {
                sb.append("this future");
            } else {
                sb.append(obj);
            }
        } catch (Exception e8) {
            e = e8;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        } catch (StackOverflowError e9) {
            e = e9;
            sb.append("Exception thrown from implementation: ");
            sb.append(e.getClass());
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void x(AbstractC5091c1 abstractC5091c1, boolean z7) {
        U0 u02;
        U0 u03 = null;
        while (true) {
            for (C5085b1 b8 = f29881w.b(abstractC5091c1, C5085b1.f29874c); b8 != null; b8 = b8.f29876b) {
                Thread thread = b8.f29875a;
                if (thread != null) {
                    b8.f29875a = null;
                    LockSupport.unpark(thread);
                }
            }
            abstractC5091c1.n();
            U0 u04 = u03;
            U0 a8 = f29881w.a(abstractC5091c1, U0.f29838d);
            U0 u05 = u04;
            while (a8 != null) {
                U0 u06 = a8.f29841c;
                a8.f29841c = u05;
                u05 = a8;
                a8 = u06;
            }
            while (u05 != null) {
                Runnable runnable = u05.f29839a;
                u02 = u05.f29841c;
                Objects.requireNonNull(runnable);
                Runnable runnable2 = runnable;
                if (runnable2 instanceof W0) {
                    W0 w02 = (W0) runnable2;
                    abstractC5091c1 = w02.f29850o;
                    if (abstractC5091c1.f29883o == w02) {
                        if (f29881w.f(abstractC5091c1, w02, s(w02.f29851s))) {
                            break;
                        }
                    } else {
                        continue;
                    }
                } else {
                    Executor executor = u05.f29840b;
                    Objects.requireNonNull(executor);
                    y(runnable2, executor);
                }
                u05 = u02;
            }
            return;
            u03 = u02;
        }
    }

    private static void y(Runnable runnable, Executor executor) {
        try {
            executor.execute(runnable);
        } catch (Exception e8) {
            f29880v.a().logp(Level.SEVERE, "com.google.common.util.concurrent.AbstractFuture", "executeListener", "RuntimeException while executing runnable " + String.valueOf(runnable) + " with executor " + String.valueOf(executor), (Throwable) e8);
        }
    }

    private final void z(C5085b1 c5085b1) {
        c5085b1.f29875a = null;
        while (true) {
            C5085b1 c5085b12 = this.f29885t;
            if (c5085b12 != C5085b1.f29874c) {
                C5085b1 c5085b13 = null;
                while (c5085b12 != null) {
                    C5085b1 c5085b14 = c5085b12.f29876b;
                    if (c5085b12.f29875a != null) {
                        c5085b13 = c5085b12;
                    } else if (c5085b13 != null) {
                        c5085b13.f29876b = c5085b14;
                        if (c5085b13.f29875a == null) {
                            break;
                        }
                    } else if (!f29881w.g(this, c5085b12, c5085b14)) {
                        break;
                    }
                    c5085b12 = c5085b14;
                }
                return;
            }
            return;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.O1
    protected final Throwable a() {
        if (!(this instanceof Y0)) {
            return null;
        }
        Object obj = this.f29883o;
        if (obj instanceof T0) {
            return ((T0) obj).f29834a;
        }
        return null;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z7) {
        S0 s02;
        Object obj = this.f29883o;
        if (!(obj instanceof W0) && !(obj == null)) {
            return false;
        }
        if (f29879u) {
            s02 = new S0(z7, new CancellationException("Future.cancel() was called."));
        } else {
            s02 = z7 ? S0.f29812c : S0.f29813d;
            Objects.requireNonNull(s02);
        }
        AbstractC5091c1 abstractC5091c1 = this;
        boolean z8 = false;
        while (true) {
            if (f29881w.f(abstractC5091c1, obj, s02)) {
                x(abstractC5091c1, z7);
                if (!(obj instanceof W0)) {
                    break;
                }
                InterfaceFutureC5225z1 interfaceFutureC5225z1 = ((W0) obj).f29851s;
                if (!(interfaceFutureC5225z1 instanceof Y0)) {
                    interfaceFutureC5225z1.cancel(z7);
                    break;
                }
                abstractC5091c1 = (AbstractC5091c1) interfaceFutureC5225z1;
                obj = abstractC5091c1.f29883o;
                if (!(obj == null) && !(obj instanceof W0)) {
                    break;
                }
                z8 = true;
            } else {
                obj = abstractC5091c1.f29883o;
                if (!(obj instanceof W0)) {
                    return z8;
                }
            }
        }
        return true;
    }

    @Override // com.google.android.gms.internal.play_billing.InterfaceFutureC5225z1
    public final void g(Runnable runnable, Executor executor) {
        U0 u02;
        AbstractC5202v.c(executor, "Executor was null.");
        if (!isDone() && (u02 = this.f29884s) != U0.f29838d) {
            U0 u03 = new U0(runnable, executor);
            do {
                u03.f29841c = u02;
                if (f29881w.e(this, u02, u03)) {
                    return;
                } else {
                    u02 = this.f29884s;
                }
            } while (u02 != U0.f29838d);
        }
        y(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final Object get() {
        Object obj;
        if (Thread.interrupted()) {
            throw new InterruptedException();
        }
        Object obj2 = this.f29883o;
        if ((obj2 != null) && (!(obj2 instanceof W0))) {
            return A(obj2);
        }
        C5085b1 c5085b1 = this.f29885t;
        if (c5085b1 != C5085b1.f29874c) {
            C5085b1 c5085b12 = new C5085b1();
            do {
                R0 r02 = f29881w;
                r02.c(c5085b12, c5085b1);
                if (r02.g(this, c5085b1, c5085b12)) {
                    do {
                        LockSupport.park(this);
                        if (Thread.interrupted()) {
                            z(c5085b12);
                            throw new InterruptedException();
                        }
                        obj = this.f29883o;
                    } while (!((obj != null) & (!(obj instanceof W0))));
                    return A(obj);
                }
                c5085b1 = this.f29885t;
            } while (c5085b1 != C5085b1.f29874c);
        }
        Object obj3 = this.f29883o;
        Objects.requireNonNull(obj3);
        return A(obj3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    protected String i() {
        if (!(this instanceof ScheduledFuture)) {
            return null;
        }
        return "remaining delay=[" + ((ScheduledFuture) this).getDelay(TimeUnit.MILLISECONDS) + " ms]";
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f29883o instanceof S0;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return (this.f29883o != null) & (!(r0 instanceof W0));
    }

    protected void n() {
    }

    protected final boolean o(Object obj) {
        if (obj == null) {
            obj = f29882x;
        }
        if (!f29881w.f(this, null, obj)) {
            return false;
        }
        x(this, false);
        return true;
    }

    protected final boolean p(Throwable th) {
        if (!f29881w.f(this, null, new T0(th))) {
            return false;
        }
        x(this, false);
        return true;
    }

    protected final boolean q(InterfaceFutureC5225z1 interfaceFutureC5225z1) {
        T0 t02;
        Object obj = this.f29883o;
        if (obj == null) {
            if (interfaceFutureC5225z1.isDone()) {
                if (!f29881w.f(this, null, s(interfaceFutureC5225z1))) {
                    return false;
                }
                x(this, false);
                return true;
            }
            W0 w02 = new W0(this, interfaceFutureC5225z1);
            if (f29881w.f(this, null, w02)) {
                try {
                    interfaceFutureC5225z1.g(w02, EnumC5127i1.INSTANCE);
                } catch (Throwable th) {
                    try {
                        t02 = new T0(th);
                    } catch (Error | Exception unused) {
                        t02 = T0.f29833b;
                    }
                    f29881w.f(this, w02, t02);
                }
                return true;
            }
            obj = this.f29883o;
        }
        if (obj instanceof S0) {
            interfaceFutureC5225z1.cancel(((S0) obj).f29814a);
        }
        return false;
    }

    protected final boolean r() {
        Object obj = this.f29883o;
        return (obj instanceof S0) && ((S0) obj).f29814a;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        if (getClass().getName().startsWith("com.google.common.util.concurrent.")) {
            sb.append(getClass().getSimpleName());
        } else {
            sb.append(getClass().getName());
        }
        sb.append('@');
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[status=");
        if (this.f29883o instanceof S0) {
            sb.append("CANCELLED");
        } else if (isDone()) {
            u(sb);
        } else {
            v(sb);
        }
        sb.append("]");
        return sb.toString();
    }

    @Override // java.util.concurrent.Future
    public final Object get(long j8, TimeUnit timeUnit) {
        long nanos = timeUnit.toNanos(j8);
        if (!Thread.interrupted()) {
            Object obj = this.f29883o;
            boolean z7 = true;
            if ((obj != null) & (!(obj instanceof W0))) {
                return A(obj);
            }
            long nanoTime = nanos > 0 ? System.nanoTime() + nanos : 0L;
            if (nanos >= 1000) {
                C5085b1 c5085b1 = this.f29885t;
                if (c5085b1 != C5085b1.f29874c) {
                    C5085b1 c5085b12 = new C5085b1();
                    do {
                        R0 r02 = f29881w;
                        r02.c(c5085b12, c5085b1);
                        if (r02.g(this, c5085b1, c5085b12)) {
                            do {
                                LockSupport.parkNanos(this, Math.min(nanos, 2147483647999999999L));
                                if (!Thread.interrupted()) {
                                    Object obj2 = this.f29883o;
                                    if ((obj2 != null) & (!(obj2 instanceof W0))) {
                                        return A(obj2);
                                    }
                                    nanos = nanoTime - System.nanoTime();
                                } else {
                                    z(c5085b12);
                                    throw new InterruptedException();
                                }
                            } while (nanos >= 1000);
                            z(c5085b12);
                        } else {
                            c5085b1 = this.f29885t;
                        }
                    } while (c5085b1 != C5085b1.f29874c);
                }
                Object obj3 = this.f29883o;
                Objects.requireNonNull(obj3);
                return A(obj3);
            }
            while (nanos > 0) {
                Object obj4 = this.f29883o;
                if ((obj4 != null) & (!(obj4 instanceof W0))) {
                    return A(obj4);
                }
                if (!Thread.interrupted()) {
                    nanos = nanoTime - System.nanoTime();
                } else {
                    throw new InterruptedException();
                }
            }
            String abstractC5091c1 = toString();
            String obj5 = timeUnit.toString();
            Locale locale = Locale.ROOT;
            String lowerCase = obj5.toLowerCase(locale);
            String str = "Waited " + j8 + " " + timeUnit.toString().toLowerCase(locale);
            if (nanos + 1000 < 0) {
                String concat = str.concat(" (plus ");
                long j9 = -nanos;
                long convert = timeUnit.convert(j9, TimeUnit.NANOSECONDS);
                long nanos2 = j9 - timeUnit.toNanos(convert);
                if (convert != 0 && nanos2 <= 1000) {
                    z7 = false;
                }
                if (convert > 0) {
                    String str2 = concat + convert + " " + lowerCase;
                    if (z7) {
                        str2 = str2.concat(",");
                    }
                    concat = str2.concat(" ");
                }
                if (z7) {
                    concat = concat + nanos2 + " nanoseconds ";
                }
                str = concat.concat("delay)");
            }
            if (isDone()) {
                throw new TimeoutException(str.concat(" but future completed as timeout expired"));
            }
            throw new TimeoutException(str + " for " + abstractC5091c1);
        }
        throw new InterruptedException();
    }
}
