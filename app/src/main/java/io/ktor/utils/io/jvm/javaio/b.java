package io.ktor.utils.io.jvm.javaio;

import J6.r;
import J6.s;
import U6.InterfaceC0745v0;
import java.io.InputStream;
import x6.AbstractC6929k;
import x6.InterfaceC6928j;

/* loaded from: classes2.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private static final InterfaceC6928j f36930a = AbstractC6929k.a(a.f36933o);

    /* renamed from: b, reason: collision with root package name */
    private static final Object f36931b = new Object();

    /* renamed from: c, reason: collision with root package name */
    private static final Object f36932c = new Object();

    static final class a extends s implements I6.a {

        /* renamed from: o, reason: collision with root package name */
        public static final a f36933o = new a();

        a() {
            super(0);
        }

        @Override // I6.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final q7.a invoke() {
            return q7.b.i(io.ktor.utils.io.jvm.javaio.a.class);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final q7.a b() {
        return (q7.a) f36930a.getValue();
    }

    public static final InputStream c(io.ktor.utils.io.f fVar, InterfaceC0745v0 interfaceC0745v0) {
        r.e(fVar, "<this>");
        return new d(interfaceC0745v0, fVar);
    }
}
