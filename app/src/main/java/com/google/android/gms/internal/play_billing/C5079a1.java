package com.google.android.gms.internal.play_billing;

import java.lang.reflect.Field;
import java.security.AccessController;
import java.security.PrivilegedActionException;
import java.security.PrivilegedExceptionAction;
import sun.misc.Unsafe;

/* renamed from: com.google.android.gms.internal.play_billing.a1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C5079a1 extends R0 {

    /* renamed from: a, reason: collision with root package name */
    static final Unsafe f29859a;

    /* renamed from: b, reason: collision with root package name */
    static final long f29860b;

    /* renamed from: c, reason: collision with root package name */
    static final long f29861c;

    /* renamed from: d, reason: collision with root package name */
    static final long f29862d;

    /* renamed from: e, reason: collision with root package name */
    static final long f29863e;

    /* renamed from: f, reason: collision with root package name */
    static final long f29864f;

    /* renamed from: com.google.android.gms.internal.play_billing.a1$a */
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
                f29861c = unsafe.objectFieldOffset(AbstractC5091c1.class.getDeclaredField("t"));
                f29860b = unsafe.objectFieldOffset(AbstractC5091c1.class.getDeclaredField("s"));
                f29862d = unsafe.objectFieldOffset(AbstractC5091c1.class.getDeclaredField("o"));
                f29863e = unsafe.objectFieldOffset(C5085b1.class.getDeclaredField("a"));
                f29864f = unsafe.objectFieldOffset(C5085b1.class.getDeclaredField("b"));
                f29859a = unsafe;
            } catch (NoSuchFieldException e8) {
                throw new RuntimeException(e8);
            }
        } catch (PrivilegedActionException e9) {
            throw new RuntimeException("Could not initialize intrinsics", e9.getCause());
        }
    }

    /* synthetic */ C5079a1(AbstractC5115g1 abstractC5115g1) {
        super(null);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final U0 a(AbstractC5091c1 abstractC5091c1, U0 u02) {
        U0 u03;
        do {
            u03 = abstractC5091c1.f29884s;
            if (u02 == u03) {
                break;
            }
        } while (!e(abstractC5091c1, u03, u02));
        return u03;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final C5085b1 b(AbstractC5091c1 abstractC5091c1, C5085b1 c5085b1) {
        C5085b1 c5085b12;
        do {
            c5085b12 = abstractC5091c1.f29885t;
            if (c5085b1 == c5085b12) {
                break;
            }
        } while (!g(abstractC5091c1, c5085b12, c5085b1));
        return c5085b12;
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final void c(C5085b1 c5085b1, C5085b1 c5085b12) {
        f29859a.putObject(c5085b1, f29864f, c5085b12);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final void d(C5085b1 c5085b1, Thread thread) {
        f29859a.putObject(c5085b1, f29863e, thread);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean e(AbstractC5091c1 abstractC5091c1, U0 u02, U0 u03) {
        return AbstractC5109f1.a(f29859a, abstractC5091c1, f29860b, u02, u03);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean f(AbstractC5091c1 abstractC5091c1, Object obj, Object obj2) {
        return AbstractC5109f1.a(f29859a, abstractC5091c1, f29862d, obj, obj2);
    }

    @Override // com.google.android.gms.internal.play_billing.R0
    final boolean g(AbstractC5091c1 abstractC5091c1, C5085b1 c5085b1, C5085b1 c5085b12) {
        return AbstractC5109f1.a(f29859a, abstractC5091c1, f29861c, c5085b1, c5085b12);
    }
}
