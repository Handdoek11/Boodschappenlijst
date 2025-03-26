package com.google.android.gms.internal.measurement;

import com.google.android.gms.internal.measurement.AbstractC5010r4;
import java.util.Collections;
import java.util.Map;

/* renamed from: com.google.android.gms.internal.measurement.e4, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4901e4 {

    /* renamed from: b, reason: collision with root package name */
    private static volatile C4901e4 f29280b;

    /* renamed from: c, reason: collision with root package name */
    static final C4901e4 f29281c = new C4901e4(true);

    /* renamed from: a, reason: collision with root package name */
    private final Map f29282a = Collections.emptyMap();

    /* renamed from: com.google.android.gms.internal.measurement.e4$a */
    private static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final Object f29283a;

        /* renamed from: b, reason: collision with root package name */
        private final int f29284b;

        a(Object obj, int i8) {
            this.f29283a = obj;
            this.f29284b = i8;
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f29283a == aVar.f29283a && this.f29284b == aVar.f29284b;
        }

        public final int hashCode() {
            return (System.identityHashCode(this.f29283a) * 65535) + this.f29284b;
        }
    }

    private C4901e4(boolean z7) {
    }

    public static C4901e4 a() {
        C4901e4 c4901e4 = f29280b;
        if (c4901e4 != null) {
            return c4901e4;
        }
        synchronized (C4901e4.class) {
            try {
                C4901e4 c4901e42 = f29280b;
                if (c4901e42 != null) {
                    return c4901e42;
                }
                C4901e4 a8 = AbstractC4995p4.a(C4901e4.class);
                f29280b = a8;
                return a8;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final AbstractC5010r4.d b(W4 w42, int i8) {
        androidx.appcompat.app.E.a(this.f29282a.get(new a(w42, i8)));
        return null;
    }
}
