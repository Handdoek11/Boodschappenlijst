package io.ktor.client.call;

import F5.c;
import F5.e;
import I6.l;
import J6.r;
import J6.s;
import N5.v;
import Q6.b;
import S6.h;
import x6.C6933o;
import y6.AbstractC6987o;

/* loaded from: classes2.dex */
public final class NoTransformationFoundException extends UnsupportedOperationException {

    /* renamed from: o, reason: collision with root package name */
    private final String f36741o;

    static final class a extends s implements l {

        /* renamed from: o, reason: collision with root package name */
        public static final a f36742o = new a();

        a() {
            super(1);
        }

        @Override // I6.l
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(C6933o c6933o) {
            r.e(c6933o, "<name for destructuring parameter 0>");
            return ((String) c6933o.a()) + ": " + ((String) c6933o.b()) + '\n';
        }
    }

    public NoTransformationFoundException(c cVar, b bVar, b bVar2) {
        r.e(cVar, "response");
        r.e(bVar, "from");
        r.e(bVar2, "to");
        this.f36741o = h.h("No transformation found: " + bVar + " -> " + bVar2 + "\n        |with response from " + e.d(cVar).k() + ":\n        |status: " + cVar.e() + "\n        |response headers: \n        |" + AbstractC6987o.I(v.f(cVar.a()), null, null, null, 0, null, a.f36742o, 31, null) + "\n    ", null, 1, null);
    }

    @Override // java.lang.Throwable
    public String getMessage() {
        return this.f36741o;
    }
}
