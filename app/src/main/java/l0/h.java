package L0;

import I0.j;
import J6.r;
import K0.f;
import K0.h;
import L0.d;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.preferences.protobuf.AbstractC0897v;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import x6.C6916E;
import y6.AbstractC6987o;

/* loaded from: classes.dex */
public final class h implements j {

    /* renamed from: a, reason: collision with root package name */
    public static final h f3689a = new h();

    /* renamed from: b, reason: collision with root package name */
    private static final String f3690b = "preferences_pb";

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f3691a;

        static {
            int[] iArr = new int[h.b.values().length];
            iArr[h.b.BOOLEAN.ordinal()] = 1;
            iArr[h.b.FLOAT.ordinal()] = 2;
            iArr[h.b.DOUBLE.ordinal()] = 3;
            iArr[h.b.INTEGER.ordinal()] = 4;
            iArr[h.b.LONG.ordinal()] = 5;
            iArr[h.b.STRING.ordinal()] = 6;
            iArr[h.b.STRING_SET.ordinal()] = 7;
            iArr[h.b.VALUE_NOT_SET.ordinal()] = 8;
            f3691a = iArr;
        }
    }

    private h() {
    }

    private final void d(String str, K0.h hVar, L0.a aVar) {
        h.b X7 = hVar.X();
        switch (X7 == null ? -1 : a.f3691a[X7.ordinal()]) {
            case -1:
                throw new CorruptionException("Value case is null.", null, 2, null);
            case 0:
            default:
                throw new NoWhenBranchMatchedException();
            case 1:
                aVar.i(f.a(str), Boolean.valueOf(hVar.P()));
                return;
            case 2:
                aVar.i(f.c(str), Float.valueOf(hVar.S()));
                return;
            case 3:
                aVar.i(f.b(str), Double.valueOf(hVar.R()));
                return;
            case 4:
                aVar.i(f.d(str), Integer.valueOf(hVar.T()));
                return;
            case 5:
                aVar.i(f.e(str), Long.valueOf(hVar.U()));
                return;
            case 6:
                d.a f8 = f.f(str);
                String V7 = hVar.V();
                r.d(V7, "value.string");
                aVar.i(f8, V7);
                return;
            case 7:
                d.a g8 = f.g(str);
                List M7 = hVar.W().M();
                r.d(M7, "value.stringSet.stringsList");
                aVar.i(g8, AbstractC6987o.e0(M7));
                return;
            case 8:
                throw new CorruptionException("Value not set.", null, 2, null);
        }
    }

    private final K0.h g(Object obj) {
        if (obj instanceof Boolean) {
            AbstractC0897v r8 = K0.h.Y().A(((Boolean) obj).booleanValue()).r();
            r.d(r8, "newBuilder().setBoolean(value).build()");
            return (K0.h) r8;
        }
        if (obj instanceof Float) {
            AbstractC0897v r9 = K0.h.Y().C(((Number) obj).floatValue()).r();
            r.d(r9, "newBuilder().setFloat(value).build()");
            return (K0.h) r9;
        }
        if (obj instanceof Double) {
            AbstractC0897v r10 = K0.h.Y().B(((Number) obj).doubleValue()).r();
            r.d(r10, "newBuilder().setDouble(value).build()");
            return (K0.h) r10;
        }
        if (obj instanceof Integer) {
            AbstractC0897v r11 = K0.h.Y().D(((Number) obj).intValue()).r();
            r.d(r11, "newBuilder().setInteger(value).build()");
            return (K0.h) r11;
        }
        if (obj instanceof Long) {
            AbstractC0897v r12 = K0.h.Y().E(((Number) obj).longValue()).r();
            r.d(r12, "newBuilder().setLong(value).build()");
            return (K0.h) r12;
        }
        if (obj instanceof String) {
            AbstractC0897v r13 = K0.h.Y().F((String) obj).r();
            r.d(r13, "newBuilder().setString(value).build()");
            return (K0.h) r13;
        }
        if (!(obj instanceof Set)) {
            throw new IllegalStateException(r.k("PreferencesSerializer does not support type: ", obj.getClass().getName()));
        }
        AbstractC0897v r14 = K0.h.Y().G(K0.g.N().A((Set) obj)).r();
        r.d(r14, "newBuilder().setStringSet(\n                    StringSet.newBuilder().addAllStrings(value as Set<String>)\n                ).build()");
        return (K0.h) r14;
    }

    @Override // I0.j
    public Object c(InputStream inputStream, A6.d dVar) {
        K0.f a8 = K0.d.f3596a.a(inputStream);
        L0.a b8 = e.b(new d.b[0]);
        Map K7 = a8.K();
        r.d(K7, "preferencesProto.preferencesMap");
        for (Map.Entry entry : K7.entrySet()) {
            String str = (String) entry.getKey();
            K0.h hVar = (K0.h) entry.getValue();
            h hVar2 = f3689a;
            r.d(str, "name");
            r.d(hVar, "value");
            hVar2.d(str, hVar, b8);
        }
        return b8.d();
    }

    @Override // I0.j
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public d a() {
        return e.a();
    }

    public final String f() {
        return f3690b;
    }

    @Override // I0.j
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public Object b(d dVar, OutputStream outputStream, A6.d dVar2) {
        Map a8 = dVar.a();
        f.a N7 = K0.f.N();
        for (Map.Entry entry : a8.entrySet()) {
            N7.A(((d.a) entry.getKey()).a(), g(entry.getValue()));
        }
        ((K0.f) N7.r()).m(outputStream);
        return C6916E.f44463a;
    }
}
