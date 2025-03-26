package com.google.android.gms.internal.ads;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.ads.nj0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C3520nj0 extends AbstractC2541ej0 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f25027a;

    /* renamed from: b, reason: collision with root package name */
    static final long f25028b;

    /* renamed from: c, reason: collision with root package name */
    static final long f25029c;

    /* renamed from: d, reason: collision with root package name */
    static final long f25030d;

    /* renamed from: e, reason: collision with root package name */
    static final long f25031e;

    /* renamed from: f, reason: collision with root package name */
    static final long f25032f;

    /* renamed from: com.google.android.gms.internal.ads.nj0$a */
    class a implements PrivilegedExceptionAction {
        a() {
        }

        @Override // java.security.PrivilegedExceptionAction
        public final /* bridge */ /* synthetic */ Object run() {
            for (Field field : Unsafe.class.getDeclaredFields()) {
                field.setAccessible(true);
                Object obj = field.get(null);
                if (Unsafe.class.isInstance(obj)) {
                    return (Unsafe) Unsafe.class.cast(obj);
                }
            }
            throw new NoSuchFieldError("the Unsafe");
        }
    }

    static {
        Unsafe unsafe;
        try {
            try {
                unsafe = Unsafe.getUnsafe();
            } catch (SecurityException unused) {
                unsafe = (Unsafe) AccessController.doPrivileged(new a());
            }
            try {
                f25029c = unsafe.objectFieldOffset(AbstractC3738pj0.class.getDeclaredField("t"));
                f25028b = unsafe.objectFieldOffset(AbstractC3738pj0.class.getDeclaredField("s"));
                f25030d = unsafe.objectFieldOffset(AbstractC3738pj0.class.getDeclaredField("o"));
                f25031e = unsafe.objectFieldOffset(C3629oj0.class.getDeclaredField("a"));
                f25032f = unsafe.objectFieldOffset(C3629oj0.class.getDeclaredField("b"));
                f25027a = unsafe;
            } catch (NoSuchFieldException e8) {
                throw new RuntimeException(e8);
            }
        } catch (PrivilegedActionException e9) {
            throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
        }
    }

    /* synthetic */ C3520nj0(AbstractC4282uj0 abstractC4282uj0) {
        super(null);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final C2868hj0 a(AbstractC3738pj0 abstractC3738pj0, C2868hj0 c2868hj0) {
        C2868hj0 c2868hj02;
        do {
            c2868hj02 = abstractC3738pj0.f25498s;
            if (c2868hj0 == c2868hj02) {
                break;
            }
        } while (!e(abstractC3738pj0, c2868hj02, c2868hj0));
        return c2868hj02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final C3629oj0 b(AbstractC3738pj0 abstractC3738pj0, C3629oj0 c3629oj0) {
        C3629oj0 c3629oj02;
        do {
            c3629oj02 = abstractC3738pj0.f25499t;
            if (c3629oj0 == c3629oj02) {
                break;
            }
        } while (!g(abstractC3738pj0, c3629oj02, c3629oj0));
        return c3629oj02;
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final void c(C3629oj0 c3629oj0, C3629oj0 c3629oj02) {
        f25027a.putObject(c3629oj0, f25032f, c3629oj02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final void d(C3629oj0 c3629oj0, Thread thread) {
        f25027a.putObject(c3629oj0, f25031e, thread);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean e(AbstractC3738pj0 abstractC3738pj0, C2868hj0 c2868hj0, C2868hj0 c2868hj02) {
        return AbstractC4064sj0.a(f25027a, abstractC3738pj0, f25028b, c2868hj0, c2868hj02);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean f(AbstractC3738pj0 abstractC3738pj0, Object obj, Object obj2) {
        return AbstractC4064sj0.a(f25027a, abstractC3738pj0, f25030d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.ads.AbstractC2541ej0
    final boolean g(AbstractC3738pj0 abstractC3738pj0, C3629oj0 c3629oj0, C3629oj0 c3629oj02) {
        return AbstractC4064sj0.a(f25027a, abstractC3738pj0, f25029c, c3629oj0, c3629oj02);
    }
}
